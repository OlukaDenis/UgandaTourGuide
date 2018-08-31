package com.mcdenny.ugandatourguide.model;

public class University {
    private String name;
    private String description;
    private String website;
    private int mImageResourceId;

    public University() {
    }

    public University(String name, String description, String website, int mImageResourceId) {
        this.name = name;
        this.description = description;
        this.website = website;
        this.mImageResourceId = mImageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
