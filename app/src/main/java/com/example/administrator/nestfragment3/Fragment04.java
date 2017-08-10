package com.example.administrator.nestfragment3;


import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chris on 2017/8/9.
 * 这个用的是 getFragmentManager 会覆盖这个页面的整个屏幕，getFragmentManager拿到的是这个页面的父fragment，再add的话和这个是平级的（后来发现每个布局里面的FrameLayout的id不一样的时候，就不会这样了，就能自动区别）
 *
 * 很奇怪的是这个一定要是 public 不管是v4还是不是 v4
 */

@SuppressLint("ValidFragment")
public class Fragment04 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment04 , null);
        View fragmentLayout = rootView.findViewById(R.id.flFragment04);

        View tv = rootView.findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().add(R.id.flFragment04,new Fragment01(),"d").commit();
            }
        });

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
