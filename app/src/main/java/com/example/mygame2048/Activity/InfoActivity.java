package com.example.mygame2048.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.mygame2048.R;


/**
 * Created by longlong on 2015/4/27.
 */
public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initToolbar();
    }

    //初始化toolbar
    private void initToolbar() {
        //绑定toolbar
        Toolbar mToolbar = findViewById(R.id.toolbar);
        //找到toolbar标签
        TextView mToolBarTextView = findViewById(R.id.text_view_toolbar_title);
        //将toolbar放到页面顶部
        setSupportActionBar(mToolbar);
        //设置左上角的图标可以点击
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeButtonEnabled(true);
            //左上角返回图标
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            //使自定义的普通View能在title栏显示
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        mToolBarTextView.setText("关于我的");
        mToolbar.setNavigationIcon(R.drawable.btn_back);
        //给返回的按钮设置点击监听
        mToolbar.setNavigationOnClickListener(v -> {
            //此函数系统原有  使用结束当前页面
            onBackPressed();
        });
    }
}
