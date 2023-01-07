package com.example.fafs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.fafs.Adapter.fragmentAdapter;
import com.example.fafs.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
//    RecyclerView recyclerview;
//    recyclerVIewAdapter reVIewAdapter;
//Toolbar toolbar;
//TabLayout tabLayout;
//ViewPager viewPager;


    ActivityMainBinding binding;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //id finding
//
//
//        tabLayout=findViewById(R.id.tabLayout);
//        viewPager=findViewById(R.id.viewPager);
//        toolbar=findViewById(R.id.toolBar);
//
//
//    //   toolbar setting
//        setSupportActionBar(toolbar);
//      toolbar.setTitle("PRAKRITI");
//      toolbar.setSubtitle("IITH");
//      //toolbar.setCollapseIcon();
//      getSupportActionBar().setTitle("PRAKRITI");
//
//      viewPagerAdapter adapter=new viewPagerAdapter(getSupportFragmentManager());
//      viewPager.setAdapter(adapter);
//        tabLayout.setupWithViewPager(viewPager);
//
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    binding.viewPager.setAdapter(new fragmentAdapter(getSupportFragmentManager()));
    binding.tabLayout.setupWithViewPager(binding.viewPager);





    }
}