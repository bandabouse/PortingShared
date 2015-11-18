package wssss.example.com.portingshared;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        naCreateABmp(400, 300, 24);
    }

    private static native void naCreateABmp(int width, int height, int depth);

    static{
        System.loadLibrary("bmp");
        System.loadLibrary("PortingShared");
    }
}
