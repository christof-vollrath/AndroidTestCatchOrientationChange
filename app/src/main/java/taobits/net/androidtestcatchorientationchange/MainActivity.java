package taobits.net.androidtestcatchorientationchange;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("taobits2", "onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("taobits2", "onResume");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i("taobits2", "onConfigurationChanged: " + newConfig);
    }

}
