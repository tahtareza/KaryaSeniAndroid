package id.ac.polinema.karyaseni;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class Result extends AppCompatActivity {
    ImageView imgResult;

    public static final String EXTRA_RESULT = "extra_image_result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imgResult = findViewById(R.id.imgResult);

        if(getIntent().hasExtra(EXTRA_RESULT)){
            Bitmap bitmap = getIntent().getParcelableExtra(EXTRA_RESULT);
            imgResult.setImageBitmap(bitmap);
        }
    }
}
