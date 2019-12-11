package vn.nguyenngocson.baitapthigiuakylan1;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class FoodViewModel extends AndroidViewModel {
    private FoodRepository repository;
    private LiveData<List<Food>> foodf;

    public FoodViewModel (Application app){
        super(app);
        repository = new FoodRepository(app);
        foodf = repository.getFoodf();
    }
    public void insert(Food f){
        repository.insert(f);
    }
    public void update(Food f){
        repository.update(f);
    }
    public void delete(Food f){
        repository.delete(f);
    }
    public LiveData<List<Food>> getFoodf(){
        return foodf;
    }
}
