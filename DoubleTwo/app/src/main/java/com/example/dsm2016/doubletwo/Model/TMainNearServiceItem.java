package com.example.dsm2016.doubletwo.Model;

public class TMainNearServiceItem {
    private String likes, title, intro, name, personNum, startDate, endDate, location,picture;

    public TMainNearServiceItem () {}

    public TMainNearServiceItem(String likes, String title, String intro, String name, String personNum,
                                String startDate, String endDate, String location, String picture) {
        this.likes = likes;
        this.title = title;
        this.intro = intro;
        this.name = name;
        this.personNum = personNum;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.picture = picture;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonNum() {
        return personNum;
    }

    public void setPersonNum(String personNum) {
        this.personNum = personNum;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
