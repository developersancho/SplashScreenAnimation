package developersancho.splashscreenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView imgBallon;
    Button btnStart;
    Animation fromBottom, fromTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgBallon = (ImageView) findViewById(R.id.imgBallon);
        btnStart = (Button) findViewById(R.id.btnStart);

        fromBottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        btnStart.setAnimation(fromBottom);

        fromTop = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        imgBallon.setAnimation(fromTop);

    }
}
