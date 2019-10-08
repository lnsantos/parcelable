package ccom.lucas.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Person person;
    private ArrayList<Person> persons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        person = new Person(20,"Lucas","Santos");
        persons.add(person);

        person = new Person(16,"Carlos","Santos");
        persons.add(person);

        person = new Person(20,"Ana","Julia");
        persons.add(person);

        person = new Person(20,"Force","Field");
        persons.add(person);
    }

    public void NextActivity(){
        startActivity(new Intent(this,ProfileActivity.class)
        .putParcelableArrayListExtra("personParcelable", persons));
    }

}
