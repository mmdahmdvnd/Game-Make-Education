package com.mmd.educationandroidgame;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;



public class MainActivityCrz8P1 extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
CircleViewCrz8P1 circleview = new CircleViewCrz8P1(this);
    
    setContentView(circleview);
        
  }

}
