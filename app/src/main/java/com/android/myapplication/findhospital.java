package com.android.myapplication;
import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class findhospital extends FragmentActivity implements
        OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener {

    private GoogleMap mMap;
    private GoogleApiClient googleApiClient;
    private LocationRequest locationRequest;
    private Location lastLocation;
    int i;
    private double latitide;
    private double longitude;


    private Marker currentUserLocationMarker;
    private static final int Request_User_Location_Code = 99;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findhospital);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkUserLocationPermission();
        }


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            buildGoogleApiClient();

            mMap.setMyLocationEnabled(true);
        }


    }


    public boolean checkUserLocationPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, Request_User_Location_Code);
            return false;
        } else {
            return true;
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case Request_User_Location_Code:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                        if (googleApiClient == null) {
                            buildGoogleApiClient();
                        }
                        mMap.setMyLocationEnabled(true);
                    }
                } else {
                    Toast.makeText(this, "Permission Denied...", Toast.LENGTH_SHORT).show();
                }
                return;
        }
    }


    protected synchronized void buildGoogleApiClient() {
        googleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();

        googleApiClient.connect();
    }


    @Override
    public void onLocationChanged(Location location) {
        latitide = location.getLatitude();
        longitude = location.getLongitude();

        lastLocation = location;

        if (currentUserLocationMarker != null) {
            currentUserLocationMarker.remove();
        }

        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title("Your Current Location");
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));

        currentUserLocationMarker = mMap.addMarker(markerOptions);

        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        mMap.animateCamera(CameraUpdateFactory.zoomBy(12));

        if (googleApiClient != null) {
            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, this);
        }
        LatLng khulna = new LatLng(22.83143, 89.54352);
        mMap.addMarker(new MarkerOptions()
                .position(khulna)
                .title("Khulna Diabetic Hospital,Khulna"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(khulna));


        LatLng bagerhat = new LatLng(22.66801, 89.78854);
        mMap.addMarker(new MarkerOptions()
                .position(bagerhat)
                .title("250 bededsadar hospital's extension building,bagerhat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bagerhat));


        LatLng jhinaidah = new LatLng(23.54208, 89.19120);
        mMap.addMarker(new MarkerOptions()
                .position(jhinaidah)
                .title("Shishu hHospital,Jhinaidah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jhinaidah));

        LatLng chuadanga = new LatLng(23.63523, 88.84826);
        mMap.addMarker(new MarkerOptions()
                .position(chuadanga)
                .title("Sadar Hospital, Chuadanga"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chuadanga));

        LatLng shatkhira = new LatLng(22.69024, 89.04693);
        mMap.addMarker(new MarkerOptions()
                .position(shatkhira)
                .title("Medical college Hospital Doctors Dormetory,Shatkhira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(shatkhira));

        LatLng kushtia1 = new LatLng(23.90177, 89.11818);
        mMap.addMarker(new MarkerOptions()
                .position(kushtia1)
                .title("Kushtia Diabetic Hospital, kushtia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kushtia1));


        LatLng kushtia2 = new LatLng(23.90177, 89.11818);
        mMap.addMarker(new MarkerOptions()
                .position(kushtia2)
                .title("Kushtia General Hospital, kushtia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kushtia2));

        LatLng meherpur = new LatLng(23.90177, 89.11818);
        mMap.addMarker(new MarkerOptions()
                .position(meherpur)
                .title("impact hospital private, meherpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(meherpur));

        LatLng jashore = new LatLng(23.14760, 89.23417);
        mMap.addMarker(new MarkerOptions()
                .position(jashore)
                .title("TB Hospital, Jashore"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jashore));

        LatLng narail1 = new LatLng(23.17227, 89.49931);
        mMap.addMarker(new MarkerOptions()
                .position(narail1)
                .title("Sadar Hospital, Narail"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(narail1));

        LatLng narail2 = new LatLng(23.04104, 89.63624);
        mMap.addMarker(new MarkerOptions()
                .position(narail2)
                .title("Kalia upozila Health Complex, Narail"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(narail2));

        LatLng narail3 = new LatLng(23.18434, 89.64770);
        mMap.addMarker(new MarkerOptions()
                .position(narail3)
                .title("Lohagara upozila Health Complex, Narail"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(narail3));

        LatLng magura = new LatLng(23.48643, 89.42151);
        mMap.addMarker(new MarkerOptions()
                .position(magura)
                .title("Magura Sadar Hospital, Magura"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(magura));

        LatLng rangpur1 = new LatLng(25.73245, 89.23810);
        mMap.addMarker(new MarkerOptions()
                .position(rangpur1)
                .title("100 bed Shishu Hospital, Rangpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rangpur1));

        LatLng rangpur2 = new LatLng(25.72917, 89.27612);
        mMap.addMarker(new MarkerOptions()
                .position(rangpur2)
                .title("Chest Hospital ,Tajhat, Rangpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rangpur2));

        LatLng rangpur3 = new LatLng(25.72917, 89.27612);
        mMap.addMarker(new MarkerOptions()
                .position(rangpur3)
                .title("Haragach 31 Beded Hospital, Rangpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rangpur3));

        LatLng kurigram = new LatLng(25.80863, 89.64470);
        mMap.addMarker(new MarkerOptions()
                .position(kurigram)
                .title("Adhunik Sadar Hospital, kurigram"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kurigram));

        LatLng dinajpur = new LatLng(25.79344, 88.60694);
        mMap.addMarker(new MarkerOptions()
                .position(dinajpur)
                .title("Kaharol Upozila Health Complex, Dinajpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dinajpur));

        LatLng dinajpur1 = new LatLng(25.66204, 88.88397);
        mMap.addMarker(new MarkerOptions()
                .position(dinajpur1)
                .title("LAMB Hospital Parbotipur, Dinajpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dinajpur1));

        LatLng lal = new LatLng(25.92277, 89.45551);
        mMap.addMarker(new MarkerOptions()
                .position(lal)
                .title("Lalmonirhat Nursing College,Lalmonirhat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lal));

        LatLng lal1 = new LatLng(25.91355, 89.44397);
        mMap.addMarker(new MarkerOptions()
                .position(lal1)
                .title("Railway Hospital,Lalmonirhat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lal1));


        LatLng lal2 = new LatLng(25.91278, 89.43871);
        mMap.addMarker(new MarkerOptions()
                .position(lal2)
                .title("Hostel of Govt Girls College,Lalmonirhat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lal2));

        LatLng pancha = new LatLng(26.34454, 88.55701);
        mMap.addMarker(new MarkerOptions()
                .position(pancha)
                .title("Diabetics hospital,panchagor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pancha));

        LatLng thakurgaon = new LatLng(26.02868, 88.47504);
        mMap.addMarker(new MarkerOptions()
                .position(thakurgaon)
                .title("Thakurgaon technical School and college,Thakurgaon"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(thakurgaon));

        LatLng nilphamari = new LatLng(25.93049, 88.84552);
        mMap.addMarker(new MarkerOptions()
                .position(nilphamari)
                .title("Adhunik sadar hospital, Nilphamari"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nilphamari));

        LatLng gaibandha = new LatLng(25.32346, 89.51003);
        mMap.addMarker(new MarkerOptions()
                .position(gaibandha)
                .title("Ansar VDP training centre,Gaibandha"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gaibandha));
    }



    @Override
    public void onConnected(@Nullable Bundle bundle) {
        locationRequest = new LocationRequest();
        locationRequest.setInterval(1100);
        locationRequest.setFastestInterval(1100);
        locationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, this);
        }


    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }



}