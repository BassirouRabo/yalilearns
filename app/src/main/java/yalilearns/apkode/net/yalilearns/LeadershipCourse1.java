package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import yalilearns.apkode.net.yalilearns.lession.LessonObject;

public class LeadershipCourse1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leadership_course1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startLession1(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 1: Leading People and Change", "3:55", "Leadership Course 1 Lesson 1", "Leaders not only act as the head of corporations and governments. They also must address and solve a multitude of problems every day.", "U_lhaOfEHi0"));
        startActivity(intent);
    }

    public void startLession2(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 2: Creating and Managing A Team", "5:02", "Leadership Course 1 Lesson 2", "This lesson guides leaders in selecting, training, mentoring and managing a team that will perform optimally. It reviews what creates a motivated and productive work environment.", "ArzESTmzbkE"));
        startActivity(intent);
    }

    public void startLession3(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 3: Managing Situations", " 4:20", "Leadership Course 1 Lesson 2", "Management is a key component of leadership and is what brings about change. Learn about the four essential skills that all managers must master to be successful.", "ifhfAY9QxHs"));
        startActivity(intent);
    }
}
