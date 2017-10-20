package game.juan.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import game.juan.andenginegame0.R;

/**
 * Created by GP62 on 2017-10-20.
 */

public class e_1 extends Activity {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);


        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_e_1);
    }

    public void btn_data(View v){
        Intent intent_data = new Intent(getApplicationContext(),e_1.class);
        startActivity(intent_data);
    }

    public void btn_info(View v){
        Intent intent_info = new Intent(getApplicationContext(),e_2.class);
        startActivity(intent_info);
    }

    public void btn_set(View v){
        Intent intent_set = new Intent(getApplicationContext(),e_3.class);
        startActivity(intent_set);
    }
}