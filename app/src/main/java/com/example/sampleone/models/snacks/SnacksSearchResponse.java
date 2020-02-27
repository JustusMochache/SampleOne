
package com.example.sampleone.models.snacks;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SnacksSearchResponse implements Serializable
{

    @SerializedName("snacks")
    @Expose
    private List<Snack> snacks = null;
    private final static long serialVersionUID = -3981986938960290555L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SnacksSearchResponse() {
    }

    /**
     * 
     * @param snacks
     */
    public SnacksSearchResponse(List<Snack> snacks) {
        super();
        this.snacks = snacks;
    }

    public List<Snack> getSnacks() {
        return snacks;
    }

    public void setSnacks(List<Snack> snacks) {
        this.snacks = snacks;
    }

}
