package game.juan.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import game.juan.andenginegame0.MainActivity;
import game.juan.andenginegame0.R;

/**
 * Created by GP62 on 2017-10-17.
 */

public class c extends Activity {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);


        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_c);
    }

    public void btn_stage(View v){
        Intent intent_stage = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent_stage);
    }

    public void btn_parent(View v){
        Intent intent_parent = new Intent(getApplicationContext(),e_1.class);
        startActivity(intent_parent);
    }

    public void btn_medal(View v){
        Intent intent_medal = new Intent(getApplicationContext(),d.class);
        startActivity(intent_medal);
    }

    public void btn_21(View v){
        Intent intent_fin = new Intent(getApplicationContext(),i_1.class);
        startActivity(intent_fin);
    }
}
