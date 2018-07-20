package com.example.student.lionmarket;

public class GameModel {
    private String imgUrl;
    private String name;
    private String price;
    private String type;
    private int raiting;
    boolean isLiked = false;
    boolean isInBin = false;

    public GameModel(String imgUrl, String name, String price, String type, int raiting) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.raiting = raiting;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}
