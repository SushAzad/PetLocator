package edu.illinois.cs465.petlocator;

import android.app.Activity;
import android.os.Bundle;
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

    }
}
