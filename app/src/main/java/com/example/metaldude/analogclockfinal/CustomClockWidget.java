package com.example.metaldude.analogclockfinal;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by metalDude on 24.09.2017.
 */

public class CustomClockWidget extends Activity {

  ImageView view;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    view = (ImageView) findViewById(R.id.ivSecondHand);
  }


  public ImageView getView() {
    return view;
  }
}
