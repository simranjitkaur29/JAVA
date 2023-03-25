package com.example.fullstack.Model;

import org.springframework.data.annotation.Id;

public class Product {
  @Id
  private String title;

    private  String price;

    private String image;

    private int rating;

    private  boolean isPrime;

    private int reviews;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public int getReviews() {
        return reviews;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
}
