package vn.nguyenngocson.baitapthigiuakylan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Update extends AppCompatActivity {
    TextView textTenMon, textDiaPhuong, textLoai;
    EditText editText4, editText5, editText6;
    Button btnUpdate, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__update);
        addControls();
    }

    private void addControls() {
        textTenMon = findViewById(R.id.textTenMon);
        textDiaPhuong = findViewById(R.id.textDiaPhuong);
        textLoai = findViewById(R.id.textLoai);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnExit = findViewById(R.id.btnExit);
    }
}
