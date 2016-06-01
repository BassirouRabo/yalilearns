package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import yalilearns.apkode.net.yalilearns.lession.LessonObject;

public class PublicManagementCourse2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_management_course2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startLession1(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 1: Establishing Professional Ethics in Government", "3:31", "Public Management Course 2 Lesson 1", "An ethical public servant is committed to transparency and objectivity. This lesson examines a few ways elected officials and civil servants can work to avoid situations that can lead to ethical lapses.", "SDj4MrJqQAg"));
        startActivity(intent);
    }

    public void startLession2(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 2: Becoming an Effective Public Servant", "4:09", "Public Management Course 2 Lesson 1", "After being elected to public office, how does one ensure that the needs of the community are being met? This video provides advice from Allison Silberberg, vice mayor of the city of Alexandria, Virginia.", "PZUIdhdIpSA"));
        startActivity(intent);
    }

    public void startLession3(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 3: Communicating with the Public", "3:26", "Public Management Course 2 Lesson 1", "This lesson examines the tools needed for elected officials and public servants to establish accurate, efficient, responsive and varied channels of communication with the citizens they serve.", "bgfCp2ZsiaY"));
        startActivity(intent);
    }
}
