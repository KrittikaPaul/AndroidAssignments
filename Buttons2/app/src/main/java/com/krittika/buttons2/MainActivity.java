package com.krittika.buttons2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private Switch s;
    private ImageView i1;
    private ImageButton i2;
    private CheckBox cb;
    private Button refresh;
    RadioButton e,d,t;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        i1 = (ImageView) findViewById(R.id.imageView1);
        s = (Switch) findViewById(R.id.switch2);
        s.setChecked(true);
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    i1.setVisibility(View.VISIBLE);
                else
                    i1.setVisibility(View.INVISIBLE);
            }
        });
        i2=(ImageButton)findViewById(R.id.imageButton1);
        cb=(CheckBox)findViewById(R.id.checkBox);
        cb.setChecked(true);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    i2.setVisibility(View.VISIBLE);
                else
                    i2.setVisibility(View.INVISIBLE);
            }
        });

    refresh=(Button)findViewById(R.id.button);
    rg=(RadioGroup)findViewById(R.id.radioGroup);
    e=(RadioButton)findViewById(R.id.radioButton2);
    d=(RadioButton)findViewById(R.id.radioButton);

    }

    public void onClickRadioButton(View v) {
        int selectId=rg.getCheckedRadioButtonId();
        t=findViewById(selectId);
        if(t.getText().toString().equals("Enabled"))
        {
            i2.setClickable(true);
            Toast.makeText(MainActivity.this,"image button is clickable",Toast.LENGTH_SHORT).show();
        }
        else{
            i2.setClickable(false);
        Toast.makeText(MainActivity.this,"image button is not clickable",Toast.LENGTH_SHORT).show();}
    }

    public void onClickRefresh(View view)
    {
        s.setChecked(true);
        cb.setChecked(true);
        d.setChecked(true);
    }


    }




