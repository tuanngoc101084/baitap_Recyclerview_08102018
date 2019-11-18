package com.example.recyclerview_baitap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<class_foody> arrayList;
    RecyclerView recyclerView;
    Foody_Adaptor foody_adaptor;
    LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList= new ArrayList<>();
        recyclerView= findViewById(R.id.Recyclerviewgiaohang);
        arrayList.add(new class_foody(R.drawable.cavienchien,"Trâm Anh - Cá Viên Chiên & Đồ Ăn Vặt","4 Trần Khắc Chân, P. 15, Phú Nhuận, TP. HCM"," Giảm trực tiếp 10% trên giá món. Nhập mã ưu đãi để được giảm nhiều hơn"));
        arrayList.add(new class_foody(R.drawable.lavacoffee,"Lava Coffee - Quang Trung","61 Quang Trung, P. 10, Gò Vấp, TP. HCM","Giảm trực tiếp 20% trên giá món. Nhập mã ưu đãi để được giảm nhiều hơn"));
        arrayList.add(new class_foody(R.drawable.yuriyuri,"Yuri Yuri - Ẩm Thực Hàn Quốc","350/1B Nguyễn Văn Khối, P, 9, Gò Vấp, TP. HCM","Giảm trực tiếp 20% trên giá món. Nhập mã ưu đãi để được giảm nhiều hơn"));
        arrayList.add(new class_foody(R.drawable.coutbuncha,"Cô Út - Bún Chả Cá Miền Trung","317/13 Thống Nhất, P. 11, Gò Vấp, TP. HCM","Giảm trực tiếp 25% trên giá món. Nhập mã ưu đãi để được giảm nhiều hơn"));
        foody_adaptor= new Foody_Adaptor(arrayList);
         layoutManager =new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foody_adaptor);
        recyclerView.setHasFixedSize(true);
        ///
        arrayList= new ArrayList<>();
        recyclerView= findViewById(R.id.Recyclerviewdatban);
        arrayList.add(new class_foody(R.drawable.pachipachi,"Pachi Pachi - Thịt Nướng Nhật Bản","52 Mạc Đĩnh Chi, P. Đakao, Quận 1"," Giảm 20% hóa đơn thức ăn Alacarte trên 500.000đ"));
        arrayList.add(new class_foody(R.drawable.changkangkung,"Chang Kang Kung - Hấp Thủy Nhiệt Hong Kong - Lê Quý Đôn","Tầng 1, 14 Lê Quý Đôn, P. 6, Quận 3","Giảm 30% Combo trưa giá 608k còn 425k"));
        arrayList.add(new class_foody(R.drawable.foodhouse,"Food House - Nguyễn Tri Phương","230 Nguyễn Tri Phương, P. 4, Quận 10","Giảm 23% Buffet 189k còn 145k"));
        arrayList.add(new class_foody(R.drawable.gyukaka,"Gyu-Kaku Japanese BBQ - Điện Biên Phủ","254 Điện Biên Phủ, P. 7, Quận 3","Giảm 20% Buffet Nướng Lẩu giá 278k còn 222k"));
        foody_adaptor= new Foody_Adaptor(arrayList);
        layoutManager =new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foody_adaptor);
        recyclerView.setHasFixedSize(true);
    }
}
