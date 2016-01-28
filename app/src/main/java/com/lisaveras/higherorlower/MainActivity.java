package com.lisaveras.higherorlower;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(101);

    public void Guess (View view){
        EditText number = (EditText) findViewById(R.id.num);
        int numberInput = Integer.parseInt(number.getText().toString());
        String checkText = "Error!";

        if (numberInput > randomNumber){
            Log.i("Main", Integer.toString(randomNumber));
            checkText = "Higher!";
        }

        else if (numberInput <randomNumber ) {
            Log.i("Main", Integer.toString(randomNumber));
            checkText = "Lower!";
        }

        else if (numberInput == randomNumber) {
            Log.i("Main", Integer.toString(randomNumber));
            checkText = "Correct!";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, checkText, duration);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
