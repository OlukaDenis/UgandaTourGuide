package com.mcdenny.ugandatourguide.model;

/**
 * Created by McDenny on 9/11/2018.
 */

public class Parks {
    private String pName;
    private String pDescription;
    private int pImageResource;

    public Parks() {
    }

    public Parks(String pName, String pDescription, int pImageResource) {
        this.pName = pName;
        this.pDescription = pDescription;
        this.pImageResource = pImageResource;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public int getpImageResource() {
        return pImageResource;
    }

    public void setpImageResource(int pImageResource) {
        this.pImageResource = pImageResource;
    }
}
