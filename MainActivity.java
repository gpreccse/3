package com.example.exp2;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameInput = findViewById(R.id.nameInput);
        Button submitButton = findViewById(R.id.submitButton);
        TextView greetingText = findViewById(R.id.greetingText);

        submitButton.setOnClickListener(view -> {
            String name = nameInput.getText().toString();
            greetingText.setText("Hello, " + name);
        });
    }
}
