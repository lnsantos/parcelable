package ccom.lucas.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    private ArrayList<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        persons = getIntent().getParcelableArrayListExtra("personParcelable");

    }
}
