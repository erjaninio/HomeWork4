package com.example.user.homework4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Person> persons;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=(RecyclerView)findViewById(R.id.ma_rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.image1));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.image2));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.image3));
        persons.add(new Person("Ivan Ivanov", "31 years old", R.drawable.image4));
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.image1));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.image2));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.image3));
        persons.add(new Person("Ivan Ivanov", "31 years old", R.drawable.image4));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }
}
