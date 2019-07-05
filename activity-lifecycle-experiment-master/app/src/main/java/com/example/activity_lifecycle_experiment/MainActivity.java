package com.example.activity_lifecycle_experiment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate Called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart Called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume Called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause Called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop Called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart Called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onRestart Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy Called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroy Called");
    }

    public void onButtonClicked(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
//        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
