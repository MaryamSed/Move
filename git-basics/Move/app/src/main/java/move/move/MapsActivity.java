package move.move;

import android.Manifest;
import android.graphics.Color;
import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

import io.nlopez.smartlocation.OnLocationUpdatedListener;
import io.nlopez.smartlocation.SmartLocation;
import io.nlopez.smartlocation.location.config.LocationParams;
import io.nlopez.smartlocation.location.providers.LocationBasedOnActivityProvider;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    int i;
    int k;
    LatLng [] position = new LatLng[50];
    int [] x = new int [10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(350739274,510443242)));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        DetectedActivity detectedActivity ;//= SmartLocation.with(this).activity().getLastActivity();
        detectedActivity = SmartLocation.with(this).activity().getLastActivity();
      //  final PolygonOptions Line = new PolygonOptions();
        //Line.strokeWidth(5);
        //Line.fillColor(Color.RED);
       // Line.add(new LatLng(35.739274,51.443242));
        //checkLocationPermissions();

   //    for (i=1 ; i<48 ; i++) {

          //  SmartLocation.with(this).location(new LocationBasedOnActivityProvider(
          //          new LocationBasedOnActivityProvider.LocationBasedOnActivityListener() {
         //               @Override
        //                public LocationParams locationParamsForActivity(DetectedActivity detectedActivity) {
        //                    LocationParams.Builder builder = new LocationParams.Builder();
        //                    return null;
         //               }
        //            }
         //   ))
         //           .start(new OnLocationUpdatedListener() {
          //              @Override
           //             public void onLocationUpdated(Location location) {
                           // k=detectedActivity.getType();
                            //final LatLng mCurrentPlace = new LatLng(location.getLatitude(), location.getLongitude());
                            //position[i]=mCurrentPlace;
                            //Line.add(position[i]);
                            //Polyline polyline = mMap.addPolyline(Line);
                           // Polyline polyline1 = mMap.addPolyline(Line);
                          /*  switch (detectedActivity.getType()){
                                case 1 : {
                                    mMap.addMarker(new MarkerOptions().position(position[i])
                                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.buycycle_marker)));
                                    break;
                                }
                                case 3 : {
                                    mMap.addMarker(new MarkerOptions().position(position[i])
                                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.car_marker)));
                                    break;
                                }
                                case 8 : {
                                    mMap.addMarker(new MarkerOptions().position(position[i])
                                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.walk_markerr)));
                                    break;
                                }
                                case 7 : {
                                    mMap.addMarker(new MarkerOptions().position(position[i])
                                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.walk_markerr)));
                                    break;
                                }
                                default:
                                    mMap.addMarker(new MarkerOptions().position(position[i])
                                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker)));
                            }*/


    //                    }
   //                 });

   //     }

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
       mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    //void checkLocationPermissions() {
    //    Dexter.withActivity(this)
    //            .withPermissions(
    //                    Manifest.permission.ACCESS_FINE_LOCATION,
    //                    Manifest.permission.ACCESS_COARSE_LOCATION
    //            ).withListener(new MultiplePermissionsListener() {
    //        @Override
    //        public void onPermissionsChecked(MultiplePermissionsReport report) {/* ... */}

    //        @Override
    //        public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {

    //        }

    ////    }).check();
    //}
}
