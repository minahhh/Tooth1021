package game.juan.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import game.juan.andenginegame0.R;

/**
 * Created by GP62 on 2017-10-20.
 */

public class e_2 extends Activity {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);


        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_e_2);
    }
}