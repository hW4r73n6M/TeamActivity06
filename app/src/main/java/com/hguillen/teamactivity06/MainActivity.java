package com.hguillen.teamactivity06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evenCount(View view) {
        // Create a new instance for the EvenRunnable class
        EvenRunnable even = new EvenRunnable();

        // Create and start a new thread for the even numbers
        Thread thread_even = new Thread(even, "Thread Even");
        thread_even.start();
    }

    public void oddCount(View view) {
        // Create a new instance for the OddRunnable class
        OddRunnable odd = new OddRunnable();

        // Create and start a new thread for the odd numbers
        Thread thread_odd = new Thread(odd, "Thread Odd");
        thread_odd.start();
    }
}