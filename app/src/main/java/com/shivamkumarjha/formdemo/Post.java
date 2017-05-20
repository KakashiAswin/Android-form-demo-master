package com.shivamkumarjha.formdemo;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Nitun on 16-05-2017.
 */

public class Post extends Activity {

    // UI references.
    public AutoCompleteTextView mEmailView;
    public EditText mPasswordView, mUsername, mDate, mBirth;
    public View mLoginFormView;
    public Button mEmailSignInButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Set up the login form.
        mUsername = (EditText)findViewById(R.id.username);
        mDate = (EditText) findViewById(R.id.date);
        mBirth = (EditText) findViewById(R.id.birthplace);
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        mPasswordView = (EditText) findViewById(R.id.password);
        mEmailSignInButton = (Button) findViewById(R.id.email_sign_in_button);
        mLoginFormView = findViewById(R.id.login_form);

        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("muser");
        String email = bundle.getString("memail");
        String password = bundle.getString("mpassword");
        String birthplace = bundle.getString("mbplace");
        String dob = bundle.getString("mdate");
        mUsername.setText(username);
        mDate.setText(dob);
        mBirth.setText(birthplace);
        mEmailView.setText(email);
        mPasswordView.setText(password);
        mEmailSignInButton.setText("You are registered!");
        mUsername.setKeyListener(null);
        mUsername.setEnabled(false);
        mEmailView.setKeyListener(null);
        mEmailView.setEnabled(false);
        mPasswordView.setKeyListener(null);
        mPasswordView.setEnabled(false);
        mDate.setKeyListener(null);
        mDate.setEnabled(false);
        mBirth.setKeyListener(null);
        mBirth.setEnabled(false);
        mEmailSignInButton.setKeyListener(null);
        mEmailSignInButton.setEnabled(false);
    }
}
