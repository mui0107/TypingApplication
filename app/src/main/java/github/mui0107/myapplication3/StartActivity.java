package github.mui0107.myapplication3;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView adView_start = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView_start.loadAd(adRequest);

        MyApp myApp = (MyApp) this.getApplication();
        Typeface customFont = Typeface.createFromAsset(getAssets(), "ReggaeOne-Regular.ttf");
        TextView titleText = findViewById(R.id.textView);
        titleText.setTypeface(customFont);
        Button startButtonOne = findViewById(R.id.button31);
        startButtonOne.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), MainActivity.class);
            startActivity(intent);
        });


    }
    public void onBackPressed(){
    }



}