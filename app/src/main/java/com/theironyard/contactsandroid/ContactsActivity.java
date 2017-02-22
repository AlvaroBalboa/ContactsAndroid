package com.theironyard.contactsandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by souporman on 2/21/17.
 */

public class ContactsActivity extends AppCompatActivity{

    EditText nameField;
    EditText phoneField;
    EditText emailField;
    ImageView face;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_activity);

        nameField   = (EditText) findViewById(R.id.editText5);
        phoneField  = (EditText) findViewById(R.id.editText4);
        emailField  = (EditText) findViewById(R.id.editText3);
        face        = (ImageView) findViewById(R.id.imageView2);
    }
}
