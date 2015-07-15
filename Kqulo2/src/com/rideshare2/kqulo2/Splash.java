package com.rideshare2.kqulo2;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {
 private static int TIME_OUT=3000;
	@Override
	protected void onCreate(Bundle Mysavedstate) {
		// TODO Auto-generated method stub
		super.onCreate(Mysavedstate);
		setContentView(R.layout.activity_splash);
		
		new Handler().postDelayed(new Runnable() {
			public void run() {
				
				Intent i=new Intent(Splash.this,login.class);
				startActivity(i);
				
				finish();
			}
			
		},TIME_OUT);
	}

	 
}
