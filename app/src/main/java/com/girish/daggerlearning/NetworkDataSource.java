package com.girish.daggerlearning;

public class NetworkDataSource implements DataSource {
    private String mData;

    NetworkDataSource(String data) {
        mData = data;
    }

    @Override
    public String getData() {
        return mData;
    }
}
