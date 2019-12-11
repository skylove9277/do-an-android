package vn.nguyenngocson.baitapthigiuakylan1;

import android.content.Context;

import androidx.lifecycle.LiveData;

import java.util.List;

public class FoodRepository {
    private FoodDao foodDao;
    private LiveData<List<Food>> foodf;
    public FoodRepository(Context context){
        foodDao = AppFoodDatabase.getInstance(context).foodDao();
        foodf = foodDao.getAll();
    }
    public void insert(Food f){
        AppFoodDatabase.executor.execute(()->foodDao.insert(f));
    }
    public void update(Food f){
        AppFoodDatabase.executor.execute(()->foodDao.update(f));
    }
    public void delete(Food f){

        AppFoodDatabase.executor.execute(()->foodDao.delete(f));
    }
    public LiveData<List<Food>> getFoodf(){
        return foodf;
    }
}
