package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmenttest.fragment.AnotherRightFragment;
import com.example.fragmenttest.fragment.RightFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Button button = this.findViewById(R.id.button);
//        button.setOnClickListener(this);
//        replaceFragment(new RightFragment());
    }
//
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.button:
//                replaceFragment(new AnotherRightFragment());
//                break;
//            default:
//                break;
//        }
//    }
//
//    /**
//     * 动态添加碎片步骤
//     * 1.创建待添加碎片实例
//     * 2.获取FragmentManager
//     * 3.开启一个事务fragmentManager.beginTransaction()
//     * 4.向容器内添加或调换碎片transaction.replace()
//     * 5.提交事务transaction.commit()
//     * @param fragment
//     */
//    private void replaceFragment(Fragment fragment) {
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.right_layout, fragment);
//        transaction.addToBackStack(null);//将事务添加到返回栈中
//        transaction.commit();
//    }
}