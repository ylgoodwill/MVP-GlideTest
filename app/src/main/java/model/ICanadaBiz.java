package model;

import android.widget.BaseAdapter;

import view.IMainView;

/**
 * Created by yan_zhe on 2017/6/27.
 */

public interface ICanadaBiz {
    BaseAdapter getAdapter(Canada canada, IMainView mainView);
}
