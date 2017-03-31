package com.example.synapse_system.first;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view) {
        CheckOTGSupport();

       // Intent intent = new Intent(this,Main2Activity.class);
       // intent.putExtra("key", "Hai Noogler");

     //   startActivity(intent);
    }
    public void CheckOTGSupport(){
        AlertDialog.Builder alr=new AlertDialog.Builder(this);
        boolean x = getPackageManager().hasSystemFeature((PackageManager.FEATURE_USB_HOST));
        String str = String.valueOf(x);
        if(str=="false"){
            alr.setMessage("Android OTG Not Supported");
        }
        if(str=="true"){
            alr.setMessage("Android OTG Supported");


        }

        alr.create();
        alr.show();

    }
}
