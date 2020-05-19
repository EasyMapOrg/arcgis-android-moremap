package com.wshunli.map.moremap.sample;

import android.os.Bundle;
import android.os.Environment;

import androidx.appcompat.app.AppCompatActivity;

import com.esri.android.map.MapView;
import com.wshunli.map.arcgis.android.moremap.MoreMapLayer;
import com.wshunli.map.arcgis.android.moremap.MoreMapLayerTypes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        MapView mMapView = findViewById(R.id.map);
        mMapView.addLayer(new MoreMapLayer(MoreMapLayerTypes.AMAP_VECTOR));

        String cachePath = Environment.getExternalStorageDirectory().getAbsoluteFile() + "/MoreMapCache";
        MoreMapLayer vec_c = new MoreMapLayer(MoreMapLayerTypes.AMAP_IMAGE, cachePath);
        mMapView.addLayer(vec_c);
    }
}
