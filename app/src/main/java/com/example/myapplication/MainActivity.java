package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CountDownTimer c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the TextView with the id 'textView' in the layout
        TextView t = findViewById(R.id.textView);

        // Create a CountDownTimer with a 3-second countdown interval, updating every 1 second
         c = new  CountDownTimer(10000, 1000) {

            // This method is called on each tick (every second)
            public void onTick(long millisUntilFinished) {
                t.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            // This method is called when the countdown timer is finished
            public void onFinish() {
                // Call the method to switch to MainActivity2
                switchToMainActivity2();
            }
        }.start(); // Start the countdown timer
    }

    // Method to switch to MainActivity2
    private void switchToMainActivity2() {
        // Create an Intent to switch from MainActivity to MainActivity2
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        // Start the MainActivity2 activity
        c.cancel();
        startActivity(intent);
    }
}
