package com.example.viikko11;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class settingsclass extends Fragment{

    private static settingsclass settings = new settingsclass();

    private settingsclass() {

    }
    public static settingsclass getInstance() {
        return settings;
    }

    View view;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch aSwitch;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.settings, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        aSwitch = this.view.findViewById(R.id.texteditswitch);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @SuppressLint("SetTextI18n")
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked){
                   aSwitch.setText("Tekstikentän muokkaus estetty");
                   mainmenuclass.getInstance().teksti = mainmenuclass.getInstance().editText.getText().toString();
                   mainmenuclass.getInstance().onoff = 0;
               } else {
                   aSwitch.setText("Tekstikentän muokkaus sallittu");
                   mainmenuclass.getInstance().onoff = 1;
               }
           }
        });
    }

}
