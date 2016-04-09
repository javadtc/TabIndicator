package com.gaolonglong.app.tabindicator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/**
 * Created by Admin on 2016/4/6.
 */
public class HomeFragment extends Fragment {

    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null){
            Log.e("666","HomeFragment");
            rootView = inflater.inflate(R.layout.home_fragment, container, false);
        }
        ViewGroup parent = (ViewGroup) rootView.getParent();
        if (parent != null){
            parent.removeView(rootView);
        }
        return rootView;
    }
}
