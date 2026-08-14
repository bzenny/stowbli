package com.stowbli.app

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(48, 48, 48, 48)
        }

        val title = TextView(this).apply {
            text = "STOWBLI"
            textSize = 32f
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "A minimal wallet.\nOn your phone."
            textSize = 18f
            gravity = Gravity.CENTER
            setPadding(0, 24, 0, 48)
        }

        val createButton = Button(this).apply {
            text = "Create Wallet"
        }

        val importButton = Button(this).apply {
            text = "Import Wallet"
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(createButton)
        layout.addView(importButton)

        setContentView(layout)
    }
}
