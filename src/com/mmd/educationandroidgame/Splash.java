package com.mmd.educationandroidgame;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends Activity{
	
	
	
	private Animation b;
	
	private ImageView back,logo;
	private TextView url;
	
	private int count=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		back=(ImageView) findViewById(R.id.splash_back);
		logo=(ImageView) findViewById(R.id.splash_logo);
		url=(TextView) findViewById(R.id.splash_url);
		
		
		b = AnimationUtils.loadAnimation(this, R.anim.splash_back);
		
		back.setVisibility(View.INVISIBLE);
		logo.setVisibility(View.INVISIBLE);
		url.setVisibility(View.INVISIBLE);

		
		
		
		final Timer tm=new Timer();
    	tm.scheduleAtFixedRate(new TimerTask(){
			public void run() {
				runOnUiThread(new Runnable(){
					public void run() {
						count++;
						
						if(count==3){
							
							back.setVisibility(View.VISIBLE);
							back.startAnimation(b);
							
						}
						if(count==8){
						
							logo.setVisibility(View.VISIBLE);
							logo.startAnimation(b);
						}
						
						
						if(count==13){
							
							url.setVisibility(View.VISIBLE);
							url.startAnimation(b);
							
						}
						

						if(count==18){
							tm.cancel();
							finish();
							Intent i=new Intent(Splash.this,MainActivity.class);
							startActivity(i);
							
						}
						
							
						
					}
				});
				
			}
	
    	}, 1, 500);
		
		
		
		
	}

}

