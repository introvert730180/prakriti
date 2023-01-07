package com.example.fafs.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.fafs.Adapter.floraAdapter;
import com.example.fafs.R;
import com.example.fafs.databinding.FragmentFloraBinding;
import com.example.fafs.florauser;

import java.util.ArrayList;


public class flora extends Fragment {


    public flora() {
        // Required empty public constructor
    }
     FragmentFloraBinding binding;
ArrayList<florauser> list=new ArrayList<>();
    ArrayList<florauser> list2=new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         binding=FragmentFloraBinding.inflate( inflater, container, false);

        floraAdapter adapter=new floraAdapter(list,getContext());
        binding.floraRecycler.setAdapter((adapter));
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        binding.floraRecycler.setLayoutManager(layoutManager);

      //  img,type,sciName,plantFamily,nat,exposure,season,height,waterNeeds,soilTYpe,soilPh,soilDrainage,characteristics,tolerance;

     list.add(new florauser(R.drawable.iith1,"Paper ",  "perenial"));
        list.add(new florauser(R.drawable.iith1,"Paper flower",  "perenial shurb"));
        list.add(new florauser(R.drawable.iith1,"Paper flower",  "perenial shurb"));
      list.add(new florauser(R.drawable.iith1,"Paper flower",  "perenial shurb"));
        list.add(new florauser(R.drawable.iith1,"Paper flower",  "perenial shurb"));
       list.add(new florauser(R.drawable.iith1,"Paper flower",  "perenial shurb"));
      list.add(new florauser(R.drawable.iith1,"Paper flower",  "perenial shurb"));
     list.add(new florauser(R.drawable.iith1,"Paper flower",  "perenial shurb"));
     list.add(new florauser(R.drawable.iith1,"Paper flower",  "perenial chutiya"));
       list.add(new florauser(R.drawable.iith1,"Paper flower",  "okkah"));


//       list2.add(new florauser( "plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));
//
//        list2.add(new florauser( "plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","sciname","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));

        list2.add(new florauser(R.drawable.iith1,  "perenial shurb","bsdwala","plantfamily","nat","exposure","ewf","fewrg","water","soiltype","soilph","name","soildrainage","char","tolerance"));



























        return binding.getRoot();
    }
}