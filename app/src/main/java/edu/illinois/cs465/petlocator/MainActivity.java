package edu.illinois.cs465.petlocator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    private Button gMapsButton;
    private Button timelineButton;
    private Button sawAPetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gMapsButton = (Button) findViewById(R.id.gmaps_button);
        timelineButton = findViewById(R.id.timeline_gmaps_button);
        sawAPetButton = findViewById(R.id.sawAPet);
        timelineButton.setOnClickListener(this);
        gMapsButton.setOnClickListener(this);
        sawAPetButton.setOnClickListener(this);
        sawAPetButton.setOnClickListener(this);
    }


    public void onClick(View v) {
        if (v.getId() == R.id.gmaps_button) {
            Intent intent = new Intent(MainActivity.this, LostPetLocationActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.timeline_gmaps_button) {
            Intent intent = new Intent(MainActivity.this, PetTimelineActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.sawAPet) {
            Intent intent = new Intent(MainActivity.this, SawAnAnimalActivity.class);
            startActivity(intent);
        }
    }

}
