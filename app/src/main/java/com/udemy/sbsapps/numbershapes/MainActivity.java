package com.udemy.sbsapps.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Number number;

    public void testNumber(View view){
        EditText editText = (EditText) findViewById(R.id.editText);

        String message = editText.getText().toString();

        if(editText.getText().toString().isEmpty()) {
            message =  "Please enter a number";
        } else {
            number.number = Integer.parseInt(editText.getText().toString());
            
            // check if square but not triangular, than the reverse case, finally check if both
            if (number.isSquare() && number.isTriangular()) {
                message += " is both Square & Triangular";
            } else if (number.isSquare()) {
                message += " is Square";
            } else if (number.isTriangular()) {
                message += " is Triangular";
            } else if (!number.isSquare() && !number.isTriangular()) {
                message += " is neither Square nor Triangular";
            }
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        editText.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = new Number();
    }
}
