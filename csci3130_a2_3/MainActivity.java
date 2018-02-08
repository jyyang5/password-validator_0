package com.example.jingyunyang.csci3130_a2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import com.example.jingyunyang.csci3130_a2_3.Validator;

public class MainActivity extends AppCompatActivity {

    private EditText passWord;
    private TextView info;
    private Button validateButtton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        validateButtton = (Button) findViewById(R.id.buttonValidate);
        validateButtton.setOnClickListener(new MyClickListener());
    }
    class MyClickListener implements OnClickListener {
        @Override
        public void onClick(View v) {

            EditText editText = (EditText) findViewById(R.id.editTextInput);
            String message = editText.getText().toString();               // convert message to string
            Validator myValidator = new Validator();
            int[] correctRuleArry = myValidator.getArrary(message);       // array stroing whether each rule is passed
            int countCorrectRule = myValidator.validate(correctRuleArry); // number of passed rules

            String outMessage;
            if(countCorrectRule == 5)                                                        // strong password if more than three correct rules
                outMessage = "Pass "+ countCorrectRule+ " rules,password is strong!";
            else
                outMessage = "Pass "+ countCorrectRule+ " rules,password is not strong!";

            // Capture the layout's TextView and set the string as its text
            TextView textViewInfo = findViewById(R.id.textViewerInfo);

            textViewInfo.setText(outMessage);//display password strong or not in info

        }

    }





}

