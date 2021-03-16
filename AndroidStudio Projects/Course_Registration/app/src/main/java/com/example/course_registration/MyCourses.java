 package com.example.course_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

 public class MyCourses extends AppCompatActivity {

     ListView listView;
     ArrayList<String> arrayList;
     ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_courses);
        final Intent intent = getIntent();
        final String message = intent.getStringExtra("course name");
        TextView textView = (TextView)findViewById(R.id.textView6);
        textView.setText(message);



        SharedPreferences spref = getSharedPreferences("preferences", MODE_PRIVATE);
        Set s = spref.getStringSet("set",null);
        Toast.makeText(getApplicationContext(),s.toString(),Toast.LENGTH_LONG).show();
        if(s !=null){
            Iterator i =s.iterator();
            arrayList = new ArrayList<String>();
            arrayList.add("CS255 Advanced Data Structure");
            arrayList.add("CS263 Computer Architecture and Organization");
            while (i.hasNext()){
                String set = i.next().toString();
                arrayList.add(set);
                String er = "CS364 Mobile App Development";
                if (arrayList.contains(er)){
                    Toast.makeText(getApplicationContext(),"arraylist"+arrayList.toString(),Toast.LENGTH_LONG).show();
                    break;
                }
            }
            listView = (ListView) findViewById(R.id.courselistview);
        adapter = new ArrayAdapter<String>(MyCourses.this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        Toast.makeText(getApplicationContext(),"arraylist"+arrayList.toString(),Toast.LENGTH_LONG).show();

           //final ListView listView = findViewById(R.id.listView); // your listview's id here
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    listView.removeViewAt(position);

                }
            });

    }

    }

}
