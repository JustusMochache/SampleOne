package com.example.sampleone.ui;

import com.example.sampleone.models.coffee.Coffee;
import com.example.sampleone.models.icecream.IceCream;
import com.example.sampleone.models.snacks.Snack;

import java.util.List;

public interface HomeView {

    //void showLoading();
    //void hideLoading();
    void onErrorLoading(String message);
    void setSnacks(List<Snack> snacks);
    void setCoffee(List<Coffee> coffees);
    void setSetIceCream(List<IceCream> iceCreams);

}
