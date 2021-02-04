package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        //User can tap a button to change the text color of the label.
        findViewById(R.id.textColorChangeButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //For random colors
                int[] androidColors = getResources().getIntArray(R.array.androidcolors);
                int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];

                //change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(randomAndroidColor);
            }
        });

        //User can tap on button to change the color of the background view
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //For random colors
                int[] androidColors = getResources().getIntArray(R.array.androidcolors);
                int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];

                findViewById(R.id.parent).setBackgroundColor(randomAndroidColor);
            }
        });

        //User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awsome!");
            }
        });

        //User can tap on the background view to reset all views to default settings.

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. Reset the text to "Hello from Cheng!"
                ((TextView) findViewById(R.id.text)).setText("Hello from Cheng!");

                //2. Reset the color of the text to original color
                    // original color is black, text ID is @id/text
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));

                //3. Reset the background color
                    //original background color is R.color.grey
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.grey));
            }
        });

        //User can tap the “Change text string” button to update the label with the text from the text field.
        findViewById(R.id.changeCustonTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the text view to what's in the edit text view
                String userEnterText = ((EditText) findViewById(R.id.editText)).getText().toString();

                //If the text field is empty, update label with default text string.
                if (userEnterText.isEmpty()){
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userEnterText);
                }
            }
        });

    }
}









