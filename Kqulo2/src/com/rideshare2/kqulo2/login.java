package com.rideshare2.kqulo2;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
setContentView(R.layout.loginlay);
  TextView registerscreen= (TextView) findViewById(R.id.reglnk);
  registerscreen.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(getApplicationContext(),Regclass.class);
		startActivity(i);
	}
});

			
		}
	}