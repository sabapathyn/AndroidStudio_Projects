package com.example.course_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class select_courses_term1 extends AppCompatActivity {
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_courses_term1);
    ListView listView = (ListView) findViewById(R.id.xinfolist);
    String xinfolist[] = new String[] {"CS225 Health Analytics","CS223 Data Science","CS277 Discrete Structure","CS340 Evolutionary Computation","CS356 Theory of Computing","CS364 Mobile App Development","CS368 Data Communications and Networking","CS375 Operating Systems"};


    ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, xinfolist);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {



            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS225 Health Analytics");
                    intent.putExtra("course description", "Healthcare analytics is the branch of analysis that focuses on offering insights into hospital management, patient records, costs, diagnoses, and more.");
                    startActivity(intent);
                }

                if (position == 1) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS223 Data Science");
                    intent.putExtra("course description", "Data science is a multi-disciplinary field that uses scientific methods, processes, algorithms and systems to extract knowledge and insights from structured and unstructured data.");
                    startActivity(intent);
                }

                if (position == 2) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS277 Discrete Structure");
                    intent.putExtra("course description", "Discrete objects can often be enumerated by integers. More formally, discrete mathematics has been characterized as the branch of mathematics dealing with countable sets (finite sets or sets with the same cardinality as the natural numbers).");
                    startActivity(intent);
                }

                if (position == 3) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS340 Evolutionary Computation");
                    intent.putExtra("course description", "In computer science, evolutionary computation is a family of algorithms for global optimization inspired by biological evolution, and the subfield of artificial intelligence and soft computing studying these algorithms.");
                    startActivity(intent);
                }

                if (position == 4) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS356 Theory of Computing Term1");
                    intent.putExtra("course description", "The theory of computation is a branch of computer science and mathematics combined that deals with how efficiently problems can be solved on a model of computation, using an algorithm \nPrerequisite is CS255 and CS277");
                    startActivity(intent);
                }

                if (position == 5) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS364 Mobile App Development");
                    intent.putExtra("course description", "Mobile app development is the act or process by which a mobile app is developed for mobile devices, such as personal digital assistants, enterprise digital assistants or mobile phones. ... Mobile UI considers constraints, contexts, screen, input, and mobility as outlines for design.");
                    startActivity(intent);
                }

                if (position == 6) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS368 Data Communications and Networking");
                    intent.putExtra("course description", "Data Communications and Networking is designed to help students understand the basics of data communications and networking, and the protocols used in the Internet in particular by using the protocol layering of the Internet and TCP/IP protocol suite.");
                    startActivity(intent);
                }

                if (position == 7) {

                    Intent intent = new Intent(view.getContext(),CourseDetail.class);
                    intent.putExtra("course name", "CS375 Operating Systems");
                    intent.putExtra("course description", "Operating system (OS), program that manages a computer's resources, especially the allocation of those resources among other programs. Typical resources include the central processing unit (CPU), computer memory, file storage, input/output (I/O) devices, and network connections.");
                    startActivity(intent);
                }
            }
        });


    }
}
