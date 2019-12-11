package vn.nguyenngocson.baitapthigiuakylan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Them extends AppCompatActivity {
    TextView txtTenMon, txtDiaPhuong, txtLoai;
    EditText editText1, editText2, editText3;
    Button btnThem, btnHuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__them);
        addControls();
    }

    private void addControls() {
        txtTenMon = findViewById(R.id.txtTenMon);
        txtDiaPhuong = findViewById(R.id.txtDiaPhuong);
        txtLoai = findViewById(R.id.txtLoai);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        btnThem = findViewById(R.id.btnThem);
        btnHuy = findViewById(R.id.btnHuy);
    }
}
