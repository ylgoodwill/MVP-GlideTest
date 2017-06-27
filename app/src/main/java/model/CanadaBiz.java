package model;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.yan_zhe.mvp_rxjavatest.R;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import util.Util;
import view.IMainView;

/**
 * Created by yan_zhe on 2017/6/27.
 */

public class CanadaBiz implements ICanadaBiz {

    public ArrayList<Canada.RowsBean> arrayList;
    public Activity mainView;


    public BaseAdapter getAdapter(Canada canada, IMainView mainView) {
        arrayList = (ArrayList<Canada.RowsBean>) canada.getRows();
        this.mainView = (Activity) mainView;
        return new MyAdapter((Context) mainView);
    }


    public void loadPic(String s, final ImageView view) {
        Util.sendHttpRuquest(s, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                final String pic = response.body().string();
                mainView.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Glide.with(mainView).load(pic).into(view);
                    }
                });
            }
        });
    }

    class MyAdapter extends BaseAdapter {
        Context context;

        MyAdapter(Context context) {

            this.context = context;
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return arrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Canada.RowsBean rowsBean = arrayList.get(position);
            View v;
            ViewHolder viewHolder;
            if (convertView == null) {
                v = LayoutInflater.from(context).inflate(R.layout.listview_item, parent, false);
                viewHolder = new ViewHolder();
                viewHolder.title = (TextView) v.findViewById(R.id.title);
                viewHolder.description = (TextView) v.findViewById(R.id.description);
                viewHolder.image = (ImageView) v.findViewById(R.id.image);
                v.setTag(viewHolder);
            } else {
                v = convertView;
                viewHolder = (ViewHolder) v.getTag();
            }
            if (rowsBean.getTitle() != null) {
                viewHolder.title.setVisibility(View.VISIBLE);
                viewHolder.title.setText(rowsBean.getTitle());
                viewHolder.title.setTextSize(16);
            } else
                viewHolder.title.setVisibility(View.GONE);

            if (rowsBean.getDescription() != null) {
                viewHolder.description.setVisibility(View.VISIBLE);
                viewHolder.description.setText(rowsBean.getDescription());
            } else
                viewHolder.description.setVisibility(View.GONE);

            if (rowsBean.getImageHref() != null) {
                viewHolder.image.setVisibility(View.VISIBLE);
                loadPic(rowsBean.getImageHref(), viewHolder.image);
            } else {
                viewHolder.image.setVisibility(View.GONE);
            }
            return v;
        }

        class ViewHolder {
            TextView title;
            TextView description;
            ImageView image;
        }

    }
}
