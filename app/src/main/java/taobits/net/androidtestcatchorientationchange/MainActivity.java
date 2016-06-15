package taobits.net.androidtestcatchorientationchange;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("taobits", "onCreate");
        addListenerOnButton();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("taobits", "onResume");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i("taobits", "onConfigurationChanged: " + newConfig);
    }

    public void addListenerOnButton() {
        Button button = (Button) findViewById(R.id.redraw);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("taobits", "onClick");
                recreate();  // Exists only since API Level 11 Honeycomb
            }
        });


    }

}
