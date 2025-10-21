package com.mmd.educationandroidgame;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;



public class MainFrag_season1_p9 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_season1_p9);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		
		 if(view == findViewById(R.id.button6_season1_p9)) {
			 fr = new FragmentSix_season1_p9();
		 
		 }else
		 if(view == findViewById(R.id.button5_season1_p9)) {
			 fr = new FragmentFive_season1_p9();
		 
		 }else
		 if(view == findViewById(R.id.button4_season1_p9)) {
			 fr = new FragmentFour_season1_p9();
		 
		 }else 
		 if(view == findViewById(R.id.button3_season1_p9)) {
			 fr = new FragmentThree_season1_p9();
		 
		 } else 
		 if(view == findViewById(R.id.button2_season1_p9)) {
			 fr = new FragmentTwo_season1_p9();
		 
		 }else {
			 fr = new FragmentOne_season1_p9();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place1_season1_p9, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
