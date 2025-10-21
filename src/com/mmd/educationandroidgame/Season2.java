package com.mmd.educationandroidgame;

import com.mmd.educationandroidgame.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season2 extends Activity{
	
	private ImageView imgV1S2, imgV2S2, imgV3S2, imgV4S2, imgV5S2, imgV6S2, imgV7S2, imgV8S2, imgV9S2, imgV10S2;
	
	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season2);
		
		ImageView imgV1S2 = (ImageView) findViewById(R.id.imageView1_season2);
		ImageView imgV2S2 = (ImageView) findViewById(R.id.imageView2_season2);
		ImageView imgV3S2 = (ImageView) findViewById(R.id.imageView3_season2);
		ImageView imgV4S2 = (ImageView) findViewById(R.id.imageView4_season2);
		ImageView imgV5S2 = (ImageView) findViewById(R.id.imageView5_season2);
		ImageView imgV6S2 = (ImageView) findViewById(R.id.imageView6_season2);
		ImageView imgV7S2 = (ImageView) findViewById(R.id.imageView7_season2);
		ImageView imgV8S2 = (ImageView) findViewById(R.id.imageView8_season2);
		ImageView imgV9S2 = (ImageView) findViewById(R.id.imageView9_season2);
		ImageView imgV10S2 = (ImageView) findViewById(R.id.imageView10_season2);
		
		
		imgV1S2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS2P1 = new Intent(Season2.this, WhackAMoleActivityWAMP1.class);
				startActivity(intentS2P1);
			}
			
		});
		
		
		imgV2S2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS2P1_ = new Intent(Season2.this, MainFrag_season2_p1.class);
				startActivity(intentS2P1_);
			}
			
		});
		
		
		
		imgV3S2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS2P2 = new Intent(Season2.this, WhackAMoleActivityWAMP2.class);
				startActivity(intentS2P2);
			}
			
		});
		
		
		imgV4S2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS2P2_ = new Intent(Season2.this, MainFrag_season2_p2.class);
				startActivity(intentS2P2_);
			}
			
		});
		
		
		
		imgV5S2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS2P3 = new Intent(Season2.this, WhackAMoleActivityWAMP3.class);
				startActivity(intentS2P3);
			}
			
		});
		
		
		
		imgV6S2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS2P3_ = new Intent(Season2.this, MainFrag_season2_p3.class);
				startActivity(intentS2P3_);
			}
			
		});
		
		imgV7S2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS2P4 = new Intent(Season2.this, WhackAMoleActivityWAMP4.class);
				startActivity(intentS2P4);
			}
			
		});
		
		
		imgV8S2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS2P4_ = new Intent(Season2.this, MainFrag_season2_p4.class);
				startActivity(intentS2P4_);
			}
			
		});
		
		
		
		imgV9S2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS2P5 = new Intent(Season2.this, WhackAMoleActivityWAMP5.class);
				startActivity(intentS2P5);
			}
			
		});
		
		
		imgV10S2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS2P5_ = new Intent(Season2.this, MainFrag_season2_p5.class);
				startActivity(intentS2P5_);
			}
			
		});
		
		
	}

}
