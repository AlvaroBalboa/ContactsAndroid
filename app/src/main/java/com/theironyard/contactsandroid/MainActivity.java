package com.theironyard.contactsandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText name;
    EditText phoneNumber;
    ListView contactsList;
    Button add;

    //List<Contacts> contactsArray;
    ArrayAdapter<Contacts> friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name        = (EditText) findViewById(R.id.editText);
        phoneNumber = (EditText) findViewById(R.id.editText2);
        contactsList= (ListView) findViewById(R.id.listView);
        add         = (Button)   findViewById(R.id.Button);

        friends = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);

        contactsList.setAdapter(friends);

        add.setOnClickListener(this);
        //contactsList.setOnItemLongClickListener(this);
    }
    public class Contacts {
        String fullName;
        String fullPhoneNumber;
//    @Override
//    public String toString(){
//        fullPhoneNumber="("+fullPhoneNumber.substring(0,2)+")"+fullPhoneNumber.substring(3,6)+"-"+fullPhoneNumber.substring(7,10);
//        return String.format(fullName+" "+fullPhoneNumber);
//    }
        public Contacts(String fullName, String fullPhoneNumber) {
            this.fullName = fullName;
            this.fullPhoneNumber = fullPhoneNumber;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getFullPhoneNumber() {
            return fullPhoneNumber;
        }

        public void setFullPhoneNumber(String fullPhoneNumber) {
            this.fullPhoneNumber = fullPhoneNumber;
        }
    }

//    public class ContactListAdapter extends ArrayAdapter<Contacts> {
//        public ContactListAdapter(){
//            super (MainActivity.this,R.layout.activity_main,friends);
//        }
//    }
//
//    @Override
//    public String toString(){
//        fullPhoneNumber="("+fullPhoneNumber.substring(0,2)+")"+fullPhoneNumber.substring(3,6)+"-"+fullPhoneNumber.substring(7,10);
//        return String.format(fullName+" "+fullPhoneNumber);
//    }

    @Override
    public void onClick(View v){
        Contacts item = new Contacts (name.getText().toString(),phoneNumber.getText().toString());
        friends.add(item);
        name.setText("");
        phoneNumber.setText("");
    }
//    @Override
//    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//        Intent i = new Intent(getApplicationContext(),ContactsActivity.class);
//        startActivity(i);
//        return true;
//    }
}
