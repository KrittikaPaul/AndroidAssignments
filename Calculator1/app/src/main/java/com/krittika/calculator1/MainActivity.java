package com.krittika.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t;
    Button b1,b2;
    int flag=1;
    String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickListener(View view)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button1);
        t=(TextView) findViewById(R.id.textView);
        double ans=0;
        double n1=Double.parseDouble(e1.getText().toString());
        double n2=Double.parseDouble(e2.getText().toString());
        if(flag==1)
        {
            flag++;
            ans=n1+n2;
            b1.setText("ADDITION");
        }
        else if(flag==2)
        {
            flag++;
            ans=n1-n2;
            b1.setText("SUBTRACTION");
        }
       else if(flag==3)
        {
            flag++;
            ans=n1*n2;
            b1.setText("MULTIPLICATION");
        }
        else
        {
            flag++;
            ans=n1/n2;
            b1.setText("DIVISION");
        }
        s=Double.toString(ans);
        if(flag==5)
        {
            flag=1;
        }


    }
   public void onButtonPressed(View view)
   {
       b2=(Button)findViewById(R.id.button2);
       t.setText(s);


   }


    }



