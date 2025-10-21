package com.mmd.educationandroidgame;

import com.mmd.educationandroidgame.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {

	
	private ImageView imgV0m,imgV1m,imgV2m, imgV3m, imgV4m, imgV5m;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView imgV0m =(ImageView) findViewById(R.id.imageView0menu);
		ImageView imgV1m =(ImageView) findViewById(R.id.imageView1menu);
		ImageView imgV2m =(ImageView) findViewById(R.id.imageView2menu);
		ImageView imgV3m =(ImageView) findViewById(R.id.imageView3menu);
		ImageView imgV4m =(ImageView) findViewById(R.id.imageView4menu);
		ImageView imgV5m =(ImageView) findViewById(R.id.imageView5menu);
		
		
	imgV0m.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Intent intent0m = new Intent(MainActivity.this,Season0.class);
			startActivity(intent0m);
		}
			
	});	
		
		
	imgV1m.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Intent intent1m = new Intent(MainActivity.this,Season1.class);
			startActivity(intent1m);
		}
		
	});	
		
	
	imgV2m.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Intent intent2m = new Intent(MainActivity.this,Season2.class);
			startActivity(intent2m);
		}
		
	});	
	
	
	imgV3m.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Intent intent3m = new Intent(MainActivity.this,Season3.class);
			startActivity(intent3m);
		}
		
	});	
	
	
	imgV4m.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Intent intent4m = new Intent(MainActivity.this,Season4.class);
			startActivity(intent4m);
		}
		
	});	
	
	
	imgV5m.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			
			showAboutDialog();
		}
		
	});	
	
	
	}
	
	public void showAboutDialog() {
		LayoutInflater factory = LayoutInflater.from(this);

		final View addNew = factory.inflate(R.layout.about1, null);

		final AlertDialog.Builder newWordInputDialog = new AlertDialog.Builder(
				this);
		newWordInputDialog
				.setTitle("آموزش ساخت بازی اندروید   Version 1.1.0")
				.setView(addNew)
				.setPositiveButton("بستن",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int whichButton) {

							}
						});

		newWordInputDialog.show();
	}
	
	
	
/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}



	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
		
		case R.id.action_settings:
			
			showAboutDialog();
		}
		return super.onOptionsItemSelected(item);
	}
*/
	
	
}
