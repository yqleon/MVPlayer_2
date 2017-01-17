package com.itheima.mvplayer.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * 类    名: BaseFragment
 * 创 建 者: yqleon
 * 创建时间: 2017/1/15 14:42
 * 更 新 者: $Author$
 * 更新时间: $Date$
 * 描    述: ${TODO}
 */

public abstract class BaseFragment extends Fragment{
    @Nullable
    @Override//返回布局
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(getLayoutResId(),null);
        //fragement的绑定
        ButterKnife.bind(this,root);
        init();
        return root;//super.onCreateView(inflater, container, savedInstanceState);
    }

    private void init() {

    }

    public abstract int getLayoutResId();
}
