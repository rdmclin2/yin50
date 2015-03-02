package com.mcl.yin50;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void startExercise(View view){
		Intent intent = new Intent(this, ExerciseActivity.class);
		startActivity(intent);
	}
	
	public void  startLearn(View view){
		Intent intent = new Intent(this, LearnActivity.class);
		startActivity(intent);
	}
}
