package com.example.sampleone.network;

import com.example.sampleone.models.coffee.Coffee;
import com.example.sampleone.models.coffee.CoffeeSearchResponse;
import com.example.sampleone.models.icecream.IceCream;
import com.example.sampleone.models.snacks.Snack;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DoubleOApi {

    //get a list of all snacks
    @GET("snacks")
    Call<List<Snack>> getSnacks();

    //get a list of offered coffee
    @GET("coffee")
    Call<List<Coffee>> getCoffee();

    //get a list of iceCream
    @GET("icecream")
    Call<List<IceCream>> getIceCream();

}
