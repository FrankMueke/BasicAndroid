package com.example.basicandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fill details
        //click reg bt
        Button registerButton=findViewById(R.id.button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                EditText firstnameEt=findViewById(R.id.tv_firstname);
                String firstname =firstnameEt.getText().toString().trim();

                EditText secondnameEt=findViewById(R.id.tv_secondname);
                String secondname =secondnameEt.getText().toString().trim();

                EditText emailEt=findViewById(R.id.tv_email);
                String email =emailEt.getText().toString().trim();

                EditText phoneEt=findViewById(R.id.tv_phone);
                String phone =phoneEt.getText().toString().trim();

                EditText pinP=findViewById(R.id.pin);
                String pin =pinP.getText().toString().trim();

               String info = "your firstname is " + firstname + "your Seconname is " +secondname + "your email  is " + email + "your pin is " +pin + "your phonenumber is is " + phone ;
                    Toast.makeText(MainActivity.this,info,Toast.LENGTH_LONG).show();

                    Intent welcomeIntent = new Intent(MainActivity.this,NavigationDrawer.class);
                    MainActivity.this.startActivity(welcomeIntent);


            }catch (NullPointerException nullPointerException){
                    Toast.makeText(MainActivity.this,"App Error Occured",Toast.LENGTH_LONG).show();}
                }
        });
    }

    @Override
    public void onBackPressed() {
        //decide Logout from the app
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you ready to Exit?")
                .setCancelable(false)

                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {


                                MainActivity.this.finish();
                            }


                        })

                .setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }

                        }).show();
    }
}
