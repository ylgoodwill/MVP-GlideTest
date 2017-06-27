package presenter;

import android.content.Context;
import android.widget.ListView;

import model.Canada;
import model.CanadaBiz;
import model.ICanadaBiz;
import util.Util;
import view.IMainView;

/**
 * Created by yan_zhe on 2017/6/27.
 */

public class MainActivityPresenter {
    private IMainView activity;
    private ICanadaBiz canadaBiz;
    private Canada canada;

    public MainActivityPresenter(IMainView activity) {
        this.activity = activity;
        this.canadaBiz = new CanadaBiz();
    }

    public void setAdapter() {
        ListView l = activity.getListView();
        canada = Util.parseFromGson((Context) activity);
        l.setAdapter(canadaBiz.getAdapter(canada,activity));
    }


}
