
package com.example.sampleone.models.snacks;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Snack implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("id")
    @Expose
    private Integer id;
    private final static long serialVersionUID = -5793831674502637851L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Snack() {
    }

    /**
     * 
     * @param price
     * @param imageUrl
     * @param name
     * @param id
     */
    public Snack(String name, String imageUrl, Integer price, Integer id) {
        super();
        this.name = name;
        this.imageUrl = imageUrl;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
