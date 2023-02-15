package github.mui0107.myapplication3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.text.SimpleDateFormat;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    String test = "";
    String first ="";
    String box = "";
    private SoundPlayer soundPlayer;
    int countdown = 0;
    //0302
    private MyApp myApp;

    // 'Handler()' is deprecated as of API 30: Android 11.0 (R)
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            count ++;
            timerText.setText(dataFormat.
                    format(count*period));
            handler.postDelayed(this, period);
        }
    };

    private TextView timerText;
    private final SimpleDateFormat dataFormat =
            new SimpleDateFormat("mm:ss.S", Locale.US);

    private int count, period;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        soundPlayer = new SoundPlayer(this);

        count = 0;
        period = 100;

        timerText = findViewById(R.id.timer);
        timerText.setText(dataFormat.format(0));
        //0302
        myApp = (MyApp) this.getApplication();

        Button GoButton = (Button)findViewById(R.id.button1);
        Button PButton = (Button)findViewById(R.id.button);
        Button OButton = (Button)findViewById(R.id.button2);
        Button IButton = (Button)findViewById(R.id.button3);
        Button UButton = (Button)findViewById(R.id.button4);
        Button YButton = (Button)findViewById(R.id.button5);
        Button TButton = (Button)findViewById(R.id.button6);
        Button RButton = (Button)findViewById(R.id.button7);
        Button EButton = (Button)findViewById(R.id.button8);
        Button WButton = (Button)findViewById(R.id.button9);
        Button QButton = (Button)findViewById(R.id.button10);
        Button BowButton = (Button)findViewById(R.id.button11);
        Button LButton = (Button)findViewById(R.id.button12);
        Button KButton = (Button)findViewById(R.id.button13);
        Button JButton = (Button)findViewById(R.id.button14);
        Button HButton = (Button)findViewById(R.id.button15);
        Button GButton = (Button)findViewById(R.id.button16);
        Button FButton = (Button)findViewById(R.id.button17);
        Button DButton = (Button)findViewById(R.id.button18);
        Button SButton = (Button)findViewById(R.id.button19);
        Button AButton = (Button)findViewById(R.id.button20);
        Button DelButton = (Button)findViewById(R.id.button21);
        Button SpButton = (Button)findViewById(R.id.button22);
        Button MButton = (Button)findViewById(R.id.button23);
        Button NButton = (Button)findViewById(R.id.button24);
        Button BButton = (Button)findViewById(R.id.button25);
        Button VButton = (Button)findViewById(R.id.button26);
        Button CButton = (Button)findViewById(R.id.button27);
        Button XButton = (Button)findViewById(R.id.button28);
        Button ZButton = (Button)findViewById(R.id.button29);
        Button Sp2Button = (Button)findViewById(R.id.button30);
        final String[] english = {"regard","nod","consider","include","exhaust","appeal","precisely","polite","narrative",
                "poverty", "acknowledge", "harm","involve","blame","sufficient","alike","divorce","marry","instinct",
                "strategy","fact","participate","exactly","shallow","merry","abstract","stiff","obviously","decrease",
                "impression","beverage","obtain","emigrant","capitalism","allegiance","philosophy","rest","reservation",
                "receptor","immunity","desire","delight","increase","courage","rely","satisfy","submit","sweat","separate",
                "suppose","resent","psychology","spend","maintain","occur","explore","emphasize","hesitate","disturb",
                "exhibit","argue","cough","export","stare","encounter","determine","society","childhood","attempt","profit",
                "suggestion","disaster","confusion","precede","relieve","anyway","apply","allow","tend","provide","require",
                "depend","compare","affect","agree","annually","acute","force","recognize","see","honor","accent","accolade",
                "affair","cattle","envelope","environment","interrupt","context","facility","facilitate","fee","inventor",
                "era","know","well-known","so-called","regret","influence","incredible","behind","hence","rural","avenue",
                "decade","doubt","ordinary","expose","ignore","dedicate","forget","definite","certain","budget","terrible",
                "alone","alive","resident","youngster","pretend","overlook","dismiss","forecast","symptom","thread","tie",
                "tongue","mayor","deal","creature","tin","ingredient","amend","perspective","proficient","hydrogen","bulk",
                "prolong","fabric","span","diameter","derive","compliment"};
        final String[] japanese = {"～とみなす","うなずく","考慮する","含む","疲れはてさせる","訴える、引きつける","正確に","礼儀正しい",
                "話","貧乏", "認める", "害","巻き込む、伴う","責める","十分な","似ている","離婚","結婚する","本能","戦略、計画",
                "事実","参加する","正確に","浅い","陽気な","抽象的な","堅い","明らかに","減少する","印象","飲み物","得る","移民",
                "資本主義","忠誠","哲学","休息、休憩","予約","受容体","免疫","欲望","大喜び、歓喜","増える","勇気","頼る",
                "（人）を満足させる","提出する","汗をかく","～を分ける","～だと思う","腹を立てる、憤る","心理学","使う、費やす","維持する",
                "起こる、発生する","探検する","～を強調する","躊躇する","邪魔をする、妨害する","展示する","主張する、言い争う","咳をする",
                "輸出する","見つめる","遭遇する、出会う","～を決定する","社会","子供時代","試み","利益","提案","災害","混乱",
                "先行する、先に起こる","和らげる","とにかく、やはり","当てはまる、適用する","許す","傾向がある","供給する","必要とする",
                "頼る、依存する","比較する","～に影響を及ぼす","同意する","毎年","鋭い","～を強制する","認める","見る","名誉","なまり",
                "栄誉","事件、出来事","牛","封筒","環境","妨げる","文脈、状況","施設","促進する","料金、謝礼","発明家","時代","知る",
                "よく知られた","いわゆる","～を後悔する","影響","信じられない","～の後ろに","このゆえに、だから","田舎の","大通り、並木道",
                "10年間","疑う","普通の","さらす、触れさせる","無視する","ささげる、献身する","忘れる","明確な","確かな、確信して","予算",
                "ひどい、恐ろしい","一人で","生きている","居住者","子ども","（～の）ふりをする","見落とす","解雇する","予想する、予測する",
                "症状","糸","ネクタイ","舌","市長、町長","取引、契約","動物","スズ","材料","修正する","見方、視点","熟練した","水素",
                "容積、大部分","延長する","織物、布","期間","直径","由来する","賛辞"};
        final TextView currentNumberTextView = findViewById(R.id.current_number);
        final TextView englishTextView = findViewById(R.id.textView2);
        final TextView japaneseTextView = findViewById(R.id.textView3);
        Button returnButton = findViewById(R.id.button32);
        returnButton.setOnClickListener((View view2)->{
            finish();
        });
        //最初のランダムな数値を生成する
        double randomNumberOne = Math.random() * english.length;
        //最初のランダムな整数値をを生成する
        int j = (int) randomNumberOne;
        englishTextView.setText(english[j]);
        japaneseTextView.setText(japanese[j]);
        final String[] e_text = {englishTextView.getText().toString()};
        handler.post(runnable);
        //スイッチ
        Switch mSwitch;
        mSwitch = (Switch)findViewById(R.id.switch2);
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(mSwitch.isChecked()) {
                    //mSwitch : Off -> On の時の処理
                    englishTextView.setBackgroundColor(Color.rgb(0,0,0));
                } else {
                    //mSwitch : On -> Off の時の処理
                    englishTextView.setBackgroundColor(Color.rgb(227,215,163));
                }
            }
        });



        //Goボタン押したとき
        GoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box = test;
                //0.0~11.0のランダムな数値を生成する
                double randomNumber = Math.random() * english.length;
                //0~11のランダムな整数値をを生成する
                int i = (int) randomNumber;
                //入力文字と提示された英単語の正誤判定
                if (e_text[0].equals(box)) {
                    englishTextView.setText(english[i]);
                    japaneseTextView.setText(japanese[i]);
                    e_text[0] = english[i];
                    soundPlayer.playCorrectSound();
                    countdown = countdown + 1;
                    if (countdown > 9) {
                        Intent intentOne = new Intent(getApplication(), ResultActivity.class);
                        startActivity(intentOne);
                        handler.removeCallbacks(runnable);
                        String message = timerText.getText().toString();
                        myApp.setTestString(message);
                        timerText.setText(dataFormat.format(0));
                        count = 0;
                        countdown = 0;
                    }
                } else {
                    soundPlayer.playIncorrectSound();
                }
                test = "";
                box = "";
                String e_text = englishTextView.getText().toString();
            }
        });
        //キーボード押したとき
        PButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String PPP = "p";
                test = test + PPP;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        OButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String OOO = "o";
                test = test + OOO;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        IButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String III = "i";
                test = test + III;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        UButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UUU = "u";
                test = test + UUU;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        YButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String YYY = "y";
                test = test + YYY;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        TButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String TTT = "t";
                test = test + TTT;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        RButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String RRR = "r";
                test = test + RRR;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        EButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String EEE = "e";
                test = test + EEE;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        WButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String WWW = "w";
                test = test + WWW;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        QButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String QQQ = "q";
                test = test + QQQ;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        BowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Bow = "-";
                test = test + Bow;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        LButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String LLL = "l";
                test = test + LLL;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        KButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String KKK = "k";
                test = test + KKK;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        JButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String JJJ = "j";
                test = test + JJJ;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        HButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String HHH = "h";
                test = test + HHH;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        GButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String GGG = "g";
                test = test + GGG;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        FButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FFF = "f";
                test = test + FFF;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        DButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DDD = "d";
                test = test + DDD;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        SButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String SSS = "s";
                test = test + SSS;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        AButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String AAA = "a";
                test = test + AAA;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        DelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (test.length() > 0) {
                    test = test.substring(0, test.length() - 1);
                    currentNumberTextView.setText(test);
                    soundPlayer.playPushSound();
                }
            }
        });
        SpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Sp = " ";
                test = test + Sp;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        MButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String MMM = "m";
                test = test + MMM;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        NButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NNN = "n";
                test = test + NNN;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        BButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String BBB = "b";
                test = test + BBB;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        VButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String VVV = "v";
                test = test + VVV;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        CButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String CCC = "c";
                test = test + CCC;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        XButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String XXX = "x";
                test = test + XXX;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        ZButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ZZZ = "z";
                test = test + ZZZ;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });
        Sp2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Sp2 = " ";
                test = test + Sp2;
                currentNumberTextView.setText(test);
                soundPlayer.playPushSound();
            }
        });

    }
    public void onBackPressed(){
    }


}