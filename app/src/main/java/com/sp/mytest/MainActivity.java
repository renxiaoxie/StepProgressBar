package com.sp.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<MyStepProgressBarBean> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyStepProgressBar viewById = findViewById(R.id.mt_test);
        datas = new ArrayList<>();
        datas.add(new MyStepProgressBarBean("预售开始", "3/10"));
        datas.add(new MyStepProgressBarBean("预售结束", "5/12"));
        datas.add(new MyStepProgressBarBean("产地摘果", "8/16"));
        datas.add(new MyStepProgressBarBean("预计到达", "10/17"));
        datas.add(new MyStepProgressBarBean("收货时间", "12/17"));
        viewById.setDatas(datas);
        viewById.setSelIndex(1);
    }
}
