package tw.kaiyeee.triptao.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import tw.kaiyeee.triptao.R;

/**
 * Created by Home on 2017/11/3.
 */

public class demo01_aboutus extends AppCompatActivity {
    ImageButton triptao_scan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        triptao_scan = (ImageButton)findViewById(R.id.triptao_scan);
        triptao_scan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v2){
                Intent triptao_launch = getPackageManager().getLaunchIntentForPackage("com.Panshow.MonkeyAR");
                if (triptao_launch != null) {
                    startActivity(triptao_launch);//null pointer check in case package name was not found
                }
            }
        });
    }
}
