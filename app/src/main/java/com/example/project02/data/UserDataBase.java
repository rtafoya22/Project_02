package com.example.project02.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.project02.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDataBase extends RoomDatabase {

    public abstract UserDAO getUserDao();
    public static final String USER_TABLE = "USER_TABLE";


}
