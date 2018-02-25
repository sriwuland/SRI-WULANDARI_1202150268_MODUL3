package com.example.asus.sriwulandari_1202150268_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class detailActivity extends AppCompatActivity {
    private int counts = 1;
    private Button plus, minus;
    private TextView value;
    private ImageView battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        String title = intent.getStringExtra("judul");
        String desc = intent.getStringExtra("deskripsi");
        String descs = intent.getStringExtra("descs");
        int gambar = intent.getIntExtra("gambar", 0);

        TextView textTitle = findViewById(R.id.judul);
        TextView textDesc = findViewById(R.id.deskripsi);
        ImageView imageGambar = findViewById(R.id.gambar);

        textTitle.setText(title);
        textDesc.setText(descs);
        imageGambar.setImageResource(gambar);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        value = findViewById(R.id.txt);
        battery = findViewById(R.id.battery);

        battery.setImageResource(R.drawable.ic_battery_20);
        value.setText(Integer.toString(counts) + "L");

    }
    //aksi yang dilakukan pada saat plus diklik
    public void plus(View view) {
        counts++;
        if (value != null) {
            switch (counts) {
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Low", Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery 30%", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery 50%", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery 70%", Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery 90%", Toast.LENGTH_SHORT).show();
                    break;
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Full", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

    //aksi yang dilakukan pada saat minus diklik
    public void minus(View view) {
        counts--;
        if (value != null) {
            switch (counts) {
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Full", Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery 90%", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery 70%", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery 50%", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery 30%", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Low", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
