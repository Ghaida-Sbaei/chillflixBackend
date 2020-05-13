package com.capgemini.movieApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private Integer rating;
    private Integer year;
    private String movieUrl;
    private String desc;
    private String videoId;
    @ManyToOne
    private Category category;

    public Movie() {
    }

    public Movie(Long id, String title, Integer rating, Integer year, String movieUrl, String desc, String videoId, Category category) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.year = year;
        this.movieUrl = movieUrl;
        this.desc = desc;
        this.videoId = videoId;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
