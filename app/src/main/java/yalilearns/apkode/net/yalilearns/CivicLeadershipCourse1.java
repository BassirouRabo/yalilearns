package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import yalilearns.apkode.net.yalilearns.lession.LessonObject;

public class CivicLeadershipCourse1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civic_leadership_course1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startLession1(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 1: Creating Your NGO’s Strategic Plan", "4:10", "Civic Leadership Course 1 Lesson 1", "A strategic plan provides a road map for your organization’s future by ensuring that you have a clear mission, vision and goals. Learn about how you can create and implement an effective strategic plan.", "j6dVZ5aaGCw"));
        startActivity(intent);
    }

    public void startLession2(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 2: Creating Partnerships", "5:16", "Civic Leadership Course 1 Lesson 2", "Nongovernmental organizations cannot achieve their vision alone. They must partner with other NGOs, the private sector and government to reach their goals. Learn how partnerships facilitate relationship building, coordination and collaborations on projects.", "jfleNFBR_K4"));
        startActivity(intent);
    }

    public void startLession3(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 3: Managing and Evaluating Projects", "4:07", "Civic Leadership Course 1 Lesson 3", "Work plans, operating procedures and evaluation plans are integral parts of good project management. Learn about these tools and how to create and use them.", "UTdaDd45owg"));
        startActivity(intent);
    }

    public void startLession4(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 4: Advocating for Youth", "4:56", "Civic Leadership Course 1 Lesson 4", "What makes for a practical and realistic response to challenges that today’s youth face? Learn how to identify these challenges, engage the relevant stakeholders and galvanize people to act.", "jleJzZxdDM0"));
        startActivity(intent);
    }
}
