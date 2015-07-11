package com.example.chris_000.radiobuttons;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private TextView title;
    private RadioGroup radioGroup;
    private RadioButton radioButtonChoices;
    private Button showChoiceButton;
    private TextView showChoiceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showChoiceText = (TextView) findViewById(R.id.decisionId);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupId);

        showChoiceButton = (Button) findViewById(R.id.showChoiceId);
        showChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedOption = radioGroup.getCheckedRadioButtonId();
                radioButtonChoices = (RadioButton) findViewById(selectedOption);
                showChoiceText.setText(radioButtonChoices.getText());
            }
        });

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
