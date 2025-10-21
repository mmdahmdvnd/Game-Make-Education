package com.mmd.educationandroidgame;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;



public class MainFrag_season4_p4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_season4_p4);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 				 		
		 
		 if(view == findViewById(R.id.button2_season4_p4)) {
			 fr = new FragmentTwo_season4_p4();
		 
		 }else {
			 fr = new FragmentOne_season4_p4();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place1_season4_p4, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
