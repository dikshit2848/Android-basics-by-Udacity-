package com.example.android.gktester;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int answer = 0;
    boolean b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sol4_rel1(View view) {
        RadioButton option = (RadioButton) findViewById(R.id.sol4_rel1_gk);
        if (option.isChecked()) {
            answer++;
        }
    }

    public void sol3_rel2(View view) {
        RadioButton option = (RadioButton) findViewById(R.id.sol3_rel2_gk);
        if (option.isChecked()) {
            answer++;
        }
    }

    public void sol3_rel3(View view) {
        RadioButton option = (RadioButton) findViewById(R.id.sol3_rel3_gk);
        if (option.isChecked()) {
            answer++;
        }
    }

    public void sol2_rel4(View view) {
        RadioButton option = (RadioButton) findViewById(R.id.sol2_rel4_gk);
        if (option.isChecked()) {
            answer++;
        }
    }

    public void sol1_rel5(View view) {
        RadioButton option = (RadioButton) findViewById(R.id.sol1_rel5_gk);
        if (option.isChecked()) {
            answer++;
        }
    }

    public void sol3_rel6(View view) {
        RadioButton option = (RadioButton) findViewById(R.id.sol3_rel6_gk);
        if (option.isChecked()) {
            answer++;
        }
    }

    public void sol1_rel7(View view) {
        CheckBox check = (CheckBox) findViewById(R.id.sol1_rel7_gk);
        b1 = check.isChecked();
    }

    public void sol2_rel7(View view) {
        CheckBox check = (CheckBox) findViewById(R.id.sol2_rel7_gk);
        b2 = check.isChecked();
    }

    public void sol3_rel7(View view) {
        CheckBox check = (CheckBox) findViewById(R.id.sol3_rel7_gk);
        b3 = check.isChecked();
    }

    public void sol4_rel7(View view) {
        CheckBox check = (CheckBox) findViewById(R.id.sol4_rel7_gk);
        b4 = check.isChecked();
    }

    public void submit(View view) {
        EditText text1 = (EditText) findViewById(R.id.edit1_gk);
        String name = text1.getText().toString();
        if (!b1 && !b2 && b3 && b4) {
            answer++;
        }
        EditText text2 = (EditText) findViewById(R.id.edit2_gk);
        String ans = text2.getText().toString();
        if (ans.equals("Central Processing Unit")) {
            answer++;
        }
        if (answer >= 8) {
            answer = 8;
        }
        ImageView image = (ImageView) findViewById(R.id.image_gk);
        Toast.makeText(this, answer + " correct out of 8", Toast.LENGTH_SHORT).show();

        if (answer > 4) {
            image.setImageResource(R.drawable.thumbs_up);
        } else {
            image.setImageResource(R.drawable.thumbs_down);
        }
        String message = name + ",you have scored " + answer + " out of 8";
        TextView text3 = (TextView) findViewById(R.id.text_gk);
        text3.setText(message);
    }
}
