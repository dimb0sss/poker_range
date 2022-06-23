package com.example.pokerrange;

public class Range {
    private String title;
    private int resRangeId;
    private int resActionId;

    public Range(String title, int resRangeId, int resActionId) {
        this.title = title;
        this.resRangeId = resRangeId;
        this.resActionId = resActionId;
    }

    public String getTitle() {
        return title;
    }

    public int getResRangeId() {
        return resRangeId;
    }

    public int getResActionId() {
        return resActionId;
    }
}
