package com.example.kylekaplan1.budd_gooey;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    ImageButton imageButton;
    TextView stateText;
    TextView drinkCountText;
    int drinkCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinkCount = 0;
        addListenerOnButton();

    }

    public void addListenerOnButton() {

       imageButton = (ImageButton) findViewById(R.id.imageButton1);
       stateText = (TextView) findViewById(R.id.stateText);
       drinkCountText = (TextView) findViewById(R.id.drinkCount);


        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                drinkCounter();
                drinkCountText.setText(String.valueOf(drinkCount));
                Toast.makeText(MainActivity.this,
                        "CHUG! CHUG! CHUG! ", Toast.LENGTH_SHORT).show();

            }

        });

    }

    private void drinkCounter(){
        drinkCount++;
        if(drinkCount==1){
            stateText.setText("SOBERISH");
        }
        if(drinkCount==2){
            stateText.setText("NOT SOBER");
        }
        if(drinkCount==3){
            stateText.setText("TIPSY");
        }
        if(drinkCount==4){
            stateText.setText("CRUISIN'");
        }
        if(drinkCount==5){
            stateText.setText("LIL' SLOPPY");
        }
        if(drinkCount==6){
            stateText.setText("EMBARASSING YOURSELF");
        }
        if(drinkCount==7){
            stateText.setText("CRYING IN VOMIT PUDDLE");
        }

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
