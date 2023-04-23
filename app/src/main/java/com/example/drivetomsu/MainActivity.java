package com.example.drivetomsu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button driveToMSUButton;
    //DriveToMSU Button from Main Activity XMl declared

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Context from XML file of Main Activity declared

        driveToMSUButton = findViewById(R.id.driveToMSU_button);

       // OnClickListener declared
        driveToMSUButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String geoUriString = "google.navigation:q=Montclair+State+University";
                //URI destination of MSU declared for Google Maps
                Uri geoUri = Uri.parse(geoUriString);
                //Navigation connects with MSU
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoUri);
                //Package name set to ensure Google Maps is displayed for the app

                // The package (Google Maps) intent
                mapIntent.setPackage("com.google.android.apps.maps");

                startActivity(mapIntent);
                //Start Activity with Google Maps to navigate MSU
            }
        });
    }
}