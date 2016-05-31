package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Leadership extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leadership);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startLeadershipCourse1(View view) {
        startActivity(new Intent(getApplicationContext(), LeadershipCourse1.class));
    }

    public void startLeadershipCourse2(View view) {
        startActivity(new Intent(getApplicationContext(), LeadershipCourse2.class));
    }

    public void startLeadershipCourse3(View view) {
        startActivity(new Intent(getApplicationContext(), LeadershipCourse3.class));
    }

}
