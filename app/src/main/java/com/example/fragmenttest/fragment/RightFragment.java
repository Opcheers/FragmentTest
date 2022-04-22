package com.example.fragmenttest.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmenttest.R;

public class RightFragment extends Fragment {

    private static final String TAG = "RightFragment";


    /**
     * 当碎片和活动建立关联时调用
     * @param context
     */
    @Override
    public void onAttach(@NonNull Context context) {
        Log.d(TAG, "onAttach：碎片和活动建立关联");
        super.onAttach(context);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate...");
    }


    /**
     * 为碎片创建视图（加载布局）时调用
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Log.d(TAG, "onCreateView：为碎片创建视图（加载布局）");
        View view = inflater.inflate(R.layout.fragment_right, container, false);
        return view;
    }

    /**
     * 确保与碎片相关联的活动一定已经创建完毕的时候调用
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated：确保与碎片相关联的活动一定已经创建完毕");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart...");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume...");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause...");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop...");
    }

    /**
     * 当与碎片关联的视图被移除的时候调用
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView：与碎片关联的视图被移除");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy...");
    }

    /**
     * 当碎片和活动解除关联的时候调用
     */
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach：碎片和活动解除关联");
    }
}
