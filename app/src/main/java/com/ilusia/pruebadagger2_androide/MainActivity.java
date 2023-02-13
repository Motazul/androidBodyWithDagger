package com.ilusia.pruebadagger2_androide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.ilusia.pruebadagger2_androide.bodyparts.Body;
import com.ilusia.pruebadagger2_androide.component.BodyComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Body body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((BodyApp)getApplication()).getBodyComponent().inject(this);
        Toast.makeText(
                this,
                body.getBodyData(),
                Toast.LENGTH_LONG
        ).show();

    }
}