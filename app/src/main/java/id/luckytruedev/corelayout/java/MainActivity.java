package id.luckytruedev.corelayout.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.luckytruedev.corelayout.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
