/*
 * Copyright (c) 2016. David de Andrés and Juan Carlos Ruiz, DISCA - UPV, Development of apps for mobile devices.
 */

package labs.dadm.l02_01b_viewbinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import labs.dadm.R;
import labs.dadm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Generate a View from a layout resource
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        // Set the activity content from a View
        setContentView(binding.getRoot());

        // Change TextView properties at runtime: resource ID as parameter
        binding.tvRuntimeId.setText(R.string.going_on);

        // Change its properties at runtime: String as parameter
        final String newText = getResources().getString(R.string.anything_new);
        binding.tvRuntimeString.setText(newText);
    }
}
