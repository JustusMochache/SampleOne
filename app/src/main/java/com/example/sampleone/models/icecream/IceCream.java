
package com.example.sampleone.models.icecream;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IceCream implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("syrupNameOne")
    @Expose
    private String syrupNameOne;
    @SerializedName("syrupNameTwo")
    @Expose
    private String syrupNameTwo;
    @SerializedName("syrupNameThree")
    @Expose
    private String syrupNameThree;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("id")
    @Expose
    private Integer id;
    private final static long serialVersionUID = -3991358429072262253L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IceCream() {
    }

    /**
     * 
     * @param syrupNameThree
     * @param syrupNameTwo
     * @param price
     * @param imageUrl
     * @param name
     * @param syrupNameOne
     * @param id
     */
    public IceCream(String name, String imageUrl, String syrupNameOne, String syrupNameTwo, String syrupNameThree, Integer price, Integer id) {
        super();
        this.name = name;
        this.imageUrl = imageUrl;
        this.syrupNameOne = syrupNameOne;
        this.syrupNameTwo = syrupNameTwo;
        this.syrupNameThree = syrupNameThree;
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

    public String getSyrupNameOne() {
        return syrupNameOne;
    }

    public void setSyrupNameOne(String syrupNameOne) {
        this.syrupNameOne = syrupNameOne;
    }

    public String getSyrupNameTwo() {
        return syrupNameTwo;
    }

    public void setSyrupNameTwo(String syrupNameTwo) {
        this.syrupNameTwo = syrupNameTwo;
    }

    public String getSyrupNameThree() {
        return syrupNameThree;
    }

    public void setSyrupNameThree(String syrupNameThree) {
        this.syrupNameThree = syrupNameThree;
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
