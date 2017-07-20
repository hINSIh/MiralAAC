package com.miral.aac;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    TextToSpeech speech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speech = new TextToSpeech(this, this);
    }

    @Override
    @TargetApi(21)
    public void onInit(int status) {
        for (TextToSpeech.EngineInfo engineInfo : speech.getEngines()) {
            Log.d("insi", engineInfo.label + ", " + engineInfo.name);
        }

        speech.setLanguage(Locale.KOREA);
        speech.speak("안녕하세요", TextToSpeech.QUEUE_ADD, null, null);
    }
}
