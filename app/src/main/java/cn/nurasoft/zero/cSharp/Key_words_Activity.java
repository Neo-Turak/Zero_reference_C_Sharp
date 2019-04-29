package cn.nurasoft.zero.cSharp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * Created by Administrator on 26/02/2018.
 */

public class Key_words_Activity extends AppCompatActivity {

    TextView key1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.key_words_view);


        key1 = findViewById(R.id.Key1);
        String[] key_words=new String[78];
        key_words=getResources().getStringArray(R.array.key_words);

        int i=0;
        StringBuilder builder=new StringBuilder();
        for (String x:key_words){
            i++;
            if (i==4){
                builder.append(x).append("\n");
                i=0;
            }else{
                builder.append(x).append("      ");
            }
        }
        key1.setText(builder.toString());
        builder.delete(0,builder.length());



    }
}


