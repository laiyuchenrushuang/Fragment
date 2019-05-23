package demo.hc.com.bindview;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ly on 2019/5/23.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    List<Fragment> mList;
    FragmentManager manager;
    public FragmentAdapter(FragmentManager manage, ArrayList<Fragment> listF) {
        super(manage);
        this.mList = listF;
        this.manager = manage;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }
}
