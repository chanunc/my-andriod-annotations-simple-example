package com.example.myandroidannotations;


import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

	@ViewById(R.id.textView1)
	TextView textView1;
	
	@ViewById(R.id.editName)
	EditText editName;
	
	@Click
	void buttonName(){
		String name = editName.getText().toString();
		textView1.setText(name);
	}
	
	
}
