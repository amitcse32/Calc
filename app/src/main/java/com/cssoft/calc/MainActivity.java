package com.cssoft.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String val1="";
    String val2="";
    String oprator="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void numberClick(View v) {



        if(oprator.equals("")) {
            TextView textView = findViewById(R.id.textViewOutPut);
            String var = ((Button) v).getText().toString();
            val1 += var;
            textView.setText(val1);
        }
        else
        {
            TextView textView = findViewById(R.id.textViewOutPut);
            String var = ((Button) v).getText().toString();
            val2 += var;
            textView.setText(val2);
        }

    }

    public void onOpratorClick(View view)
    {
        String var=((Button)view).getText().toString();
        if(var.equals("="))
        {
                if(oprator.equals("+"))
                {
                    int total=Integer.parseInt(val1)+Integer.parseInt(val2);
                    TextView textView = findViewById(R.id.textViewOutPut);
                    textView.setText(total+"");
                }

            if(oprator.equals("-"))
            {
                int total=Integer.parseInt(val1)-Integer.parseInt(val2);
                TextView textView = findViewById(R.id.textViewOutPut);
                textView.setText(total+"");
            }
            if(oprator.equals("X"))
            {
                int total=Integer.parseInt(val1)*Integer.parseInt(val2);
                TextView textView = findViewById(R.id.textViewOutPut);
                textView.setText(total+"");
            }
        }
        else {
            oprator = var;
        }
    }

}
