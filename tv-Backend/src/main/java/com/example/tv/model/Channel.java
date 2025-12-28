package com.example.tv.model;

public class Channel {

    private Long id;
    private String logo;
    private String name;
    private String streamUrl;

    public Channel(Long id, String logo, String name, String streamUrl) {
        this.id = id;
        this.logo = logo;
        this.name = name;
        this.streamUrl = streamUrl;
    }

    public Long getId() {
        return id;
    }

    public String getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getStreamUrl() {
        return streamUrl;
    }
}

