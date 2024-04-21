package com.example.courseapp.Domain;

public class CoursesDomain {
    private String Title;
    private double price;
    private String picPath;

    public CoursesDomain(String title, double price, String picPath) {
        Title = title;
        this.price = price;
        this.picPath = picPath;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
