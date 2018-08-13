package com.hunter.practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity  implements BottomNavigationBar.OnTabSelectedListener{

    private final String TAG = "MainActivity";
    @BindView(R.id.frament_container)
    LinearLayout mFramentContainer;
    @BindView(R.id.bottom_bar)
    BottomNavigationBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mBottomBar = findViewById(R.id.bottom_bar);
        mBottomBar.setMode(BottomNavigationBar.MODE_FIXED);// 设置显示样式
        mBottomBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);// 设置背景样式
        mBottomBar.addItem(new BottomNavigationItem(R.drawable.tabbar_home, R.string.home))
                .addItem(new BottomNavigationItem(R.drawable.tabbar_news, R.string.message))
                .addItem(new BottomNavigationItem(R.drawable.tabbar_mine, R.string.mine))
                .addItem(new BottomNavigationItem(R.drawable.tabbar_setting, R.string.settings))
                .setActiveColor(R.color.red).setInActiveColor(R.color.lightsalmon)// 设置icon颜色
                .setBarBackgroundColor(R.color.white)// 设置背景色
                .setFirstSelectedPosition(0)//设置默认选择item
                .initialise();//初始化
        mBottomBar.setTabSelectedListener(this);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onTabSelected(int position) {

    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }


}
