package vibgyor.com.vibgyorexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
LinearLayout lv1,lv2,lv3,lv4,lv5,lv6,lv7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=(LinearLayout)findViewById(R.id.linear1);
        lv2=(LinearLayout)findViewById(R.id.linear2);
        lv3=(LinearLayout)findViewById(R.id.linear3);
        lv4=(LinearLayout)findViewById(R.id.linear4);
        lv5=(LinearLayout)findViewById(R.id.linear5);
        lv6=(LinearLayout)findViewById(R.id.linear6);
        lv7=(LinearLayout)findViewById(R.id.linear7);



       lv1.setOnClickListener(this);
        lv2.setOnClickListener(this);
        lv3.setOnClickListener(this);
        lv4.setOnClickListener(this);
        lv5.setOnClickListener(this);
        lv6.setOnClickListener(this);
        lv7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.linear1:
                Toast.makeText(MainActivity.this, "Red", Toast.LENGTH_LONG).show();
                Log.i("Color Name--:", "Red");
                break;

            case R.id.linear2:

                Toast.makeText(MainActivity.this, "Orange", Toast.LENGTH_LONG).show();
                Log.i("Color Name--:", "Orange");
                break;

            case R.id.linear3:
                Toast.makeText(MainActivity.this, "Yellow", Toast.LENGTH_LONG).show();
                Log.i("Color Name--:", "Yellow");
                break;

            case R.id.linear4:
                Toast.makeText(MainActivity.this, "Green", Toast.LENGTH_LONG).show();
                Log.i("Color Name--:", "Green");
                break;

            case R.id.linear5:
                Toast.makeText(MainActivity.this, "Blue", Toast.LENGTH_LONG).show();
                Log.i("Color Name--:", "Blue");
                break;

            case R.id.linear6:
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_LONG).show();
                Log.i("Color Name--:", "");
                break;

            case R.id.linear7:
                Toast.makeText(MainActivity.this, "Violet", Toast.LENGTH_LONG).show();
                Log.i("Color Name--:", "Violet");
                break;

        }

    }
}
