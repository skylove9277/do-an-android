package vn.nguyenngocson.baitapthigiuakylan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edttaikhoan, edtmatkhau;
    Button btndangnhap;
    TextView txttaikhoan, txtmatkhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
        Intent intent = new Intent(MainActivity.this, ListViewAdapter.class);
        startActivity(intent);
    }
    private void addEvents() {
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = "admin";
                String password = "admin";
                if(edttaikhoan.getText().toString().equals(username) && edtmatkhau.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(),"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Tài khoản hoặc mật khẩu sai",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void addControls() {
       txttaikhoan = findViewById(R.id.txttaikhoan);
       txtmatkhau = findViewById(R.id.txtmatkhau);
       edttaikhoan = findViewById(R.id.edttaikhoan);
       edtmatkhau = findViewById(R.id.edtmatkhau);
       btndangnhap = findViewById(R.id.btndangnhap);
    }
}
