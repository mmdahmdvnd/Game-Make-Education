package com.mmd.educationandroidgame;

import java.io.IOException;
import java.io.InputStream;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentTwo_season4_p3 extends Fragment {
   @Override
   public View onCreateView(LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
      
       //Inflate the layout for this fragment
       
       View view = inflater.inflate(
    		  R.layout.fragment_two_season4_p3, container, false);
       
       
       TextView Matn  = (TextView) view.findViewById(R.id.matn2_season4_p3);
       Matn.setMovementMethod(new ScrollingMovementMethod());

       String displayText = "";
       InputStream tarjomer = null;
       try {
       	
       		 tarjomer = getResources().openRawResource(R.raw.text2_season4_p3);
       		
       	 int fileLen = tarjomer.available();
       	 byte[] fileBuffer = new byte[fileLen];
       	 tarjomer.read(fileBuffer);
       	 tarjomer.close();
       	 displayText = new String(fileBuffer);

       	} catch (IOException e) {
       	}
       Matn.setText(displayText);
       
       return view;
   }
}




