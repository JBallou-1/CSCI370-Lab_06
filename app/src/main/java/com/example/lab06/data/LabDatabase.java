package com.example.lab06.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.lab06.dao.PersonDao;
import com.example.lab06.entities.Person;

@Database(entities = {Person.class}, version = 1)
public abstract class LabDatabase extends RoomDatabase {
    public abstract PersonDao personDao();
}
