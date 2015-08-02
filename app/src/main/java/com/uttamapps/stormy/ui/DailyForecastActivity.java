package com.uttamapps.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.uttamapps.stormy.R;
import com.uttamapps.stormy.adapters.DayAdapter;
import com.uttamapps.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);


        DayAdapter adapter = new DayAdapter(this, mDays);


}}
