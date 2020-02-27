
package com.example.sampleone.models.coffee;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coffee implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("priceInHouse")
    @Expose
    private Integer priceInHouse;
    @SerializedName("priceTakeAway")
    @Expose
    private Integer priceTakeAway;
    @SerializedName("priceExtraShot")
    @Expose
    private Integer priceExtraShot;
    @SerializedName("id")
    @Expose
    private Integer id;
    private final static long serialVersionUID = 5991976454366435341L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Coffee() {
    }

    /**
     * 
     * @param priceExtraShot
     * @param priceInHouse
     * @param imageUrl
     * @param name
     * @param priceTakeAway
     * @param id
     */
    public Coffee(String name, String imageUrl, Integer priceInHouse, Integer priceTakeAway, Integer priceExtraShot, Integer id) {
        super();
        this.name = name;
        this.imageUrl = imageUrl;
        this.priceInHouse = priceInHouse;
        this.priceTakeAway = priceTakeAway;
        this.priceExtraShot = priceExtraShot;
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

    public Integer getPriceInHouse() {
        return priceInHouse;
    }

    public void setPriceInHouse(Integer priceInHouse) {
        this.priceInHouse = priceInHouse;
    }

    public Integer getPriceTakeAway() {
        return priceTakeAway;
    }

    public void setPriceTakeAway(Integer priceTakeAway) {
        this.priceTakeAway = priceTakeAway;
    }

    public Integer getPriceExtraShot() {
        return priceExtraShot;
    }

    public void setPriceExtraShot(Integer priceExtraShot) {
        this.priceExtraShot = priceExtraShot;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
