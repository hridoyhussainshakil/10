package com.example.access_denaied.a10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text, text1;
    RadioGroup rg;
    RadioButton rd1,rd,rd2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        text1 = findViewById(R.id.text1);
        rg = findViewById(R.id.rg);
        rd = findViewById(R.id.rd);
        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);
        button = findViewById(R.id.bt1);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.rd){
                    Toast.makeText(getApplicationContext(), "select : A", Toast.LENGTH_SHORT).show();
                }
               else if(i==R.id.rd1){
                    Toast.makeText(getApplicationContext(), "select : B", Toast.LENGTH_SHORT).show();
                }
                else if(i==R.id.rd2){
                    Toast.makeText(getApplicationContext(), "select : C", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rg.getCheckedRadioButtonId();
                if(id ==rd.getId()){
                    text.setText("You select A");
                }
                if(id ==rd1.getId()){
                    text.setText("You select B");
                }
                if(id ==rd2.getId()){
                    text.setText("You select C");
                }
            }
        });
    }
}
