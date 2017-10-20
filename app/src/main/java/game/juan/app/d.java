package game.juan.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import game.juan.andenginegame0.MainActivity;
import game.juan.andenginegame0.R;

/**
 * Created by GP62 on 2017-10-20.
 */

public class d extends Activity {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);


        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_d);
    }

    public void btn_back(View v){
        Intent intent_back = new Intent(getApplicationContext(),c.class);
        startActivity(intent_back);
    }
}