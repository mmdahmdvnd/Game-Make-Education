package com.mmd.educationandroidgame;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;



public class MainFrag_season1_p3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_season1_p3);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		 
		  if(view == findViewById(R.id.button2_season1_p3)) {
			 fr = new FragmentTwo_season1_p3();
		 
		 }else {
			 fr = new FragmentOne_season1_p3();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place_season1_p3, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
