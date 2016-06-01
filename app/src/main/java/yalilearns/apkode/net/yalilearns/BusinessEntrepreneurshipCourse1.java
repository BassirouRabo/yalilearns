package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import yalilearns.apkode.net.yalilearns.lession.LessonObject;

public class BusinessEntrepreneurshipCourse1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_entrepreneurship_course1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startLession1(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 1: Developing a Business Model", "3:58", "Business and Entrepreneurship Course 1 Lesson 1", "Learn how to develop business models that include a description of the target customer, an outline of an identified problem and an explanation of how a product or service will solve that probl", "A44RjlOU4Jw"));
        startActivity(intent);
    }

    public void startLession2(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 2: Creating a Business Plan", "4:47", "Business and Entrepreneurship Course 1 Lesson 2", "Composing a business plan is the first and most important step in launching a business. This lesson highlights the key elements of a business plan that will attract the right investors and help you recruit the the right team.", "anrzJyWshFg"));
        startActivity(intent);
    }

    public void startLession3(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 3: Identifying Your Markets", "5:00", "Business and Entrepreneurship Course 1 Lesson 3", "To develop a successful product, entrepreneurs need to examine the market in which they want to operate. They also must be able to identify their potential customers and their personal strengths and weaknesses, then structure their business accordingly.", "Xy-6PLSKKJE"));
        startActivity(intent);
    }

    public void startLession4(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 4: Pitching Your Business Ideas for Investment", "4:52", "Business and Entrepreneurship Course 1 Lesson 4", "Most entrepreneurs will require funders who are willing to put financial resources toward an idea. This lesson will introduce some of the best practices for developing your pitch to potential investors.", "sd2X3e9IKLQ"));
        startActivity(intent);
    }
}
