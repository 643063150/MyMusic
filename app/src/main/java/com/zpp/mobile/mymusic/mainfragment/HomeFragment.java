package com.zpp.mobile.mymusic.mainfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zpp.mobile.mymusic.R;
import com.zpp.mobile.mymusic.databinding.HomeFragmentBinding;

/**
 * @ProjectName: MyMusic
 * @Package: com.zpp.mobile.mymusic.mainfragment
 * @ClassName: HomeFragment
 * @Description:
 * @Author: zpp
 * @CreateDate: 2023/3/3 15:14
 * @UpdateUser:
 * @UpdateDate: 2023/3/3 15:14
 * @UpdateRemark:
 */
public class HomeFragment extends Fragment {
    HomeFragmentBinding homeFragmentBinding;

    public static HomeFragment getInstance() {
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        homeFragmentBinding = HomeFragmentBinding.inflate(inflater, container, false);
        return homeFragmentBinding.getRoot();
    }
}
