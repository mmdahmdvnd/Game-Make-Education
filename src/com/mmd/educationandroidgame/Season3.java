package com.mmd.educationandroidgame;

import com.mmd.educationandroidgame.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Season3 extends Activity{
	
	private ImageView imgV1S3, imgV2S3, imgV3S3, imgV4S3, imgV5S3, imgV6S3;
	
	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season3);
		
		ImageView imgV1S3 = (ImageView) findViewById(R.id.imageView1_season3);
		ImageView imgV2S3 = (ImageView) findViewById(R.id.imageView2_season3);
		ImageView imgV3S3 = (ImageView) findViewById(R.id.imageView3_season3);
		ImageView imgV4S3 = (ImageView) findViewById(R.id.imageView4_season3);
		ImageView imgV5S3 = (ImageView) findViewById(R.id.imageView5_season3);
		ImageView imgV6S3 = (ImageView) findViewById(R.id.imageView6_season3);
		
		
		
		
		imgV1S3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS3P1 = new Intent(Season3.this, MainActivityTappyDefP1.class);
				startActivity(intentS3P1);
			}
			
		});
		
		
		imgV2S3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS3P1_ = new Intent(Season3.this, MainFrag_season3_p1.class);
				startActivity(intentS3P1_);
			}
			
		});
		
		imgV3S3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS3P2 = new Intent(Season3.this, MainActivityTappyDefP2.class);
				startActivity(intentS3P2);
			}
			
		});
		
		
		
		imgV4S3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS3P2_ = new Intent(Season3.this, MainFrag_season3_p2.class);
				startActivity(intentS3P2_);
			}
			
		});
		
		
		imgV5S3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intentS3P3 = new Intent(Season3.this, MainActivityTappyDefP3.class);
				startActivity(intentS3P3);
			}
			
		});
		
		
		imgV6S3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent intentS3P3_ = new Intent(Season3.this, MainFrag_season3_p3.class);
				startActivity(intentS3P3_);
			}
			
		});
		
		
	}

}
