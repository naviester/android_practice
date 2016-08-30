package com.example.neilagarwal.fragmentsample;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LifeCycleFragment extends Fragment {

    private String lifyCycleString = "";
    private TextView lifeCycleTextView;

    public LifeCycleFragment() {
        // Required empty public constructor
    }

    /**
     * Returns reference of {@link LifeCycleFragment}
     *
     * @return reference of {@link LifeCycleFragment}
     */
    public static LifeCycleFragment newInstance() {
        LifeCycleFragment lifeCycleFragment = new LifeCycleFragment();
        return lifeCycleFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lifyCycleString = lifyCycleString + "\n" + "onCreate LifeCycleFragment";
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        lifyCycleString = lifyCycleString + "\n" + "onAttach LifeCycleFragment";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        lifyCycleString = lifyCycleString + "\n" + "onCreateView LifeCycleFragment";
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_life_cycle, container, false);
        lifeCycleTextView = (TextView) view.findViewById(R.id.textView);
        lifeCycleTextView.setText(lifyCycleString);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lifyCycleString = lifyCycleString + "\n" + "onViewCreated LifeCycleFragment";
        lifeCycleTextView.setText(lifyCycleString);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lifyCycleString = lifyCycleString + "\n" + "onActivityCreated LifeCycleFragment";
        lifeCycleTextView.setText(lifyCycleString);

    }

    @Override
    public void onStart() {
        super.onStart();
        lifyCycleString = lifyCycleString + "\n" + "onStart LifeCycleFragment";
        lifeCycleTextView.setText(lifyCycleString);
    }

    @Override
    public void onResume() {
        super.onResume();
        lifyCycleString = lifyCycleString + "\n" + "onResume LifeCycleFragment";
        lifeCycleTextView.setText(lifyCycleString);
    }

    @Override
    public void onPause() {
        super.onPause();
        lifyCycleString = lifyCycleString + "\n" + "onPause  LifeCycleFragment";
        lifeCycleTextView.setText(lifyCycleString);
    }

    @Override
    public void onStop() {
        super.onStop();
        lifyCycleString = lifyCycleString + "\n" + " onStop  LifeCycleFragment";
        lifeCycleTextView.setText(lifyCycleString);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        lifyCycleString = lifyCycleString + "\n" + " onDestroy  LifeCycleFragment";
        lifeCycleTextView.setText(lifyCycleString);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        lifyCycleString = lifyCycleString + "\n" + "  onDestroyView  LifeCycleFragment";
        lifeCycleTextView.setText(lifyCycleString);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        lifyCycleString = lifyCycleString + "\n" + "  onDetach  LifeCycleFragment";
        lifeCycleTextView.setText(lifyCycleString);

    }
}
