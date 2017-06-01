package com.example.user.fraginteraction;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by user on 01.06.17.
 */

public class FirstFragment extends Fragment {

    private FirstFragmentListener mListener;

    interface FirstFragmentListener {

       void showSecondFragment();


    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (FirstFragmentListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException("Error" + FirstFragmentListener.class.getName() );
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        Button button = (Button) view.findViewById(R.id.buttonOne);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.showSecondFragment();

            }
        });
        return view;
    }


}
