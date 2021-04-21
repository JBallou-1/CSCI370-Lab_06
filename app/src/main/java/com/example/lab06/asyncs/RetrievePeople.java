package com.example.lab06.asyncs;

import android.content.Intent;
import android.os.AsyncTask;

import com.example.lab06.PersonsActivity;
import com.example.lab06.entities.Person;

import java.util.ArrayList;

public class RetrievePeople extends AsyncTask {
    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }
    ArrayList<String> personNames = new ArrayList<>();
        for(
    Person p: persons) {
        personNames.add(p.getName());
    }

    Intent i = new Intent(context, PersonsActivity.class);
        i.putExtra("Persons", personNames);
    context.startActivity(i);
}
