package github.mui0107.myapplication3;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundPlayer {

    private static SoundPool soundPool;
    private static int correctSound;
    private static int incorrectSound;
    private static int pushSound;

    public SoundPlayer(Context context) {

        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);

        correctSound = soundPool.load(context, R.raw.correct, 1);
        incorrectSound = soundPool.load(context, R.raw.incorrect, 1);
        pushSound = soundPool.load(context, R.raw.push, 1);

    }

    public void playCorrectSound() {
        soundPool.play(correctSound, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playIncorrectSound() {
        soundPool.play(incorrectSound, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playPushSound() {
        soundPool.play(pushSound, 1.0f, 1.0f, 1, 0, 1.0f);
    }

}
