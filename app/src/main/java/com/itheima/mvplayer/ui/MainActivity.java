package com.itheima.mvplayer.ui;

import com.itheima.mvplayer.R;

public class MainActivity extends BaseActivity {

    //继承的AppCompatActivity改为BaseActivity,
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/
    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

}
