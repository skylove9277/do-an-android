package vn.nguyenngocson.baitapthigiuakylan1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewAdapter extends AppCompatActivity {
    ListView lvFood;
    ArrayAdapter<Food> adapter;
    FoodViewModel foodViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_adapter);

       lvFood = findViewById(R.id.lvFood);
       adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, new ArrayList<>());
       lvFood.setAdapter(adapter);

       foodViewModel = ViewModelProviders.of(this).get(FoodViewModel.class);
       foodViewModel.getFoodf().observe(this, saches->{
           adapter.clear();
           adapter.addAll(saches);
       });
       khoitao();
    }

    private void khoitao() {
        foodViewModel.insert(new Food(0,"Cải chua xào"));
        foodViewModel.insert(new Food(0,"Gà chiên bột"));
        foodViewModel.insert(new Food(0,"Gà chiên bột"));
        foodViewModel.insert(new Food(0,"Gà chiên bột"));
        foodViewModel.insert(new Food(0,"Gà chiên bột"));
        foodViewModel.insert(new Food(0,"Gà chiên bột"));
    }
}
