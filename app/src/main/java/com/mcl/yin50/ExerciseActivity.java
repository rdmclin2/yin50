package com.mcl.yin50;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class ExerciseActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exercise);
	}
	
	public void openDialog(View view){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.create().show();
	}
}
