package mcm.edu.ph.veran_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView display;

        display = findViewById(R.id.displaytxt);

        String firstName = "Rydel Heart";
        char middleInitial = 'S';
        String lastname = "Veran";
        int myAge = 17;
        float myDreamTVLGrade = 90.9f;
        double myMoney = 10000.00;


        //String.valueOf(myMoney);
        display.setText("My name is " + firstName + " "
                + middleInitial + " "
                + lastname + "\nand my age is "
                + myAge + ".\nI want my grade in TVL3 to be " +
                String.valueOf(myDreamTVLGrade));

    }
}




















