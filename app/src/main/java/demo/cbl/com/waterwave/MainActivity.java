package demo.cbl.com.waterwave;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private WaterWaveView waterWaveView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置主题
        setTheme(android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        //设置没有标题的window
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        waterWaveView = new WaterWaveView(this);
        setContentView(waterWaveView);
    }
}
