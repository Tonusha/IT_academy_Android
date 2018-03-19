package by.nca.it_academy.work.cw7;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import by.nca.it_academy.R;

/**
 * Created by user on 26.02.2018.
 */

public class TwoFragment extends Fragment {

    private static final String KEY_VALUE = "KEY_VALUE";

    public static TwoFragment getInstance(){
        return new TwoFragment();
    }

    /*public static  getInstance(FragmentManager fragmentManager, int value){
        TwoFragment fragment = (TwoFragment) fragmentManager.findFragmentById(TwoFragment.class.getSimpleName());
        if (fragment == null){
            fragment = new TwoFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_VALUE, value);
        fragment.setArguments(bundle);
        return new TwoFragment();
    }*/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle!=null) {
            int value = bundle.getInt(KEY_VALUE);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return getLayoutInflater().inflate(R.layout.fragment_two, container, false);
        //отвечает за создание view
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // инициализация UI
        //в этом методе гарантировано создано view, рекомендовано писать все этом методе, пред исп для созд вью только





    }
}
