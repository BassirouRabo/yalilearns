package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void startCivicLeadership(View view) {
        startActivity(new Intent(getApplicationContext(), CivicLeadership.class));
    }

    public void startLeadership(View view) {
        startActivity(new Intent(getApplicationContext(), Leadership.class));
    }

    public void startBusinessEntrepreneurship(View view) {
        startActivity(new Intent(getApplicationContext(), BusinessEntrepreneurship.class));
    }

    public void startPublicManagement(View view) {
        startActivity(new Intent(getApplicationContext(), PublicManagement.class));
    }
}
