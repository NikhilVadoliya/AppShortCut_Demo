package com.pulse.appshortcutdemo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.pulse.appshortcutdemo.R;

public class DetailActvity extends AppCompatActivity {

    TextView mTxtShortcut;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_actvity);

        init();
        showData();
    }

    private void showData() {
        if (intent.hasExtra("key")) {
            mTxtShortcut.setText(intent.getStringExtra("key"));
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.intent = intent;
        showData();
    }

    private void init() {
        mTxtShortcut = findViewById(R.id.textview_shortcut);
        intent = getIntent();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
