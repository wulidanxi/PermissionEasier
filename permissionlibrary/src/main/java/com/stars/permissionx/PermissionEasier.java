package com.stars.permissionx;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public final class PermissionEasier {
    private static final String TAG = "InvisibleFragment";
    public final static PermissionEasier INSTANCE = new PermissionEasier();

    /**
     * Initiate a request that cannot be rejected.
     * @param activity Context
     * @param permissions String[] permissions
     */
    public void requestNoDenied(FragmentActivity activity,String[] permissions){
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        Fragment existedFragment = fragmentManager.findFragmentByTag(TAG);
        InvisibleFragment fragment;
        if (existedFragment != null){
            fragment = (InvisibleFragment) existedFragment;
        }else {
            InvisibleFragment invisibleFragment = new InvisibleFragment();
            fragmentManager.beginTransaction().add(invisibleFragment,TAG).commitNow();
            fragment = invisibleFragment;
        }
        fragment.requestNow(activity,permissions,1);
    }

    /**
     * Initiate a request that can be rejected.
     * @param activity Context
     * @param permissions String[] permissions
     */
    public void request(FragmentActivity activity,String[] permissions){
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        Fragment existedFragment = fragmentManager.findFragmentByTag(TAG);
        InvisibleFragment fragment;
        if (existedFragment != null){
            fragment = (InvisibleFragment) existedFragment;
        }else {
            InvisibleFragment invisibleFragment = new InvisibleFragment();
            fragmentManager.beginTransaction().add(invisibleFragment,TAG).commitNow();
            fragment = invisibleFragment;
        }
        fragment.requestNow(activity,permissions,2);
    }

    private PermissionEasier(){}
}
