package com.eldsoke.islam.gamya;

import android.app.FragmentManager;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton newGamaya = findViewById(R.id.fab);

        newGamaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNewGamayDialog();
            }
        });

    }

    void showNewGamayDialog(){
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        GamayaDialogFragment gamayaDialogFragment = GamayaDialogFragment.newInstance("اضافة جمعية جديدة");
        gamayaDialogFragment.show(fm , "new_gamaya_dialog");

    }
}
