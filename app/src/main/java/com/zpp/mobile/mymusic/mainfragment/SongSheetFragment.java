package com.zpp.mobile.mymusic.mainfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.zpp.mobile.mymusic.databinding.SongsheetGragmentBinding;

/**
 * @ProjectName: MyMusic
 * @Package: com.zpp.mobile.mymusic.mainfragment
 * @ClassName: SongSheetFragment
 * @Description:
 * @Author: zpp
 * @CreateDate: 2023/3/3 15:15
 * @UpdateUser:
 * @UpdateDate: 2023/3/3 15:15
 * @UpdateRemark:
 */
public class SongSheetFragment extends Fragment {
    SongsheetGragmentBinding songsheetGragmentBinding;

    public static SongSheetFragment getInstance() {
        SongSheetFragment homeFragment = new SongSheetFragment();
        return homeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        songsheetGragmentBinding = SongsheetGragmentBinding.inflate(inflater, container, false);
        return songsheetGragmentBinding.getRoot();
    }
}
