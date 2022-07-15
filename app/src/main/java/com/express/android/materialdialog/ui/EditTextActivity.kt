package com.express.android.materialdialog.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.express.android.materialdialog.R
import com.express.android.materialdialog.databinding.ActivityEditTextBinding

const val TAG = "Belajar Android "

class EditTextActivity : AppCompatActivity() {

    private var _binding: ActivityEditTextBinding? = null
    val binding: ActivityEditTextBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        binding.loginButton.setOnClickListener {
            val valueEmail = binding.emailEditText.text.toString()
            val valuePassword = binding.passwordEditText.text.toString()

            Log.i(TAG, "Email : $valueEmail")
            Log.i(TAG, "Password : $valuePassword")
        }
    }
}