package com.example.zacco.passwordvalidator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PasswordValidator extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_validator);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(PasswordValidator.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    /** Called when the user taps the Validate button */
    public void validatePassword(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, PasswordValidator.class);
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        Validator val = new Validator();
        val.setPassword(message);
        if (val.validate() < 5)
            message = "Not Strong!";
        else if (val.validate() == 5)
            message = "Strong!";
        else
            message = "Very Strong!";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
