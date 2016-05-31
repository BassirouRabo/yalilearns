package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BusinessEntrepreneurship extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_entrepreneurship);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startBusinessEntrepreneurshipCourse1(View view) {
        startActivity(new Intent(getApplicationContext(), BusinessEntrepreneurshipCourse1.class));
    }

    public void startBusinessEntrepreneurshipCourse2(View view) {
        startActivity(new Intent(getApplicationContext(), BusinessEntrepreneurshipCourse2.class));
    }
}
