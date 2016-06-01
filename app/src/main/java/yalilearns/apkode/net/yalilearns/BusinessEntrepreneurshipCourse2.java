package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import yalilearns.apkode.net.yalilearns.lession.LessonObject;

public class BusinessEntrepreneurshipCourse2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_entrepreneurship_course2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startLession1(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 1: Raising Capital", "4:15", "Business and Entrepreneurship Course 2 Lesson 1", "The type of capital you need and where you get it depends on the type of business you run and the market you operate in. Learn about different types of capital and when to seek it.", "mGS84qg3T3c"));
        startActivity(intent);
    }

    public void startLession2(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 2: Growing Your Business", "4:04", "Business and Entrepreneurship Course 2 Lesson 2", "To grow your business, it is crucial to find the right product for the right market. This video will teach you the best ways to find, keep and grow a customer base.", "fEdw5mUeQJo"));
        startActivity(intent);
    }

    public void startLession3(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 3: Growing Your Startup", "5:05", "Business and Entrepreneurship Course 2 Lesson 3", "Growth is the key to a successful business. This lesson will help you to identify the right time to expand a business and find new capital markets.", "mPnzI2fyuW4"));
        startActivity(intent);
    }
}
