//IM/2020/087 - started
package com.app.clothshop;

public class HomeVerModel {
    int image;
    String name;
    String rating;
    String price;
    String color;

    public HomeVerModel(int image, String name, String rating, String price, String color) {
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
//IM/2020/087 - ended