package com.mcl.yin50;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class LearnActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_learn);
	}
	
	public void startExercise(View view){
		Intent intent = new Intent(this, ExerciseActivity.class);
		startActivity(intent);
	}
	
	public void  gotoLearn(View view){
		 Uri uri = Uri.parse("http://app.hotokyo.com/course/1/");
		 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		 startActivity(intent);
	}
}
