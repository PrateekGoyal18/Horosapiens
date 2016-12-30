package com.example.user.horosapien;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread timer=new Thread()
        {
            public void run()
            {
                try {
                    sleep(3500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                finally
                {

      //              Toast.makeText(getApplicationContext(), " WELCOME ", Toast.LENGTH_LONG).show();
                    Intent i= new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(i);
                }
            }


        };
        timer.start();

    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        finish();
        super.onPause();
    }

}

