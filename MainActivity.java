package com.example.slip12q2b;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    TextView textView;
    DatePicker datePicker;
    TimePicker timePicker;
    Button showButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        showButton = findViewById(R.id.showButton);
        showButton.setOnClickListener(v -> {
            int day = datePicker.getDayOfMonth();
            int month = datePicker.getMonth() + 1;
            int year = datePicker.getYear();
            int hour = timePicker.getHour();
            int minute = timePicker.getMinute();
            String selectedDateTime = "Selected Date: " + day + "/" + month + "/" + year +
                    "\nSelected Time: " + hour + ":" + String.format("%02d", minute);
            textView.setText(selectedDateTime);
        });
    }
}
