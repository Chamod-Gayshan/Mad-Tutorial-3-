package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    //Create Button Variable
    Button btn1;
    //Create Edit text Variable
    private EditText Fnum;
    private EditText Snum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        setTitle("My Application");

        //Button Variable Initialize
        btn1 = findViewById(R.id.button);

        //Edit Text Variable Initialize
        Fnum = findViewById(R.id.editTextNumber);
        Snum = findViewById(R.id.editTextNumber2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Ok Button Codding part Start

        //One of the most usable methods in android is setOnClickListener method which helps us to link a listener
        // with certain attributes.
        // setOnClickListener is a method in Android basically used with buttons, image buttons etc.
        // You can initiate this method easily like, public void setOnClickListener(View.OnClickListner)
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override

            //java class implements Onclicklistener interface. The OnclickListener
            // interface is used by object of mainActivity to
            // call some method or perform some activity when button is clicked.
            public void onClick(View view) {

                if(Fnum.getText().toString().equals("")||Snum.getText().toString().equals("")){
                    Toast.makeText(FirstActivity.this,"Please Add Numbers", Toast.LENGTH_SHORT).show();
                }
                else{


                //Sent caught numbers is next activity
                //The toString method is used to return a string representation of an object.
                // If any object is printed, the toString() method is internally invoked by the java compiler. Else, the user
                // implemented or overridden toString() method is called
                int firNum = Integer.parseInt(Fnum.getText().toString());
                int secNum = Integer.parseInt(Snum.getText().toString());

                Intent bSend = new Intent(FirstActivity.this, SecondActivity.class);
                bSend.putExtra("FirstNum",firNum);
                bSend.putExtra("SecNum",secNum);

                // startActivity() method you can define that the intent should be used to start an activity.
                // An intent can contain data via a Bundle . This data can be used by the receiving component.
                // In Android the reuse of other application components is a concept known as task.

                    Toast.makeText(FirstActivity.this,"Sending Messages", Toast.LENGTH_SHORT).show();
                startActivity(bSend);
                }
            }
        });
    }
}