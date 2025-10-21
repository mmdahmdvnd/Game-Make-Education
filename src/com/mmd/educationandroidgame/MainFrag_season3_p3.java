package com.mmd.educationandroidgame;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;



public class MainFrag_season3_p3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_season3_p3);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 
		
		 if(view == findViewById(R.id.button6_season3_p3)) {
			 fr = new FragmentSix_season3_p3();
		 
		 }else
		 if(view == findViewById(R.id.button5_season3_p3)) {
			 fr = new FragmentFive_season3_p3();
		 
		 }else
		 if(view == findViewById(R.id.button4_season3_p3)) {
			 fr = new FragmentFour_season3_p3();
		 
		 }else 
		 if(view == findViewById(R.id.button3_season3_p3)) {
			 fr = new FragmentThree_season3_p3();
		 
		 } else 
		 if(view == findViewById(R.id.button2_season3_p3)) {
			 fr = new FragmentTwo_season3_p3();
		 
		 }else {
			 fr = new FragmentOne_season3_p3();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place1_season3_p3, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
