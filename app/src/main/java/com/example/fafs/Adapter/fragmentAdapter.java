package com.example.fafs.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fafs.fragment.fauna;
import com.example.fafs.fragment.flora;

public class fragmentAdapter extends FragmentPagerAdapter {
    public fragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new flora();
            case 1:
                return new fauna();
            default:
                return new flora();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position==0){
            title="FLORA";
        }
       else{
            title="FAUNA";
        }
        return title;
    }
}
