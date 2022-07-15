package com.express.android.materialdialog.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.express.android.materialdialog.R
import com.express.android.materialdialog.databinding.ActivityButtonBinding

class ButtonActivity : AppCompatActivity() {

    private var _binding: ActivityButtonBinding? = null
    val binding: ActivityButtonBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        binding.button1.setOnClickListener { showToast("General Button clicked") }

        binding.outlineButton.setOnClickListener { showToast("Outline Button clicked") }

        binding.textButton.setOnClickListener { showToast("Text Button clicked") }

        binding.iconButton.setOnClickListener { showToast("Icon Button clicked") }
    }

    private fun showToast(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }
}