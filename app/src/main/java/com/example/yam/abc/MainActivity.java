package com.example.yam.abc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    EditText et1,et2,et3;
    String st1,st2,st3;
    String st4;
    Double a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        wv = (WebView)findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);

    }

    public void go1(View view) {
        st1 = et1.getText().toString();
        a = Double.parseDouble(st1);
    }
    public void go2(View view){

        st2 = et2.getText().toString();
        b = Double.parseDouble(st2);
    }


    public void go3(View view){
        st1 = et1.getText().toString();
        a = Double.parseDouble(st1);
        st2 = et2.getText().toString();
        b = Double.parseDouble(st2);
        st3 = et3.getText().toString();
        c = Double.parseDouble(st3);
        st4="https://www.google.co.il/search?safe=strict&ei=aX-BWrCZG6iIgAam46bADA&q=";
        st4=st4+a+"x%5E2%2B"+b+"x%2B"+c+"&oq=4x%5E2%2B16x%2B64&gs_l=psy-ab.3...0.0.0.19651.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.dlhfF9M3lXY";
        wv.loadUrl(st4);

    }

    }

