package sg.edu.rp.c346.id19034275.registrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner schSpinner=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> schAdapter=new ArrayAdapter<String>(MainActivity.this,
        android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.schools));

        schAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        schSpinner.setAdapter(schAdapter);
    }
}
