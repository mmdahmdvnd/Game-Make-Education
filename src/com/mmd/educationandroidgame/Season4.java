package com.mmd.educationandroidgame;

import com.mmd.educationandroidgame.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season4 extends Activity{
	
	private ImageView imgV1S4, imgV2S4, imgV3S4, imgV4S4, imgV5S4, imgV6S4, imgV7S4, imgV8S4, imgV9S4, imgV10S4;
	
	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season4);
		
		ImageView imgV1S4 = (ImageView) findViewById(R.id.imageView1_season4);
		ImageView imgV2S4 = (ImageView) findViewById(R.id.imageView2_season4);
		ImageView imgV3S4 = (ImageView) findViewById(R.id.imageView3_season4);
		ImageView imgV4S4 = (ImageView) findViewById(R.id.imageView4_season4);
		ImageView imgV5S4 = (ImageView) findViewById(R.id.imageView5_season4);
		ImageView imgV6S4 = (ImageView) findViewById(R.id.imageView6_season4);
		ImageView imgV7S4 = (ImageView) findViewById(R.id.imageView7_season4);
		ImageView imgV8S4 = (ImageView) findViewById(R.id.imageView8_season4);
	
		
		
		imgV1S4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS4P1 = new Intent(Season4.this, MemoryGameP1.class);
				startActivity(intentS4P1);
			}
			
		});
		
		
		imgV2S4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS4P1_ = new Intent(Season4.this, MainFrag_season4_p1.class);
				startActivity(intentS4P1_);
			}
			
		});
	
		
		
		imgV3S4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS4P2 = new Intent(Season4.this, MemoryGameP2.class);
				startActivity(intentS4P2);
			}
			
		});
		
		
		imgV4S4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS4P2_ = new Intent(Season4.this, MainFrag_season4_p2.class);
				startActivity(intentS4P2_);
			}
			
		});
		
		
		
		imgV5S4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS4P3 = new Intent(Season4.this, MemoryGameP3.class);
				startActivity(intentS4P3);
			}
			
		});
		
		
		
		imgV6S4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS4P3_ = new Intent(Season4.this, MainFrag_season4_p3.class);
				startActivity(intentS4P3_);
			}
			
		});
		
		
		imgV7S4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS4P4 = new Intent(Season4.this, MemoryGameP4.class);
				startActivity(intentS4P4);
			}
			
		});
		
		
		
		imgV8S4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS4P4_ = new Intent(Season4.this, MainFrag_season4_p4.class);
				startActivity(intentS4P4_);
			}
			
		});
		
		
		
		
		
		
	}

}
