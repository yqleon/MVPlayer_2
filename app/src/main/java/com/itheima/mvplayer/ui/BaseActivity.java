package com.itheima.mvplayer.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * 类    名: BaseActivity
 * 创 建 者: yqleon
 * 创建时间: 2017/1/15 19:40
 * 更 新 者: $Author$
 * 更新时间: $Date$
 * 描    述: 封装Activity的通用功能，相当于Activity的小框架。有利于代码扩展性
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());//子类调用时实现抽象方法，返回其对应的xml布局
        ButterKnife.bind(this);

        init();
    }

    //子类需要初始化时复写
    //Activity通用的初始化
    protected  void init() {

    };

    //抽象方法，子类必实现之.返回一个布局的资源ID
    public abstract int getLayoutResId();

}
