
package com.example.sampleone.models.coffee;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoffeeSearchResponse implements Serializable
{

    @SerializedName("coffee")
    @Expose
    private List<Coffee> coffee = null;
    private final static long serialVersionUID = 3646022235842842195L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CoffeeSearchResponse() {
    }

    /**
     * 
     * @param coffee
     */
    public CoffeeSearchResponse(List<Coffee> coffee) {
        super();
        this.coffee = coffee;
    }

    public List<Coffee> getCoffee() {
        return coffee;
    }

    public void setCoffee(List<Coffee> coffee) {
        this.coffee = coffee;
    }

}
