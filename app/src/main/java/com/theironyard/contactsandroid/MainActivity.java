package com.theironyard.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Contacts friends = new Contacts();
    EditText name;
    EditText phoneNumber;
    ListView contactsList;
    Button add;

    List<Contacts> contacts;
    ArrayAdapter<Contacts> friends = new ArrayAdapter<Contacts>(this, android.R.layout.simple_list_item_1, contacts);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText) findViewById(R.id.editText);
        phoneNumber = (EditText) findViewById(R.id.editText2);
        contactsList=(ListView) findViewById(R.id.listView);
        add = (Button) findViewById(R.id.Button);

//        ArrayAdapter<String>

    }
//    @Override
//    public String toString(){
//        fullPhoneNumber="("+fullPhoneNumber.substring(0,2)+")"+fullPhoneNumber.substring(3,6)+"-"+fullPhoneNumber.substring(7,10);
//        return String.format(fullName+" "+fullPhoneNumber);
//    }
    @Override
    public void onClick(View v){

    }
}
