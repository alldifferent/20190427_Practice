package com.alldi.a20190427_practice.datas;

public class PizzaStore {

    public String storeName;
    public String location;
    public String openTime;
    public String imageURL; // 웹상에 있는 이미지의 주소

    public PizzaStore(String storeName, String location, String openTime, String imageURL) {
        this.storeName = storeName;
        this.location = location;
        this.openTime = openTime;
        this.imageURL = imageURL;
    }
}
