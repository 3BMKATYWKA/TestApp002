package com.testapp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            // エディットテキストのテキストを取得
            if (edit_text.text != null) {
                // 取得したテキストを TextView に張り付ける
                text_view.text = edit_text.text.toString()
            }
        }
    }

}
