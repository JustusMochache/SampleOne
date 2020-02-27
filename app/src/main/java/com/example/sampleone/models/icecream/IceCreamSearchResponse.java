
package com.example.sampleone.models.icecream;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IceCreamSearchResponse implements Serializable
{

    @SerializedName("IceCream")
    @Expose
    private List<IceCream> iceCream = null;
    private final static long serialVersionUID = -5826403454276321584L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IceCreamSearchResponse() {
    }

    /**
     * 
     * @param iceCream
     */
    public IceCreamSearchResponse(List<IceCream> iceCream) {
        super();
        this.iceCream = iceCream;
    }

    public List<IceCream> getIceCream() {
        return iceCream;
    }

    public void setIceCream(List<IceCream> iceCream) {
        this.iceCream = iceCream;
    }

}
