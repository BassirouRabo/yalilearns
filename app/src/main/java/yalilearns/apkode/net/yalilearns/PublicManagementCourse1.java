package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import yalilearns.apkode.net.yalilearns.lession.LessonObject;

public class PublicManagementCourse1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_management_course1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startLession1(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 1: Initiating a Public-Private Partnership", "4:00", "Public Management Course 1 Lesson 1", "Public-private partnerships borrow the best attributes of each sector. Learn more about the advantages of a public-private partnership and how to initiate one.", "ZlepVpjrlnY"));
        startActivity(intent);
    }

    public void startLession2(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 2: Implementing a Public-Private Partnership", "3:48", "Public Management Course 1 Lesson 2", "Public-private partnerships can accomplish much more together than could one organization alone. To maximize impact, learn how to implement a partnership with clarity, accountability, focus and strong leadership.", "Ytin8T2f-1Y"));
        startActivity(intent);
    }

    public void startLession3(View view) {
        Intent intent = new Intent(getApplicationContext(), Lesson.class);
        intent.putExtra("LessonObjet", new LessonObject("Lesson 3: Evaluating a Public-Private Partnership", "4:05", "Public Management Course 1 Lesson 3", "To ensure a successful public-private partnership, evaluations must have a clear logic model, goals, and measures, and must be closely monitored to ensure the desired outputs and impacts are achieved. Learn about these important features and how to evaluate a public-private partnership.", "h0rX20q7-rs"));
        startActivity(intent);
    }
}
