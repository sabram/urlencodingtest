package com.lendingclub.urlencodingtest;

public class Greeting {

    private final String url;
    private final String urlEncoded;

    public Greeting() {
        this.url = "";
        this.urlEncoded = "";
    }

    public Greeting(String url, String urlEncoded) {
        this.url = url;
        this.urlEncoded = urlEncoded;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlEncoded() {
        return urlEncoded;
    }
}