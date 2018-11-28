package edu.illinois.cs465.petlocator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button gMapsButton;
    private Button petDetailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gMapsButton = (Button) findViewById(R.id.gmaps_button);
        gMapsButton.setOnClickListener(this);

        petDetailButton = (Button) findViewById(R.id.Lost_Pet);
        petDetailButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });
    }


    public void onClick(View v) {
        if (v.getId() == R.id.gmaps_button) {
            Intent intent = new Intent(MainActivity.this, LostPetLocationActivity.class);
            startActivity(intent);
        }
    }

    public void openActivity2(){
        Intent intent = new Intent(this, pet_details.class);
        startActivity(intent);
    }
}
