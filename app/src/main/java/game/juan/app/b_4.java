package game.juan.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import game.juan.andenginegame0.R;

/**
 * Created by GP62 on 2017-10-17.
 */

public class b_4 extends Activity {



    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_b_4);
    }

    public void btn_start(View v){
        Intent intent_start = new Intent(getApplicationContext(),b_5.class);
        startActivity(intent_start);
    }
}
