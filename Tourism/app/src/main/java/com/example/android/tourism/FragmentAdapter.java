package com.example.android.tourism;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SchoolsFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new historicFragment();
        } else {
            return new FamousFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.app_schools);
        } else if (position == 1) {
            return mContext.getString(R.string.app_parks);
        } else if (position == 2) {
            return mContext.getString(R.string.app_historic);
        } else {
            return mContext.getString(R.string.app_famous);
        }
    }
}
