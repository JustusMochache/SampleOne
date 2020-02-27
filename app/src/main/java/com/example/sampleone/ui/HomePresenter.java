package com.example.sampleone.ui;

import androidx.annotation.NonNull;

import com.example.sampleone.Utils;
import com.example.sampleone.models.coffee.Coffee;
import com.example.sampleone.models.coffee.CoffeeSearchResponse;
import com.example.sampleone.models.icecream.IceCream;
import com.example.sampleone.models.snacks.Snack;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePresenter {

    private HomeView view;
    private static final String TAG = "HomePresenter";

    public HomePresenter(HomeView view) {
        this.view = view;
    }

    void getSnacks(){

        Call<List<Snack>> snackCall = Utils.getApi().getSnacks();

        snackCall.enqueue(new Callback<List<Snack>>() {
            @Override
            public void onResponse(@NonNull Call<List<Snack>> call, @NonNull Response<List<Snack>> response) {
                if(response.isSuccessful() && response.body()!=null){
                    view.setSnacks(response.body());
                } else {
                    view.onErrorLoading(response.message());
                }

            }

            @Override
            public void onFailure(@NonNull Call<List<Snack>> call, @NonNull Throwable t) {
                view.onErrorLoading(t.getLocalizedMessage());

            }
        });
    }

    void getCoffee(){

        Call<List<Coffee>> coffeeCall = Utils.getApi().getCoffee();

        coffeeCall.enqueue(new Callback<List<Coffee>>() {
            @Override
            public void onResponse(@NonNull Call<List<Coffee>> call, @NonNull Response<List<Coffee>> response) {

                if(response.isSuccessful() && response.body()!=null){
                    view.setCoffee(response.body());
                } else {
                    view.onErrorLoading(response.message());
                }

            }

            @Override
            public void onFailure(@NonNull Call<List<Coffee>> call, @NonNull Throwable t) {

                view.onErrorLoading(t.getLocalizedMessage());

            }
        });
    }

    void getIceCream(){
        Call<List<IceCream>> searchResponseCall = Utils.getApi().getIceCream();

        searchResponseCall.enqueue(new Callback<List<IceCream>>() {
            @Override
            public void onResponse(Call<List<IceCream>> call, Response<List<IceCream>> response) {

                if(response.isSuccessful()&& response.body()!=null){
                    view.setSetIceCream(response.body());
                } else {
                    view.onErrorLoading(response.message());
                }
            }

            @Override
            public void onFailure(Call<List<IceCream>> call, Throwable t) {

                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }


}
