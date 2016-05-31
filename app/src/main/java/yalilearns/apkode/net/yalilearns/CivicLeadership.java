package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CivicLeadership extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civic_leadership);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startCivicLeadershipCourse1(View view) {
        startActivity(new Intent(getApplicationContext(), CivicLeadershipCourse1.class));
    }

    public void startCivicLeadershipCourse2(View view) {
        startActivity(new Intent(getApplicationContext(), CivicLeadershipCourse2.class));
    }
}
