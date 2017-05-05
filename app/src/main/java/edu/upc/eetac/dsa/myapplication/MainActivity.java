package edu.upc.eetac.dsa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    String tag = "Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "Event a onCreate()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "Event a onStart()");
    }

    @Override
    public void onRestart (){
        super.onRestart();
        Log.d(tag, "Event on a Restart()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate();
    }
    /

  public void mostraMissatge(View view) {
       Toast.makeText(this,"aids!", Toast.LENGTH_LONG).show();
    }
}
