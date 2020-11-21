package com.example.ejerparcial2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    public double pos1,pos2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);
    }


    public void onMapReady(GoogleMap googleMap){
        GoogleMap mMap = googleMap;
        pos1 =(double)(Math.random())+1;
        pos2 =(double)(Math.random());
        LatLng latitud = new LatLng(pos1,pos2);
        mMap.addMarker(new MarkerOptions().position(latitud).title("El primero"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latitud));
    }


}