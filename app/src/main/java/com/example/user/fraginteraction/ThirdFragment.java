package com.example.user.fraginteraction;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 01.06.17.
 */

public class ThirdFragment extends Fragment {

    private ThirdFragmentListener mListener;

    interface ThirdFragmentListener {
        void ThirdFragmentListener ();
    }




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (ThirdFragmentListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException("Error" + ThirdFragmentListener.class.getName() );
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        return view;
    }


}

