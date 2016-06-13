package yalilearns.apkode.net.yalilearns;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

import yalilearns.apkode.net.yalilearns.lession.LessonObject;

public class Lesson extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    public static final String API_KEY = "AIzaSyBT3YAFwPLIeFfnH5fFyYD9g_uISy1B2KE";

    public static String VIDEO_ID;

    private LessonObject lessonObjet;
    private String nom;
    private String duration;
    private String categorie;
    private String presentation;
    private Button btnLesson1, btnLesson2, btnLesson3, btnLesson4;
    private LinearLayout layoutLessonNextButton;
    private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {

        @Override
        public void onBuffering(boolean arg0) {
        }

        @Override
        public void onPaused() {
        }

        @Override
        public void onPlaying() {
        }

        @Override
        public void onSeekTo(int arg0) {
        }

        @Override
        public void onStopped() {
        }

    };
    private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {

        @Override
        public void onAdStarted() {
        }

        @Override
        public void onError(ErrorReason arg0) {
        }

        @Override
        public void onLoaded(String arg0) {
        }

        @Override
        public void onLoading() {
        }

        @Override
        public void onVideoEnded() {
        }

        @Override
        public void onVideoStarted() {
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lessonObjet = (LessonObject) getIntent().getSerializableExtra("LessonObjet");

        if (lessonObjet == null) {
            finish();
        } else {
            setContentView(R.layout.activity_course);

            VIDEO_ID = lessonObjet.getVideo();

            YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
            youTubePlayerView.initialize(API_KEY, this);

            categorie = lessonObjet.getCategorie();
            duration = lessonObjet.getDuration();
            presentation = lessonObjet.getPresentation();

            TextView txtDuration = (TextView) findViewById(R.id.txtDuration);
            TextView txtPresentation = (TextView) findViewById(R.id.txtPresentation);

            layoutLessonNextButton = (LinearLayout) findViewById(R.id.layoutLessonNextButton);

            btnLesson1 = (Button) findViewById(R.id.btnLesson1);
            btnLesson2 = (Button) findViewById(R.id.btnLesson2);
            btnLesson3 = (Button) findViewById(R.id.btnLesson3);
            btnLesson4 = (Button) findViewById(R.id.btnLesson4);

            txtDuration.setText(duration);
            txtPresentation.setText(presentation);

            setLesson();

        }


    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
        Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        /** add listeners to YouTubePlayer instance **/
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);

        /** Start buffering **/
        if (!wasRestored) {
            player.cueVideo(VIDEO_ID);
        }
    }

    public void startNextLesson(View view) {
        switch (categorie) {
            // Civic Leadership Course 1
            case "Civic Leadership Course 1 Lesson 1":
                finish();
                Intent intent1 = new Intent(getApplicationContext(), Lesson.class);
                intent1.putExtra("LessonObjet", new LessonObject("Lesson 2: Creating Partnerships", "5:16", "Civic Leadership Course 1 Lesson 2", "Nongovernmental organizations cannot achieve their vision alone. They must partner with other NGOs, the private sector and government to reach their goals. Learn how partnerships facilitate relationship building, coordination and collaborations on projects.", "jfleNFBR_K4"));
                startActivity(intent1);
                break;

            case "Civic Leadership Course 1 Lesson 2":
                finish();
                Intent intent2 = new Intent(getApplicationContext(), Lesson.class);
                intent2.putExtra("LessonObjet", new LessonObject("Lesson 3: Managing and Evaluating Projects", "4:07", "Civic Leadership Course 1 Lesson 3", "Work plans, operating procedures and evaluation plans are integral parts of good project management. Learn about these tools and how to create and use them.", "UTdaDd45owg"));
                startActivity(intent2);
                break;

            case "Civic Leadership Course 1 Lesson 3":
                finish();
                Intent intent3 = new Intent(getApplicationContext(), Lesson.class);
                intent3.putExtra("LessonObjet", new LessonObject("Lesson 4: Advocating for Youth", "4:56", "Civic Leadership Course 1 Lesson 4", "What makes for a practical and realistic response to challenges that today’s youth face? Learn how to identify these challenges, engage the relevant stakeholders and galvanize people to act.", "jleJzZxdDM0"));
                startActivity(intent3);
                break;

            case "Civic Leadership Course 1 Lesson 4":
                break;

            // Civic Leadership Course 2
            case "Civic Leadership Course 2 Lesson 1":
                finish();
                Intent intent4 = new Intent(getApplicationContext(), Lesson.class);
                intent4.putExtra("LessonObjet", new LessonObject("Lesson 2: Inspiring Community Participation", "4:32", "Civic Leadership Course 2 Lesson 2", "This lesson demonstrates how to inspire citizens to take positive actions on their collective behalf and maintain their involvement for the long term.", "BzqtEa_07bM"));
                startActivity(intent4);
                break;

            case "Civic Leadership Course 2 Lesson 2":
                finish();
                Intent intent5 = new Intent(getApplicationContext(), Lesson.class);
                intent5.putExtra("LessonObjet", new LessonObject("Lesson 3: Engaging Your Community", "4:27", "Civic Leadership Course 2 Lesson 3", "Community engagement is about involving the people you serve as beneficiaries and as partners in your mission. Learn about ways to foster community engagement.", "slFrpJ08_8o"));
                startActivity(intent5);
                break;

            case "Civic Leadership Course 2 Lesson 3":
                finish();
                Intent intent6 = new Intent(getApplicationContext(), Lesson.class);
                intent6.putExtra("LessonObjet", new LessonObject("Lesson 4: Creating a Successful Grassroots Campaign", "5:04", "Civic Leadership Course 2 Lesson 4", "This lesson provides step-by-step recommendations for building a realistic and achievable movement for change by implementing grassroots campaigns, identifying tasks and delegating responsibility.", "ShWAEwk1dwo"));
                startActivity(intent6);
                break;

            case "Civic Leadership Course 2 Lesson 4":
                break;

            // Leadership Course 1
            case "Leadership Course 1 Lesson 1":
                finish();
                Intent intent7 = new Intent(getApplicationContext(), Lesson.class);
                intent7.putExtra("LessonObjet", new LessonObject("Lesson 2: Creating and Managing A Team", "5:02", "Leadership Course 1 Lesson 2", "This lesson guides leaders in selecting, training, mentoring and managing a team that will perform optimally. It reviews what creates a motivated and productive work environment.", "ArzESTmzbkE"));
                startActivity(intent7);
                break;

            case "Leadership Course 1 Lesson 2":
                finish();
                Intent intent8 = new Intent(getApplicationContext(), Lesson.class);
                intent8.putExtra("LessonObjet", new LessonObject("Lesson 3: Managing Situations", " 4:20", "Leadership Course 1 Lesson 2", "Management is a key component of leadership and is what brings about change. Learn about the four essential skills that all managers must master to be successful.", "ifhfAY9QxHs"));
                startActivity(intent8);
                break;

            case "Leadership Course 1 Lesson 3":
                break;

            // Leadership Course 2
            case "Leadership Course 2 Lesson 1":
                finish();
                Intent intent9 = new Intent(getApplicationContext(), Lesson.class);
                intent9.putExtra("LessonObjet", new LessonObject("Lesson 2: The Art of Public Speaking", "3:53", "Leadership Course 2 Lesson 2", "Whether it’s speaking up in a meeting or giving a presentation to a boss or clients, public speaking is essential to success. Learn how to write and deliver a speech clearly using concise, persuasive language.", "I6g8pr1fHBU"));
                startActivity(intent9);
                break;

            case "Leadership Course 2 Lesson 2":
                Intent intent10 = new Intent(getApplicationContext(), Lesson.class);
                intent10.putExtra("LessonObjet", new LessonObject("Lesson 3: Networking to Get Ahead", "4:23", "Leadership Course 2 Lesson 3", "Knowing how to network effectively is essential to growing both personally and professionally. This lesson reviews how to create a positive, useful network and the work required to maintain it.", "kIPNWX-gRls"));
                startActivity(intent10);
                break;

            case "Leadership Course 2 Lesson 3":
                break;

            // Leadership Course 3
            case "Leadership Course 3 Lesson 1":
                finish();
                Intent intent11 = new Intent(getApplicationContext(), Lesson.class);
                intent11.putExtra("LessonObjet", new LessonObject("Lesson 2: Designing and Delivering Training", "5:11", "Leadership Course 1 Lesson 2", "Knowing the basics of how to design and deliver training is necessary to providing a positive learning experience that will benefit the individual and any organization.", "VDWAiP3eikg"));
                startActivity(intent11);
                break;

            case "Leadership Course 3 Lesson 2":
                finish();
                Intent intent12 = new Intent(getApplicationContext(), Lesson.class);
                intent12.putExtra("LessonObjet", new LessonObject("Lesson 3: Improving Your Network, Your Team and Your Organizational Structure", "4:52", "Leadership Course 1 Lesson 3", "Recruiting and developing the right team is critical to success. A diverse set of individuals who can challenge and support your management decisions are key to succeeding in a global market.", "h3yG7DJAhVk"));
                startActivity(intent12);
                break;

            case "Leadership Course 3 Lesson 3":
                break;

            // Business et Entrepreneurship Course 1
            case "Business and Entrepreneurship Course 1 Lesson 1":
                finish();
                Intent intent13 = new Intent(getApplicationContext(), Lesson.class);
                intent13.putExtra("LessonObjet", new LessonObject("Lesson 2: Creating a Business Plan", "4:47", "Business and Entrepreneurship Course 1 Lesson 2", "Composing a business plan is the first and most important step in launching a business. This lesson highlights the key elements of a business plan that will attract the right investors and help you recruit the the right team.", "anrzJyWshFg"));
                startActivity(intent13);
                break;

            case "Business and Entrepreneurship Course 1 Lesson 2":
                finish();
                Intent intent14 = new Intent(getApplicationContext(), Lesson.class);
                intent14.putExtra("LessonObjet", new LessonObject("Lesson 3: Identifying Your Markets", "5:00", "Business and Entrepreneurship Course 1 Lesson 3", "To develop a successful product, entrepreneurs need to examine the market in which they want to operate. They also must be able to identify their potential customers and their personal strengths and weaknesses, then structure their business accordingly.", "Xy-6PLSKKJE"));
                startActivity(intent14);
                break;

            case "Business and Entrepreneurship Course 1 Lesson 3":
                finish();
                Intent intent15 = new Intent(getApplicationContext(), Lesson.class);
                intent15.putExtra("LessonObjet", new LessonObject("Lesson 4: Pitching Your Business Ideas for Investment", "4:52", "Business and Entrepreneurship Course 1 Lesson 4", "Most entrepreneurs will require funders who are willing to put financial resources toward an idea. This lesson will introduce some of the best practices for developing your pitch to potential investors.", "sd2X3e9IKLQ"));
                startActivity(intent15);
                break;

            case "Business and Entrepreneurship Course 1 Lesson 4":
                break;

            // Business et Entrepreneurship Course 2
            case "Business and Entrepreneurship Course 2 Lesson 1":
                finish();
                Intent intent16 = new Intent(getApplicationContext(), Lesson.class);
                intent16.putExtra("LessonObjet", new LessonObject("Lesson 2: Growing Your Business", "4:04", "Business and Entrepreneurship Course 2 Lesson 2", "To grow your business, it is crucial to find the right product for the right market. This video will teach you the best ways to find, keep and grow a customer base.", "fEdw5mUeQJo"));
                startActivity(intent16);
                break;

            case "Business and Entrepreneurship Course 2 Lesson 2":
                finish();
                Intent intent17 = new Intent(getApplicationContext(), Lesson.class);
                intent17.putExtra("LessonObjet", new LessonObject("Lesson 3: Growing Your Startup", "5:05", "Business and Entrepreneurship Course 2 Lesson 3", "Growth is the key to a successful business. This lesson will help you to identify the right time to expand a business and find new capital markets.", "mPnzI2fyuW4"));
                startActivity(intent17);
                break;

            case "Business and Entrepreneurship Course 2 Lesson 3":
                break;

            // Public Management Course 1
            case "Public Management Course 1 Lesson 1":
                finish();
                Intent intent18 = new Intent(getApplicationContext(), Lesson.class);
                intent18.putExtra("LessonObjet", new LessonObject("Lesson 2: Implementing a Public-Private Partnership", "3:48", "Public Management Course 1 Lesson 2", "Public-private partnerships can accomplish much more together than could one organization alone. To maximize impact, learn how to implement a partnership with clarity, accountability, focus and strong leadership.", "Ytin8T2f-1Y"));
                startActivity(intent18);
                break;

            case "Public Management Course 1 Lesson 2":
                finish();
                Intent intent19 = new Intent(getApplicationContext(), Lesson.class);
                intent19.putExtra("LessonObjet", new LessonObject("Lesson 3: Evaluating a Public-Private Partnership", "4:05", "Public Management Course 1 Lesson 3", "To ensure a successful public-private partnership, evaluations must have a clear logic model, goals, and measures, and must be closely monitored to ensure the desired outputs and impacts are achieved. Learn about these important features and how to evaluate a public-private partnership.", "h0rX20q7-rs"));
                startActivity(intent19);
                break;

            case "Public Management Course 1 Lesson 3":
                break;

            // Public Management Course 2
            case "Public Management Course 2 Lesson 1":
                finish();
                Intent intent20 = new Intent(getApplicationContext(), Lesson.class);
                intent20.putExtra("LessonObjet", new LessonObject("Lesson 2: Becoming an Effective Public Servant", "4:09", "Public Management Course 2 Lesson 1", "After being elected to public office, how does one ensure that the needs of the community are being met? This video provides advice from Allison Silberberg, vice mayor of the city of Alexandria, Virginia.", "PZUIdhdIpSA"));
                startActivity(intent20);
                break;

            case "Public Management Course 2 Lesson 2":
                finish();
                Intent intent21 = new Intent(getApplicationContext(), Lesson.class);
                intent21.putExtra("LessonObjet", new LessonObject("Lesson 3: Communicating with the Public", "3:26", "Public Management Course 2 Lesson 1", "This lesson examines the tools needed for elected officials and public servants to establish accurate, efficient, responsive and varied channels of communication with the citizens they serve.", "bgfCp2ZsiaY"));
                startActivity(intent21);
                break;

            case "Public Management Course 2 Lesson 3":
                break;

        }
    }

    private void setLesson() {
        LinearLayout layoutPassExam = (LinearLayout)findViewById(R.id.layoutPassExam);
        Button btnPassExam = (Button)findViewById(R.id.btnPassExam);



        switch (categorie) {
            // Civic Leadership Course 1
            case "Civic Leadership Course 1 Lesson 1":
                btnLesson1.setText("Lesson 1: Creating Your NGO’s Strategic Plan");
                btnLesson2.setText("Lesson 2: Creating Partnerships");
                btnLesson3.setText("Lesson 3: Managing and Evaluating Projects");
                btnLesson4.setText("Lesson 4: Advocating for Youth");

                btnLesson1.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Civic Leadership Course 1 Lesson 2":
                btnLesson1.setText("Lesson 1: Creating Your NGO’s Strategic Plan");
                btnLesson2.setText("Lesson 2: Creating Partnerships");
                btnLesson3.setText("Lesson 3: Managing and Evaluating Projects");
                btnLesson4.setText("Lesson 4: Advocating for Youth");

                btnLesson2.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Civic Leadership Course 1 Lesson 3":
                btnLesson1.setText("Lesson 1: Creating Your NGO’s Strategic Plan");
                btnLesson2.setText("Lesson 2: Creating Partnerships");
                btnLesson3.setText("Lesson 3: Managing and Evaluating Projects");
                btnLesson4.setText("Lesson 4: Advocating for Youth");

                btnLesson3.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Civic Leadership Course 1 Lesson 4":
                btnLesson1.setText("Lesson 1: Creating Your NGO’s Strategic Plan");
                btnLesson2.setText("Lesson 2: Creating Partnerships");
                btnLesson3.setText("Lesson 3: Managing and Evaluating Projects");
                btnLesson4.setText("Lesson 4: Advocating for Youth");

                btnLesson4.setTextColor(getResources().getColor(R.color.colorPrimary));
                layoutLessonNextButton.setVisibility(View.GONE);
                layoutPassExam.setVisibility(View.VISIBLE);
                btnPassExam.setTag(11);


                break;

            // Civic Leadership Course 2
            case "Civic Leadership Course 2 Lesson 1":
                btnLesson1.setText("Lesson 1: Attracting and Motivating Volunteers");
                btnLesson2.setText("Lesson 2: Inspiring Community Participation");
                btnLesson3.setText("Lesson 3: Engaging Your Community");
                btnLesson4.setText("Lesson 4: Creating a Successful Grassroots Campaign");

                btnLesson1.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Civic Leadership Course 2 Lesson 2":
                btnLesson1.setText("Lesson 1: Attracting and Motivating Volunteers");
                btnLesson2.setText("Lesson 2: Inspiring Community Participation");
                btnLesson3.setText("Lesson 3: Engaging Your Community");
                btnLesson4.setText("Lesson 4: Creating a Successful Grassroots Campaign");

                btnLesson2.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Civic Leadership Course 2 Lesson 3":
                btnLesson1.setText("Lesson 1: Attracting and Motivating Volunteers");
                btnLesson2.setText("Lesson 2: Inspiring Community Participation");
                btnLesson3.setText("Lesson 3: Engaging Your Community");
                btnLesson4.setText("Lesson 4: Creating a Successful Grassroots Campaign");

                btnLesson3.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Civic Leadership Course 2 Lesson 4":
                btnLesson1.setText("Lesson 1: Attracting and Motivating Volunteers");
                btnLesson2.setText("Lesson 2: Inspiring Community Participation");
                btnLesson3.setText("Lesson 3: Engaging Your Community");
                btnLesson4.setText("Lesson 4: Creating a Successful Grassroots Campaign");

                btnLesson4.setTextColor(getResources().getColor(R.color.colorPrimary));
                layoutLessonNextButton.setVisibility(View.GONE);
                layoutPassExam.setVisibility(View.VISIBLE);
                btnPassExam.setTag(12);
                break;

            // Leadership Course 1
            case "Leadership Course 1 Lesson 1":
                btnLesson1.setText("Lesson 1: Leading People and Change");
                btnLesson2.setText("Lesson 2: Creating and Managing A Team");
                btnLesson3.setText("Lesson 3: Managing Situations");

                btnLesson4.setVisibility(View.GONE);

                btnLesson1.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Leadership Course 1 Lesson 2":
                btnLesson1.setText("Lesson 1: Leading People and Change");
                btnLesson2.setText("Lesson 2: Creating and Managing A Team");
                btnLesson3.setText("Lesson 3: Managing Situations");

                btnLesson4.setVisibility(View.GONE);

                btnLesson2.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Leadership Course 1 Lesson 3":
                btnLesson1.setText("Lesson 1: Leading People and Change");
                btnLesson2.setText("Lesson 2: Creating and Managing A Team");
                btnLesson3.setText("Lesson 3: Managing Situations");

                btnLesson4.setVisibility(View.GONE);

                btnLesson3.setTextColor(getResources().getColor(R.color.colorPrimary));
                layoutLessonNextButton.setVisibility(View.GONE);
                layoutPassExam.setVisibility(View.VISIBLE);
                btnPassExam.setTag(21);
                break;

            // Leadership Course 2
            case "Leadership Course 2 Lesson 1":
                btnLesson1.setText("Lesson 1: Developing a Personal Code of Ethics");
                btnLesson2.setText("Lesson 2: The Art of Public Speaking");
                btnLesson3.setText("Lesson 3: Networking to Get Ahead");

                btnLesson4.setVisibility(View.GONE);

                btnLesson1.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Leadership Course 2 Lesson 2":
                btnLesson1.setText("Lesson 1: Developing a Personal Code of Ethics");
                btnLesson2.setText("Lesson 2: The Art of Public Speaking");
                btnLesson3.setText("Lesson 3: Networking to Get Ahead");

                btnLesson4.setVisibility(View.GONE);

                btnLesson2.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Leadership Course 2 Lesson 3":
                btnLesson1.setText("Lesson 1: Developing a Personal Code of Ethics");
                btnLesson2.setText("Lesson 2: The Art of Public Speaking");
                btnLesson3.setText("Lesson 3: Networking to Get Ahead");

                btnLesson4.setVisibility(View.GONE);

                btnLesson3.setTextColor(getResources().getColor(R.color.colorPrimary));
                layoutLessonNextButton.setVisibility(View.GONE);
                layoutPassExam.setVisibility(View.VISIBLE);
                btnPassExam.setTag(22);
                break;

            // Leadership Course 3
            case "Leadership Course 3 Lesson 1":
                btnLesson1.setText("Lesson 1: Setting and Achieving Goals");
                btnLesson2.setText("Lesson 2: Designing and Delivering Training");
                btnLesson3.setText("Lesson 3: Improving Your Network, Your Team and Your Organizational Structure");

                btnLesson4.setVisibility(View.GONE);

                btnLesson1.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Leadership Course 3 Lesson 2":
                btnLesson1.setText("Lesson 1: Setting and Achieving Goals");
                btnLesson2.setText("Lesson 2: Designing and Delivering Training");
                btnLesson3.setText("Lesson 3: Improving Your Network, Your Team and Your Organizational Structure");

                btnLesson4.setVisibility(View.GONE);

                btnLesson2.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Leadership Course 3 Lesson 3":
                btnLesson1.setText("Lesson 1: Setting and Achieving Goals");
                btnLesson2.setText("Lesson 2: Designing and Delivering Training");
                btnLesson3.setText("Lesson 3: Improving Your Network, Your Team and Your Organizational Structure");

                btnLesson4.setVisibility(View.GONE);

                btnLesson3.setTextColor(getResources().getColor(R.color.colorPrimary));
                layoutLessonNextButton.setVisibility(View.GONE);
                layoutPassExam.setVisibility(View.VISIBLE);
                btnPassExam.setTag(23);
                break;


            // Business et Entrepreneurship Course 1
            case "Business and Entrepreneurship Course 1 Lesson 1":
                btnLesson1.setText("Lesson 1: Developing a Business Model");
                btnLesson2.setText("Lesson 2: Creating a Business Plan");
                btnLesson3.setText("Lesson 3: Identifying Your Markets");
                btnLesson4.setText("Lesson 4: Pitching Your Business Ideas for Investment");

                btnLesson1.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Business and Entrepreneurship Course 1 Lesson 2":
                btnLesson1.setText("Lesson 1: Developing a Business Model");
                btnLesson2.setText("Lesson 2: Creating a Business Plan");
                btnLesson3.setText("Lesson 3: Identifying Your Markets");
                btnLesson4.setText("Lesson 4: Pitching Your Business Ideas for Investment");

                btnLesson2.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Business and Entrepreneurship Course 1 Lesson 3":
                btnLesson1.setText("Lesson 1: Developing a Business Model");
                btnLesson2.setText("Lesson 2: Creating a Business Plan");
                btnLesson3.setText("Lesson 3: Identifying Your Markets");
                btnLesson4.setText("Lesson 4: Pitching Your Business Ideas for Investment");

                btnLesson3.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Business and Entrepreneurship Course 1 Lesson 4":
                btnLesson1.setText("Lesson 1: Developing a Business Model");
                btnLesson2.setText("Lesson 2: Creating a Business Plan");
                btnLesson3.setText("Lesson 3: Identifying Your Markets");
                btnLesson4.setText("Lesson 4: Pitching Your Business Ideas for Investment");

                btnLesson4.setTextColor(getResources().getColor(R.color.colorPrimary));
                layoutLessonNextButton.setVisibility(View.GONE);
                layoutPassExam.setVisibility(View.VISIBLE);
                btnPassExam.setTag(31);
                break;

            // Business et Entrepreneurship Course 2
            case "Business and Entrepreneurship Course 2 Lesson 1":
                btnLesson1.setText("Lesson 1: Raising Capital");
                btnLesson2.setText("Lesson 2: Growing Your Business");
                btnLesson3.setText("Lesson 3: Growing Your Startup");
                btnLesson4.setVisibility(View.GONE);

                btnLesson1.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Business and Entrepreneurship Course 2 Lesson 2":
                btnLesson1.setText("Lesson 1: Raising Capital");
                btnLesson2.setText("Lesson 2: Growing Your Business");
                btnLesson3.setText("Lesson 3: Growing Your Startup");
                btnLesson4.setVisibility(View.GONE);

                btnLesson2.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Business and Entrepreneurship Course 2 Lesson 3":
                btnLesson1.setText("Lesson 1: Raising Capital");
                btnLesson2.setText("Lesson 2: Growing Your Business");
                btnLesson3.setText("Lesson 3: Growing Your Startup");
                btnLesson4.setVisibility(View.GONE);

                btnLesson3.setTextColor(getResources().getColor(R.color.colorPrimary));
                layoutLessonNextButton.setVisibility(View.GONE);
                layoutPassExam.setVisibility(View.VISIBLE);
                btnPassExam.setTag(32);
                break;

            // Public Management Course 1
            case "Public Management Course 1 Lesson 1":
                btnLesson1.setText("Lesson 1: Initiating a Public-Private Partnership");
                btnLesson2.setText("Lesson 2: Implementing a Public-Private Partnership");
                btnLesson3.setText("Lesson 3: Evaluating a Public-Private Partnership");

                btnLesson4.setVisibility(View.GONE);

                btnLesson1.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Public Management Course 1 Lesson 2":
                btnLesson1.setText("Lesson 1: Initiating a Public-Private Partnership");
                btnLesson2.setText("Lesson 2: Implementing a Public-Private Partnership");
                btnLesson3.setText("Lesson 3: Evaluating a Public-Private Partnership");

                btnLesson4.setVisibility(View.GONE);

                btnLesson2.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Public Management Course 1 Lesson 3":
                btnLesson1.setText("Lesson 1: Initiating a Public-Private Partnership");
                btnLesson2.setText("Lesson 2: Implementing a Public-Private Partnership");
                btnLesson3.setText("Lesson 3: Evaluating a Public-Private Partnership");

                btnLesson4.setVisibility(View.GONE);

                btnLesson3.setTextColor(getResources().getColor(R.color.colorPrimary));
                layoutLessonNextButton.setVisibility(View.GONE);
                layoutPassExam.setVisibility(View.VISIBLE);
                btnPassExam.setTag(41);
                break;


            // Public Management Course 2
            case "Public Management Course 2 Lesson 1":
                btnLesson1.setText("Lesson 1: Establishing Professional Ethics in Government");
                btnLesson2.setText("Lesson 2: Becoming an Effective Public Servant");
                btnLesson3.setText("Lesson 3: Communicating with the Public");

                btnLesson4.setVisibility(View.GONE);

                btnLesson1.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Public Management Course 2 Lesson 2":
                btnLesson1.setText("Lesson 1: Establishing Professional Ethics in Government");
                btnLesson2.setText("Lesson 2: Becoming an Effective Public Servant");
                btnLesson3.setText("Lesson 3: Communicating with the Public");

                btnLesson4.setVisibility(View.GONE);

                btnLesson2.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

            case "Public Management Course 2 Lesson 3":
                btnLesson1.setText("Lesson 1: Establishing Professional Ethics in Government");
                btnLesson2.setText("Lesson 2: Becoming an Effective Public Servant");
                btnLesson3.setText("Lesson 3: Communicating with the Public");

                btnLesson4.setVisibility(View.GONE);

                btnLesson3.setTextColor(getResources().getColor(R.color.colorPrimary));
                layoutLessonNextButton.setVisibility(View.GONE);
                layoutPassExam.setVisibility(View.VISIBLE);
                btnPassExam.setTag(42);
                break;
        }
    }

    public void startPassExam(View view) {
        Integer tag = (Integer)view.getTag();
        String lien = "";

        switch (tag){
            case 11 :
            lien = "https://yali.state.gov/courses/quiz-social-ent";
                break;
            case 12:
                lien = "https://yali.state.gov/courses/quiz-community-org";
                break;
            case 21 :
                lien = "https://yali.state.gov/courses/quiz-management-strategies/";
                break;
            case 22 :
                lien = "https://yali.state.gov/courses/quiz-personal-growth/";
                break;
            case 23 :
                lien = "https://yali.state.gov/courses/quiz-workforce-collab/";
                break;
            case 31 :
                lien = "https://yali.state.gov/courses/quiz-starting-biz/";
                break;
            case 32 :
                lien = "https://yali.state.gov/courses/quiz-biz-expansion/";
                break;
            case 41 :
                lien = "https://yali.state.gov/courses/quiz-public-private/";
                break;
            case 42 :
                lien = "https://yali.state.gov/courses/quiz-pub-sec-service/";
                break;

        }

        if(!lien.equals("")){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(lien)));
        }

    }
}