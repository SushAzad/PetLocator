package edu.illinois.cs465.petlocator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;

public class pet_details extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_details);
        Float latitude = getIntent().getFloatExtra("LostPetLatitude",0);
        Float longitude = getIntent().getFloatExtra("LostPetLongitude",0);
        TextView txt = findViewById(R.id.positionDetails);
        txt.setText("Pet lost at latitude: "+latitude);


        Spinner mySpinner = (Spinner) findViewById(R.id.breedDropDown);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(pet_details.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

    }
}
