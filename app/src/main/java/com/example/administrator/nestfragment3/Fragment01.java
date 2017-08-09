package com.example.administrator.nestfragment3;


import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chris on 2017/8/9.
 * getChildFragmentManager
 *
 * 很奇怪的是这个一定要是 public 不管是v4还是不是 v4
 * 不是 v4包的，没有 getChildFragmentManager 的方法，只有 getFragmentManager， 会造成add 的 Fragment覆盖在这个页面的整个屏幕，getFragmentManager拿到的是这个页面的父fragment，再add的话和这个是平级的，区域和这个是一模一样的
 */

@SuppressLint("ValidFragment")
public class Fragment01 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment01 , null);
        View fragmentLayout = rootView.findViewById(R.id.fl);

        View tv = rootView.findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChildFragmentManager().beginTransaction().add(R.id.fl,new Fragment02(),"a").commit();
            }
        });

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
