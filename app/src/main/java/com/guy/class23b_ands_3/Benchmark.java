package com.guy.class23b_ands_3;

import java.util.ArrayList;

public class Benchmark {

    private ArrayList<Record> records = new ArrayList<>();

    public void newRecord(String tag) {
        records.add(new Record(tag));
    }

    public void done() {
        records.get(records.size() - 1).stop();
    }

    public String getLog() {
        StringBuilder sb = new StringBuilder();

        for (Record record : records) {
            sb.append("\n" + record.getTag() + ":  " + record.getTime());
        }

        return sb.toString();
    }

}
