package by.nca.data.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import by.nca.data.entity.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{

   public abstract UserDao getUserDao();
}
