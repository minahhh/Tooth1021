package game.juan.app;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.VideoView;

import game.juan.andenginegame0.R;

/**
 * Created by GP62 on 2017-10-17.
 */

public class b_5 extends Activity {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);


        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_b_5);

        final VideoView video_b5 = (VideoView)findViewById(R.id.video_b_5);
        Uri videoUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.b_1);
        video_b5.setVideoURI(videoUri);
        video_b5.start();

    }

    public void skip_b_5(View v){
        Intent intent_b_5 = new Intent(getApplicationContext(),c.class);
        startActivity(intent_b_5);
    }

}