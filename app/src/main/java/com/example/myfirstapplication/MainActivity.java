package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private String s = "";
    private String ss = "";
    private String sss = "";
    private String txt2 = "";
    private int flag;
    boolean b = false;
    private TextView textview1, textview2;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,btnp, btnm, btnmu, btnd, btnc, btnb, btneq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public String operation(String s1,String s2,int Flag){
        float result, a, b;
        a = Float.valueOf(s1);
        b = Float.valueOf(s2);
        if(Flag==1){
            result = a+b;
            return String.valueOf(result);
        }
        else if(Flag==2){
            result = a-b;
            return String.valueOf(result);
        }
        else if(Flag==3){
            result = a * b;
            return String.valueOf(result);
        }
        else{
            result = a / b;
            return String.valueOf(result);
        }
    }


    public void addListenerOnButton(){
        textview1 = (TextView)findViewById(R.id.textView1);
        textview2 = (TextView)findViewById(R.id.textView2);


        btn0 = (Button)findViewById(R.id.button0);
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = s.concat("0");
                textview1.setText(s);
                if(b){
                    ss = ss.concat("0");
                    txt2 = operation(sss, ss, flag);
                    textview2.setText(txt2);
                }
            }
        });
        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = s.concat("1");
                textview1.setText(s);
                if(b){
                    ss = ss.concat("1");
                    txt2 = operation(sss, ss, flag);
                    textview2.setText(txt2);
                }
            }
        });
        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = s.concat("2");
                textview1.setText(s);
                if(b){
                    ss = ss.concat("2");
                    txt2 = operation(sss, ss, flag);
                    textview2.setText(txt2);
                }
            }
        });
        btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = s.concat("3");
                textview1.setText(s);
                if(b){
                    ss = ss.concat("3");
                    txt2 = operation(sss, ss, flag);
                    textview2.setText(txt2);
                }
            }
        });
        btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = s.concat("4");
                textview1.setText(s);
                if(b){
                    ss = ss.concat("4");
                    txt2 = operation(sss, ss, flag);
                    textview2.setText(txt2);
                }
            }
        });
        btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = s.concat("5");
                textview1.setText(s);
                if(b){
                    ss = ss.concat("5");
                    txt2 = operation(sss, ss, flag);
                    textview2.setText(txt2);
                }
            }
        });
        btn6 = (Button)findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = s.concat("6");
                textview1.setText(s);
                if(b){
                    ss = ss.concat("6");
                    txt2 = operation(sss, ss, flag);
                    textview2.setText(txt2);
                }
            }
        });
        btn7 = (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = s.concat("7");
                textview1.setText(s);
                if(b){
                    ss = ss.concat("7");
                    txt2 = operation(sss, ss, flag);
                    textview2.setText(txt2);
                }
            }
        });
        btn8 = (Button)findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = s.concat("8");
                textview1.setText(s);
                if(b){
                    ss = ss.concat("8");
                    txt2 = operation(sss, ss, flag);
                    textview2.setText(txt2);
                }
            }
        });
        btn9 = (Button)findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = s.concat("9");
                textview1.setText(s);
                if(b){
                    ss = ss.concat("9");
                    txt2 = operation(sss, ss, flag);
                    textview2.setText(txt2);
                }
            }
        });
        btnp = (Button)findViewById(R.id.buttonP);
        btnp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                flag = 1;
                b = true;
                s = s.concat("+");
                textview1.setText(s);
                ss = "";
                sss = txt2;
                if (sss.isEmpty()) {
                    sss = s.substring(0, s.length() - 1);
                }
            }
        });
        btnm = (Button)findViewById(R.id.buttonM);
        btnm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                flag = 2;
                b = true;
                s = s.concat("-");
                textview1.setText(s);
                ss = "";
                sss = txt2;
                if(sss.isEmpty()){
                    sss = s.substring(0, s.length() - 1);;
                }
            }
        });
        btnmu = (Button)findViewById(R.id.buttonMu);
        btnmu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                flag = 3;
                b = true;
                s = s.concat("*");
                textview1.setText(s);
                ss = "";
                sss = txt2;
                if(sss.isEmpty()){
                    sss = s.substring(0, s.length() - 1);;
                }
            }
        });
        btnd = (Button)findViewById(R.id.buttonD);
        btnd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                flag = 4;
                b = true;
                s = s.concat("/");
                textview1.setText(s);
                ss = "";
                sss = txt2;
                if(sss.isEmpty()){
                    sss = s.substring(0, s.length() - 1);;
                }
            }
        });
        btnc = (Button)findViewById(R.id.buttonC);
        btnc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                s = "";
                txt2 = "";
                ss = "";
                b = false;
                textview1.setText(s);
                textview2.setText(txt2);
            }
        });
        btnb = (Button)findViewById(R.id.buttonB);
        btnb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    s = s.substring(0, s.length() - 1);
                    textview1.setText(s);
                    if(ss.length() != 0){
                        ss = ss.substring(0,ss.length()-1);
                        txt2 = operation(sss, ss, flag);
                        textview2.setText(txt2);
                    }
                }
                catch(Exception e){
                    Toast.makeText(getApplicationContext(),"Please Enter The Number",Toast.LENGTH_LONG).show();
                }
            }
        });
        btneq = (Button)findViewById(R.id.buttonE);
        btneq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(s.length()==0){
                    String msg = "Please Enter The Number";
                    Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
                    }
                else{
                    sss = "";
                    s = txt2;
                    ss = "";
                    textview1.setText(String.valueOf(txt2));
                }
            }
        });
    }
}
