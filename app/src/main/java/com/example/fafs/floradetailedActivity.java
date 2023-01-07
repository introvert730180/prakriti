package com.example.fafs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.fafs.databinding.ActivityFloradetailedBinding;

public class floradetailedActivity extends AppCompatActivity {

    ActivityFloradetailedBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityFloradetailedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        int image=getIntent().getIntExtra("image",0);
        String name=getIntent().getStringExtra("Name");
          String type=getIntent().getStringExtra("Type");
        String sciName=getIntent().getStringExtra("sciname");
        String plantFamily=getIntent().getStringExtra("plantfamily");
          String nat=getIntent().getStringExtra("nat");
         String exposure=getIntent().getStringExtra("exposure");
          String season=getIntent().getStringExtra("season");
         String height=getIntent().getStringExtra("height");
         String waterNeeds=getIntent().getStringExtra("water");
         String soilTYpe=getIntent().getStringExtra("soiltype");
         String soilPh=getIntent().getStringExtra("soilph");
          String soilDrainage=getIntent().getStringExtra("soildrainage");
          String characteristics=getIntent().getStringExtra("characteristics");
          String tolerance;


          binding.type.setText(type);
          binding.exposure.setText(exposure);
          binding.characteristics.setText(characteristics);
          binding.height.setText(height);
          binding.soilDrainage.setText(soilDrainage);
          binding.waterNeed.setText(waterNeeds);
          binding.sciName.setText(sciName);
          binding.family.setText(plantFamily);
          binding.soilPh.setText(soilPh);
          binding.season.setText(season);

//          binding.spread.setText(sp);
        binding.soilType.setText(soilTYpe);
        binding.imgPlant.setImageResource(image);
        binding.textView.setText(name);



    }
}