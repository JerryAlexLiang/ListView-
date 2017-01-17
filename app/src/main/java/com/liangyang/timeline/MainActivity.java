package com.liangyang.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.liangyang.timeline.adapter.ExpressAdapter;
import com.liangyang.timeline.bean.Express;

import java.util.ArrayList;
import java.util.List;

/**
 * 用listView实现时光轴功能
 */
public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Express> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化视图
        mListView = (ListView) findViewById(R.id.lv);
        //加载数据
        initData();
        //声明适配器
        ExpressAdapter adapter = new ExpressAdapter(MainActivity.this,dataList);
        //绑定适配器
        mListView.setAdapter(adapter);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        dataList.add(new Express("您的订单开始处理","2016-09-18 08:33:50"));
        dataList.add(new Express("您的订单待配货","2016-09-18 08:40:23"));
        dataList.add(new Express("您的包裹已出库","2016-09-18 08:51:33"));
        dataList.add(new Express("【深圳市龙华函件中心】已收寄","2016-09-18 21:12:53"));
        dataList.add(new Express("到达【深圳】","2016-09-18 17:44:20"));
        dataList.add(new Express("离开【深圳市龙华函件中心】，下一站【深圳市】","2016-09-18 21:26:51"));
        dataList.add(new Express("到达【深圳市处理中心】","2016-09-18 23:18:21"));
        dataList.add(new Express("离开【深圳市处理中心】，下一站【广州市】","2016-09-19 01:14:30"));
        dataList.add(new Express("到达【广东省广州邮件处理中心】","2016-09-19 04:42:11"));
    }
}
