package com.example.course_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;
import java.util.prefs.Preferences;

public class CourseDetail extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);
        Intent intent = getIntent();
        final String message = intent.getStringExtra("course name");
        TextView textView = (TextView)findViewById(R.id.course_name);
        textView.setText(message);
        final String message1 = intent.getStringExtra("course description");
        TextView textView1 = (TextView)findViewById(R.id.coursedescription);
        textView1.setText(message1);



        Button button = (Button)findViewById(R.id.button);
        final Intent intent2 = new Intent(this,MyCourses.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (message.contains("356 Theory of Computing Term1")) {
                    Toast.makeText(getApplicationContext(), "Cannot Register this course", Toast.LENGTH_SHORT).show();
                } else {

                    SharedPreferences spref = getSharedPreferences("preferences", MODE_PRIVATE);
                    Set s = spref.getStringSet("set", null);

                    if (s == null) {
                        Set set = new HashSet();
                        set.add(message);
                        SharedPreferences.Editor e = spref.edit();
                        e.putStringSet("set", set);
                        e.commit();
                        //Toast.makeText(getApplicationContext(),set.toString(),Toast.LENGTH_LONG).show();

                        startActivity(intent2);

                    } else {
                        s.add(message);
                        SharedPreferences.Editor e = spref.edit();
                        e.putStringSet("set", s);
                        e.commit();
                        //Toast.makeText(getApplicationContext(),s.toString(),Toast.LENGTH_LONG).show();
                        startActivity(intent2);
                    }

                    


                }
            }
        });


}
}
