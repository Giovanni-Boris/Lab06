package com.example.lab06.chart;

import android.graphics.Color;

import com.example.lab06.entity.LeyendEntity;


import java.util.ArrayList;
import java.util.List;

public class LeyendHelper {
    private List<LeyendEntity> leyendEntities;

    public LeyendHelper() {
        leyendEntities = new ArrayList<>();
    }

    public void addLeyendItem(String category, Color color) {
        LeyendEntity leyend = new LeyendEntity();
        leyend.setCategory(category);
        leyend.setColor(color);
        if (leyendEntities.contains(leyend) == false) {
            leyendEntities.add(leyend);
        }
    }

    public List<LeyendEntity> getLeyendItems() {
        return leyendEntities;
    }
}
