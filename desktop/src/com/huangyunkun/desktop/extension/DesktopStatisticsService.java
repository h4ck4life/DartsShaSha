package com.huangyunkun.desktop.extension;

import com.badlogic.gdx.Gdx;
import com.huangyunkun.extension.IStatisticsService;

public class DesktopStatisticsService implements IStatisticsService {

    @Override
    public void onResume() {
        Gdx.app.log("StatisticsService", "onResume");
    }

    @Override
    public void onPause() {
        Gdx.app.log("StatisticsService", "onPause");
    }

    @Override
    public void onEvent(String eventId, String label) {
        Gdx.app.log("StatisticsService", "onEvent " + eventId + " " + label);
    }

    @Override
    public void onEvent(String eventId, String label, int count) {
        Gdx.app.log("StatisticsService", "onEvent " + eventId + " " + label
                + " count=" + count);
    }
}
