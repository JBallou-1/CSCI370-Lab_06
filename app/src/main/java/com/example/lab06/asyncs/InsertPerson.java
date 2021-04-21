package com.example.lab06.asyncs;

import android.os.AsyncTask;

import com.example.lab06.entities.Person;

public class InsertPerson extends AsyncTask {

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }
    new Thread(new Runnable() {
        @Override
        public void run() {
            Person person =new Person();
            person.setName(name);
            labDatabase.personDao().insertPerson(person);
        }
    }) .start();
}
