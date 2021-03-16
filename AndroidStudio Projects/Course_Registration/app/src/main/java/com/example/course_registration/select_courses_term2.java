package com.example.course_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class select_courses_term2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_courses_term2);
        ListView listView = (ListView) findViewById(R.id.term2list);
        final String term2list[] = new String[] {"CS128 Introduction to Coding","CS215 Social Issues","CS263 Computer Architecture and Organization","CS275 Database Management Systems","CS356 Theory of Computing"};


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, term2list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS128 Introduction to Coding");
                    intent.putExtra("course description", "Healthcare analytics is the branch of analysis that focuses on offering insights into hospital management, patient records, costs, diagnoses, and more.");
                    startActivity(intent);
                }


                if (position == 1) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS215 Social Issues");
                    intent.putExtra("course description", "A social issue is a problem that influences many individuals within a society. A social issue has many categories in depth as well as light. It's a common problem we see happening in our society. A social issue can be considered as a problem that influences many people and many peoples strive to solve the issue");
                    startActivity(intent);
                }

                if (position == 2) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS263 Computer Architecture and Organization");
                    intent.putExtra("course description", "Computer Organization and Architecture is the study of internal working, structuring and implementation of a computer system.\nPrerequisite is CS255");
                    startActivity(intent);
                }

                if (position == 3) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS275 Database Management Systems");
                    intent.putExtra("course description", "Database Management System is a software for storing and retrieving users' data by considering appropriate security measures.\nPrerequiste is CS162");
                    startActivity(intent);
                }

                if (position == 4) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS356 Theory of Computing");
                    intent.putExtra("course description", "The theory of computation is a branch of computer science and mathematics combined that deals with how efficiently problems can be solved on a model of computation, using an algorithm.\nPrerequisite is CS255 and CS277");
                    startActivity(intent);
                }

            }
        });

    }
}
