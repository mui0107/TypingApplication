package github.mui0107.myapplication3;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView adView_result = findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView_result.loadAd(adRequest);

        MyApp myApp = (MyApp) this.getApplication();
        String str = myApp.getTestString();

        TextView textViewSub = findViewById(R.id.textView4);
        textViewSub.setText(str);
        Typeface customFont = Typeface.createFromAsset(getAssets(), "ReggaeOne-Regular.ttf");
        TextView endTitleText = findViewById(R.id.textView6);
        endTitleText.setTypeface(customFont);

        Button returnButton = findViewById(R.id.button35);
        returnButton.setOnClickListener((View view2)->{
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(intent);

        });

        Button homeButton = findViewById(R.id.button36);
        homeButton.setOnClickListener((View view2)->{
            Intent intent = new Intent(ResultActivity.this, StartActivity.class);
            startActivity(intent);

        });
    }
    public void onBackPressed(){
    }

}