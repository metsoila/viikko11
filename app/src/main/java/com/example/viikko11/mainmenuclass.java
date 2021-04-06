package com.example.viikko11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class mainmenuclass extends Fragment {
    EditText editText;
    TextView textView;
    int onoff = 1;
    String teksti;
    private static mainmenuclass main = new mainmenuclass();

    private mainmenuclass() {

    }

    public static mainmenuclass getInstance() {
        return main;
    }
    public View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.main_menu, container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editText = this.view.findViewById(R.id.kirjoitettava);
        textView = this.view.findViewById(R.id.luettava);
        if (onoff == 1){
            editText.setEnabled(true);


        } else if (onoff == 0){
            textView.setText(teksti);
            editText.setEnabled(false);

        }

    }


}
