package dynamic.final_version;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CustomCalendarView customCalendarView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customCalendarView = (CustomCalendarView)findViewById(R.id.custom_calendar_view);
    }
}
