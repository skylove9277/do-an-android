package vn.nguyenngocson.baitapthigiuakylan1;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Food_TBL")
public class Food {
    @PrimaryKey(autoGenerate = true)
    private int ma;
    private String tenmonan;

    public Food(int ma, String tenmonan) {
        this.ma = ma;
        this.tenmonan = tenmonan;
    }

    @Override
    public String toString() {
        return String.format("%d - %s",ma,tenmonan);
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenmonan() {
        return tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }
}
