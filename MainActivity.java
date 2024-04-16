package com.example.threadapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multithreadingapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG=MainActivity.class.getSimpleName();
    private Button buttonStart, buttonStop;
    private boolean nStopLoop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Thread id: "+Thread.currentThread().getId());
        buttonStart=(Button) findViewById(R.id.buttonThreadStarter);
        buttonStop=(Button) findViewById(R.id.buttonStopthread);

    }
    @Override
    public void onClick(View view){
        int id = view.getId();
        if (id == R.id.buttonThreadStarter) {
            nStopLoop = true;
            while (nStopLoop) {
                Log.i("Thread id in while loop: " + Thread.currentThread().getId());
            }
        } else if (id == R.id.buttonStopthread) {
            nStopLoop = false;
        }
    }
}