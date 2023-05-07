package com.guy.class23b_ands_3;

public class Record {

    private String tag;
    private long time;

    public Record(String tag) {
        this.tag = tag;
        time = System.currentTimeMillis();
    }

    public void stop() {
        time = System.currentTimeMillis() - time;
    }

    public String getTag() {
        return tag;
    }

    public long getTime() {
        return time;
    }
}