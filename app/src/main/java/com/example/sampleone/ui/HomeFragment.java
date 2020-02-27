package com.example.sampleone.ui;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sampleone.R;
import com.example.sampleone.adapter.CustomRecyclerAdapter;
import com.example.sampleone.models.coffee.Coffee;
import com.example.sampleone.models.icecream.IceCream;
import com.example.sampleone.models.snacks.Snack;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements HomeView {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    HomePresenter presenter;


    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2){
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        presenter = new HomePresenter(this);
        presenter.getSnacks();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onErrorLoading(String message) {

    }

    @Override
    public void setSnacks(List<Snack> snacks) {
        RecyclerView mRecyclerView = getView().findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());

        mRecyclerView.setLayoutManager(linearLayoutManager);
        CustomRecyclerAdapter customRecyclerAdapter = new CustomRecyclerAdapter(snacks, getActivity());
        mRecyclerView.setAdapter(customRecyclerAdapter);

        customRecyclerAdapter.notifyDataSetChanged();

    }

    @Override
    public void setCoffee(List<Coffee> coffees) {

    }

    @Override
    public void setSetIceCream(List<IceCream> iceCreams) {

    }
}
