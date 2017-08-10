package com.example.administrator.nestfragment3;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chris on 2017/8/9.
 * getChildFragmentManager
 *
 * 很奇怪的是这个一定要是 public 不管是v4还是不是 v4
 *
 */

@SuppressLint("ValidFragment")
public class Fragment02 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment02 , null);
        View fragmentLayout = rootView.findViewById(R.id.flFragment02);

        View tv = rootView.findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChildFragmentManager().beginTransaction().add(R.id.flFragment02,new Fragment03(),"b").commit();
            }
        });

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
