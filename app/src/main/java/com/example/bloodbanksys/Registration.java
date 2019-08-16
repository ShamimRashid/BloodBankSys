package com.example.bloodbanksys;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
TextView txtfirst,txtlast,txtcontact,txtkin,txtaddress,txtuser,txtcity,txtemail;
RadioButton radiof,radiom;
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_registration);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnadd);
    fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    });
    //connecting to my database

    txtfirst = findViewById(R.id.firstname);
    txtlast = findViewById(R.id.lastname);
    radiof = findViewById(R.id.radiof);
    radiom = findViewById(R.id.radiom);
    txtcontact = findViewById(R.id.txtcontact);
    txtkin = findViewById(R.id.txtkin);
    txtemail = findViewById(R.id.txtemail);
    txtuser = findViewById(R.id.txtuser);
    txtaddress = findViewById(R.id.txtaddress);
    txtcity = findViewById(R.id.txtcity);


}
public void btnadd (View View){
    String firstname = txtfirst.getText().toString();
    String lastname = txtlast.getText().toString();
    String female = radiof.getText().toString();
    String male = radiom.getText().toString();
    String contact = txtcontact.getText().toString();
    String kin = txtkin.getText().toString();
    String email = txtemail.getText().toString();
    String user = txtuser.getText().toString();
    String address = txtaddress.getText().toString();
    String city = txtcity.getText().toString();
//new SigninActivity(this,1).execute(firstname,lastname,female,male,contact,kin,email,user,address,city);


    }
    }

