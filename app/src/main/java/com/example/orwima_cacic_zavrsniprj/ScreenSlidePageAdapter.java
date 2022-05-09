package com.example.orwima_cacic_zavrsniprj;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.Locale;

public class ScreenSlidePageAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_PAGES = 2;
    private static final String BASE_NAME = "Tab #%d";
    private CalendarFragment calendarFragment;
    private CheckListFragment checklistFragment;
    public ScreenSlidePageAdapter(FragmentManager fm) {
        super(fm);
        calendarFragment =new CalendarFragment();
        checklistFragment =new CheckListFragment();
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return checklistFragment;
            case 1:
                return calendarFragment;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return String.format(Locale.getDefault(), BASE_NAME, position + 1);
    }
    @Override
    public int getCount() {
        return NUM_PAGES;
    }


}
