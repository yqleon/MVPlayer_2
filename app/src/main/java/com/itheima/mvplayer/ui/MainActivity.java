package com.itheima.mvplayer.ui;

import com.itheima.mvplayer.R;
//继承AppCompatActivity改为继承BaseActivity,
public class MainActivity extends BaseActivity {
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/
    //给父类onCreat方法返回布局地址.抽取基类的初始化方式
    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

}
