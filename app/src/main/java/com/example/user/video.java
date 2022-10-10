package com.example.user;

public class video {
    private int image;
    private int video;
    private String name,title;

    public video(int image, int video, String name, String title) {
        this.image = image;
        this.video = video;
        this.name = name;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }
}
