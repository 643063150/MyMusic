package com.zpp.mobile.mymusic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowInsetsController;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.leaf.library.StatusBarUtil;
import com.zpp.mobile.mymusic.databinding.ActivityMainBinding;
import com.zpp.mobile.mymusic.mainfragment.PageAdapter;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;
    PageAdapter pageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        StatusBarUtil.setTransparentForWindow(this);
        setContentView(mainBinding.getRoot());
        setPageAdapter();
    }

    /**
     * 设置首页框架
     */
    public void setPageAdapter(){
        pageAdapter=new PageAdapter(this);
        mainBinding.musicViewpage.setAdapter(pageAdapter);
        mainBinding.musicViewpage.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mainBinding.mainNav.getMenu().getItem(position).setChecked(true);
            }
        });
        mainBinding.mainNav.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    mainBinding.musicViewpage.setCurrentItem(0,false);
                    break;
                case R.id.song_sheet:
                    mainBinding.musicViewpage.setCurrentItem(1,false);
                    break;
                case R.id.list:
                    mainBinding.musicViewpage.setCurrentItem(2,false);
                    break;
                default:
                    break;
            }
            return false;
        });
    }
}