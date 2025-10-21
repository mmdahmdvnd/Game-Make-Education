package com.mmd.educationandroidgame;

import com.mmd.educationandroidgame.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season1 extends Activity{
	
	private ImageView imgV1S1, imgV2S1, imgV3S1, imgV4S1, imgV5S1, imgV6S1, imgV7S1, imgV8S1, imgV9S1, imgV10S1, imgV11S1, imgV12S1, imgV13S1,
	imgV14S1, imgV15S1, imgV16S1, imgV17S1, imgV18S1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season1);
		
		ImageView imgV1S1 = (ImageView) findViewById(R.id.imageView1_season1);
		ImageView imgV2S1 = (ImageView) findViewById(R.id.imageView2_season1);
		
		ImageView imgV3S1 = (ImageView) findViewById(R.id.imageView3_season1);
		ImageView imgV4S1 = (ImageView) findViewById(R.id.imageView4_season1);
		
		ImageView imgV5S1 = (ImageView) findViewById(R.id.imageView5_season1);
		ImageView imgV6S1 = (ImageView) findViewById(R.id.imageView6_season1);
		
		ImageView imgV7S1 = (ImageView) findViewById(R.id.imageView7_season1);
		ImageView imgV8S1 = (ImageView) findViewById(R.id.imageView8_season1);
		
		ImageView imgV9S1 = (ImageView) findViewById(R.id.imageView9_season1);
		ImageView imgV10S1 = (ImageView) findViewById(R.id.imageView10_season1);
		
		ImageView imgV11S1 = (ImageView) findViewById(R.id.imageView11_season1);
		ImageView imgV12S1 = (ImageView) findViewById(R.id.imageView12_season1);
		
		ImageView imgV13S1 = (ImageView) findViewById(R.id.imageView13_season1);
		ImageView imgV14S1 = (ImageView) findViewById(R.id.imageView14_season1);
		
		ImageView imgV15S1 = (ImageView) findViewById(R.id.imageView15_season1);
		ImageView imgV16S1 = (ImageView) findViewById(R.id.imageView16_season1);
		
		ImageView imgV17S1 = (ImageView) findViewById(R.id.imageView17_season1);
		ImageView imgV18S1 = (ImageView) findViewById(R.id.imageView18_season1);
		
		
	
		
		
		imgV1S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP1 = new Intent(Season1.this, MainActivityCrz8P1.class);
				startActivity(intentP1);
			}
		});
		
		
		imgV2S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP1_ = new Intent(Season1.this, MainFrag_season1_p1.class);
				startActivity(intentP1_);
			}
		});
		
		imgV3S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP2 = new Intent(Season1.this, MainActivityCrz8P2.class);
				startActivity(intentP2);
			}
		});
		
		
		imgV4S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP2_ = new Intent(Season1.this, MainFrag_season1_p2.class);
				startActivity(intentP2_);
			}
		});
		
		
		imgV5S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP3 = new Intent(Season1.this, Crazy8ActivityCrz8P3.class);
				startActivity(intentP3);
			}
		});
		
		
		imgV6S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP3_ = new Intent(Season1.this, MainFrag_season1_p3.class);
				startActivity(intentP3_);
			}
		});
		
		
		imgV7S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP4 = new Intent(Season1.this, Crazy8ActivityCrz8P4.class);
				startActivity(intentP4);
			}
		});
		
		
		
		imgV8S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP4_ = new Intent(Season1.this, MainFrag_season1_p4.class);
				startActivity(intentP4_);
			}
		});
		
		
		
		imgV9S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP5 = new Intent(Season1.this, Crazy8ActivityCrz8P5.class);
				startActivity(intentP5);
			}
		});
		
		
		imgV10S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP5_ = new Intent(Season1.this, MainFrag_season1_p5.class);
				startActivity(intentP5_);
			}
		});
		
		
		imgV11S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP6 = new Intent(Season1.this, Crazy8ActivityCrz8P6.class);
				startActivity(intentP6);
			}
		});
		
		
		imgV12S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP6_ = new Intent(Season1.this, MainFrag_season1_p6.class);
				startActivity(intentP6_);
			}
		});
		
		
		
		
		imgV13S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP7 = new Intent(Season1.this, Crazy8ActivityCrz8P7.class);
				startActivity(intentP7);
			}
		});
		
		
		imgV14S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP7_ = new Intent(Season1.this, MainFrag_season1_p7.class);
				startActivity(intentP7_);
			}
		});
		
		
		
		imgV15S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP8 = new Intent(Season1.this, Crazy8ActivityCrz8P8.class);
				startActivity(intentP8);
			}
		});
		
		
		
		imgV16S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP8_ = new Intent(Season1.this, MainFrag_season1_p8.class);
				startActivity(intentP8_);
			}
		});
		
		
		
		imgV17S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP9 = new Intent(Season1.this, Crazy8ActivityCrz8P9.class);
				startActivity(intentP9);
			}
		});
		
		
		
		imgV18S1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentP9_ = new Intent(Season1.this, MainFrag_season1_p9.class);
				startActivity(intentP9_);
			}
		});
		
		
		
		
		
		
	}

}
