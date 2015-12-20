package ss.yctech.com.samples1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DecorViewTest extends AppCompatActivity {
    View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decor_view_test);
        decorView = getWindow().getDecorView();
        decorView.setBackgroundColor(Color.RED);
    }
}
