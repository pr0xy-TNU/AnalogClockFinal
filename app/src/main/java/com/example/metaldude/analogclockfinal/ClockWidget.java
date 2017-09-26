package com.example.metaldude.analogclockfinal;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

/**
 * Created by metalDude on 24.09.2017.
 */

public class ClockWidget extends AppWidgetProvider {

  RemoteViews views;

  @Override
  public void onReceive(Context context, Intent intent) {
    super.onReceive(context, intent);
    String action = intent.getAction();
    if (AppWidgetManager.ACTION_APPWIDGET_UPDATE.equals(action)) {
      views = new RemoteViews(context.getPackageName(), R.layout.clock_widget_layout);
      AppWidgetManager.getInstance(context).updateAppWidget
          (intent.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS), views);

    }
  }
}


