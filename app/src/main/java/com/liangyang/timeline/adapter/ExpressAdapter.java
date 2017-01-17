package com.liangyang.timeline.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.liangyang.timeline.R;
import com.liangyang.timeline.bean.Express;

import java.util.List;

/**
 * 创建日期：2017/1/17 on 11:02
 * 作者:杨亮 liangyang
 * 描述:ListView的适配器
 */
public class ExpressAdapter extends BaseAdapter {

    private Context mContext;
    private List<Express> dataList;
    private LayoutInflater mLayoutInflater;

    public ExpressAdapter(Context mContext, List<Express> dataList) {
        this.mContext = mContext;
        this.dataList = dataList;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return dataList == null ? 0 : dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList == null ? null : dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder = null;
        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.time_item, parent, false);
            viewHolder = new ViewHolder(view);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        //数据映射
        Express express = dataList.get(position);
        viewHolder.tv_content.setText(express.getContent());
        viewHolder.tv_time.setText(express.getTime());
        return view;
    }

    class ViewHolder {

        public TextView tv_content, tv_time;

        public ViewHolder(View view) {
            view.setTag(this);
            tv_content = (TextView) view.findViewById(R.id.tv_content);
            tv_time = (TextView) view.findViewById(R.id.tv_time);
        }
    }
}
