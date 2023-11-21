package com.example.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab06.chart.LeyendChart;
import com.example.lab06.chart.RingChart;
import com.example.lab06.datasource.DataSet;

public class RingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ring);

        RingChart ringChart = findViewById(R.id.ringChart);
        LeyendChart leyendChart = findViewById(R.id.ringChartLeyend);

        ringChart.setColorCatalog(DataSet.getColorCatalog());
        ringChart.setSerie(DataSet.getSerie());

        leyendChart.setLeyendData(ringChart.getLeyend());

    }


}