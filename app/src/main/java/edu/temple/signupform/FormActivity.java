package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

  //  String name, password, email;
    EditText nameInput;
    EditText passwordInput;
    EditText passwordConfirm;
    EditText emailInput;



    Button  saveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    nameInput = (EditText) findViewById(R.id.EditTextName);
    passwordInput = (EditText) findViewById(R.id.EditTextPassword);
    emailInput = (EditText) findViewById(R.id.EditTextEmail);
    passwordConfirm = (EditText) findViewById(R.id.EditTextConfirm);

    saveButton = (Button) findViewById(R.id.buttonSave);
    saveButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if( nameInput.getText().toString().isEmpty() ||
                    passwordInput.getText().toString().isEmpty() ||
                    emailInput.getText().toString().isEmpty() ||
                    passwordConfirm.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(), "Input fields are not complete", Toast.LENGTH_LONG).show();
            }
            else if(!passwordInput.getText().toString().equals(passwordConfirm.getText().toString())){
                Toast.makeText(getApplicationContext(), "Password Inputs Do Not Match", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Welcome, " + nameInput.getText().toString() + " to the SignUpForm App", Toast.LENGTH_LONG).show();
            }

        }
    });
    }
}
