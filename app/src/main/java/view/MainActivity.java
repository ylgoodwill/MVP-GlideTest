package view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.yan_zhe.mvp_rxjavatest.R;

import presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements IMainView {


    private ListView listView;
    private MainActivityPresenter presenter = new MainActivityPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        listViewShow();

    }

    public void listViewShow() {
        presenter.setAdapter();
    }

    @Override
    public ListView getListView() {
        return listView;
    }
}
