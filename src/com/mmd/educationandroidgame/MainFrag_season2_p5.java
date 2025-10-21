package com.mmd.educationandroidgame;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;



public class MainFrag_season2_p5 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.mainfrag_season2_p5);
	}
	 
	public void selectFrag(View view) {
		 Fragment fr;
		 				 		
		 if(view == findViewById(R.id.button3_season2_p5)) {
			 fr = new FragmentThree_season2_p5();
		 
		 } else 
		 if(view == findViewById(R.id.button2_season2_p5)) {
			 fr = new FragmentTwo_season2_p5();
		 
		 }else {
			 fr = new FragmentOne_season2_p5();
		 }
		 
		 FragmentManager fm = getFragmentManager();
	     FragmentTransaction fragmentTransaction = fm.beginTransaction();
	     fragmentTransaction.replace(R.id.fragment_place1_season2_p5, fr);
	     fragmentTransaction.commit();
		 
	}
   
}
