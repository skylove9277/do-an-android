package vn.nguyenngocson.baitapthigiuakylan1;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FoodDao {
    @Query("Select * from Food_TBL")
    LiveData<List<Food>> getAll();

    @Insert
     void insert(Food f);

    @Update
    void update(Food f);

    @Delete
    void delete(Food f);
}
