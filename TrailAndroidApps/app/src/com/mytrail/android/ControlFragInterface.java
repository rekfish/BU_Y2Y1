package com.mytrail.android;

import android.view.View;

import java.io.UnsupportedEncodingException;

public interface ControlFragInterface {

    public void onFetchDetailsStay(View v) throws UnsupportedEncodingException;
    public void onFetchBed(View v) throws UnsupportedEncodingException;
    public void onFetchLottery(View v) throws UnsupportedEncodingException;

    public void onFetchEvents(View v) throws UnsupportedEncodingException;
}
