package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import yalilearns.apkode.net.yalilearns.lession.LessonObject;

public class LeadershipCourse2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leadership_course2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startLession1(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 1: Developing a Personal Code of Ethics", "4:32", "Leadership Course 2 Lesson 1", "Learn how to build a personal code of ethics that will help you as a leader and boost confidence in your decision making.", "seVsxNdrCrM"));
        startActivity(intent);
    }

    public void startLession2(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 2: The Art of Public Speaking", "3:53", "Leadership Course 2 Lesson 2", "Whether it’s speaking up in a meeting or giving a presentation to a boss or clients, public speaking is essential to success. Learn how to write and deliver a speech clearly using concise, persuasive language.", "I6g8pr1fHBU"));
        startActivity(intent);
    }

    public void startLession3(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 3: Networking to Get Ahead", "4:23", "Leadership Course 2 Lesson 3", "Knowing how to network effectively is essential to growing both personally and professionally. This lesson reviews how to create a positive, useful network and the work required to maintain it.", "kIPNWX-gRls"));
        startActivity(intent);
    }
}
