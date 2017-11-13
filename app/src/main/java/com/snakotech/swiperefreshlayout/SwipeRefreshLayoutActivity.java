package com.snakotech.swiperefreshlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snakotech.R;

import java.util.ArrayList;
import java.util.List;

public class SwipeRefreshLayoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiperefreshlayout);
        init();
    }

    private void init() {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        RecyclerView mRecyclerView = findViewById(R.id.swipe_refresh_layout_recyclerview);
        mRecyclerView.setAdapter(new IRecyclerViewAdapter(list));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(SwipeRefreshLayoutActivity.this));




    }
    class IRecyclerViewAdapter extends RecyclerView.Adapter<IRecyclerViewAdapter.MyViewHolder>{

        List<String> list;

        public IRecyclerViewAdapter(List<String> list) {
            this.list = list;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_recyclerview_item,parent,false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.init(list.get(position));


        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            TextView textView;
            public MyViewHolder(View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.viewholder_tv);
                textView.getTag();
            }

            public void init(String s) {
                textView.setText(s);
            }
        }

    }
}
