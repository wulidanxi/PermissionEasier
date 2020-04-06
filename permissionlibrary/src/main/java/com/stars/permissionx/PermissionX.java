package com.stars.permissionx;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public final class PermissionX {
    private static final String TAG = "InvisibleFragment";
    public final static PermissionX INSTANCE = new PermissionX();

    /**
     * 发起权限请求，且无法拒绝。
     * @param activity 上下文
     * @param permissions 权限集
     */
    public static void requestNoDenied(FragmentActivity activity,String[] permissions){
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
     * 发起权限请求，可以拒绝。
     * @param activity 上下文
     * @param permissions 权限集
     */
    public static void request(FragmentActivity activity,String[] permissions){
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

    private PermissionX(){}
}
