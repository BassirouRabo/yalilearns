package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import yalilearns.apkode.net.yalilearns.lession.LessonObject;

public class CivicLeadershipCourse2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civic_leadership_course2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startLession1(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 1: Attracting and Motivating Volunteers", "3:42", "Civic Leadership Course 2 Lesson 1", "A strong body of volunteers can make the difference between success and failure. Learn how to recruit and retain volunteers who are committed to your organization’s mission.", "ynvaeQI4eV4"));
        startActivity(intent);
    }

    public void startLession2(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 2: Inspiring Community Participation", "4:32", "Civic Leadership Course 2 Lesson 2", "This lesson demonstrates how to inspire citizens to take positive actions on their collective behalf and maintain their involvement for the long term.", "BzqtEa_07bM"));
        startActivity(intent);
    }

    public void startLession3(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 3: Engaging Your Community", "4:27", "Civic Leadership Course 2 Lesson 3", "Community engagement is about involving the people you serve as beneficiaries and as partners in your mission. Learn about ways to foster community engagement.", "slFrpJ08_8o"));
        startActivity(intent);
    }

    public void startLession4(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 4: Creating a Successful Grassroots Campaign", "5:04", "Civic Leadership Course 2 Lesson 4", "This lesson provides step-by-step recommendations for building a realistic and achievable movement for change by implementing grassroots campaigns, identifying tasks and delegating responsibility.", "ShWAEwk1dwo"));
        startActivity(intent);
    }
}
