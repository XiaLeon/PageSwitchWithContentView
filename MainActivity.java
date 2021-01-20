import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonGoToLayout2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到第二个页面
                jumpToLayout2();
            }
        });
    }

    private void jumpToLayout2() {
        // 设置第二个页面的布局
        setContentView(R.layout.layout2);
        Button button2 = findViewById(R.id.buttonGoToLayout1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 在第二个页面中，点击Button，跳转到第一个页面
                jumpToLayout1();
            }
        });
    }

    private void jumpToLayout1() {
        // 设置第一个页面d的布局
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.buttonGoToLayout2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 点击第一个页面的Button，跳转到第二个页面
                jumpToLayout2();
            }
        });
    }
}
