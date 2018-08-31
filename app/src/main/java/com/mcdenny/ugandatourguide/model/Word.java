package com.mcdenny.ugandatourguide.model;

public class Word {
    private String name;
    private String description;
    private String location;
    private String phone;
    private String website;
    private static final int NO_IMAGE_RESOURCE = -1;
    private int mImageResourceId = NO_IMAGE_RESOURCE;

    public Word() {
    }

    public Word( String name, String description, String location, String phone, String website, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.phone = phone;
        this.website = website;
        this.mImageResourceId = imageResourceId;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * @return boolean value
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_RESOURCE;
    }

}
