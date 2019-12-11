package vn.nguyenngocson.baitapthigiuakylan1;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Food.class}, version = 1)
public abstract class AppFoodDatabase extends RoomDatabase{
    public abstract FoodDao foodDao();
    private static volatile AppFoodDatabase INSTANCE = null;
    public static AppFoodDatabase getInstance(Context context){
        if(INSTANCE == null){
            synchronized (AppFoodDatabase.class){
                if(INSTANCE == null)
                    INSTANCE = Room.databaseBuilder(context,AppFoodDatabase.class,"qlmonan").build();
            }
        }
        return INSTANCE;
    }
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
}
