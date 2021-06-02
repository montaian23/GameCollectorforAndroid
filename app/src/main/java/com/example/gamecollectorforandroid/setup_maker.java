package com.example.gamecollectorforandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class setup_maker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_maker);

        Button saveButton = findViewById(R.id.saveButton);

        EditText nameArcade = findViewById(R.id.nameArcade);

        EditText Platform = findViewById(R.id.namePlatform);
        EditText Genre = findViewById(R.id.nameGenre);
        EditText ReleaseYear = findViewById(R.id.nameYear);
        EditText Company = findViewById(R.id.nameCompany);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ArcadeName = (nameArcade.getText().toString());

                String nameplatform = (Platform.getText().toString());
                String nameGenre = (Genre.getText().toString());
                int nameyear = Integer.parseInt(ReleaseYear.getText().toString());
                String nameCompany = (Company.getText().toString());

                ArcadeDetails newArcade = new ArcadeDetails(ArcadeName, nameGenre, nameplatform, nameyear, nameCompany);

                ArcadeDetailsList.AddtoArcadeList(newArcade);

                startActivity(new Intent(setup_maker.this, MainActivity.class));
            }
        });

    }
}