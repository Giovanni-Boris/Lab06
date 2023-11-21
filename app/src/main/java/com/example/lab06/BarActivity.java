package com.example.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab06.chart.BarChart;
import com.example.lab06.chart.LeyendChart;
import com.example.lab06.datasource.DataSet;

public class BarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        BarChart barChart=findViewById(R.id.barChart);
        LeyendChart leyendChart =findViewById(R.id.barChartLeyend);

        barChart.setSerie(DataSet.getSerie());
        barChart.setColorCatalog(DataSet.getColorCatalog());

        leyendChart.setLeyendData(barChart.getLeyend());
    }
}