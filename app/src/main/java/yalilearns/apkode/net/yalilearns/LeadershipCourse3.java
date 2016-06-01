package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import yalilearns.apkode.net.yalilearns.lession.LessonObject;

public class LeadershipCourse3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leadership_course3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startLession1(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 1: Setting and Achieving Goals", "5:00", "Leadership Course 1 Lesson 1", "As a leader, you have a vision for your organization that must be completed with both short term and long term goals. This lesson looks at the importance of setting clear goals, why it is key to involve your team members, and the basic steps for proper goal-setting.", "OO0qHZdKjKY"));
        startActivity(intent);
    }

    public void startLession2(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 2: Designing and Delivering Training", "5:11", "Leadership Course 1 Lesson 2", "Knowing the basics of how to design and deliver training is necessary to providing a positive learning experience that will benefit the individual and any organization.", "VDWAiP3eikg"));
        startActivity(intent);
    }

    public void startLession3(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 3: Improving Your Network, Your Team and Your Organizational Structure", "4:52", "Leadership Course 1 Lesson 3", "Recruiting and developing the right team is critical to success. A diverse set of individuals who can challenge and support your management decisions are key to succeeding in a global market.", "h3yG7DJAhVk"));
        startActivity(intent);
    }
}
