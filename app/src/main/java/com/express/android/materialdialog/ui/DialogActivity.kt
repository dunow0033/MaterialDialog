package com.express.android.materialdialog.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.input.input
import com.express.android.materialdialog.R
import com.express.android.materialdialog.databinding.ActivityDialogBinding

class DialogActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.confirmButton.setOnClickListener { showConfirmDialog() }

        binding.inputButton.setOnClickListener { showInputDialog() }

    }

    private fun showInputDialog() {
        MaterialDialog(this).show {
            input(hint = getString(R.string.hint_name)) { _, text ->
                bindText(text)
            }
            title(text = getString(R.string.title_input_your_name))

            positiveButton(text = getString(R.string.button_submit))

            negativeButton(text = "Cancel")
        }
    }

    private fun bindText(text: CharSequence) {
        binding.nameTextView.text = text.toString()
    }

    private fun showConfirmDialog() {
        MaterialDialog(this).show {
            title(text = getString(R.string.title_delete_confirm))
            message(text = getString(R.string.message_delete_confirmation))
            positiveButton(text = getString(R.string.button_yes)) {
                Log.i(TAG, "item is being deleted")
            }

            negativeButton(text = getString(R.string.button_cancel)) {
                Log.i(TAG, "delete canceled")
            }
        }
    }
}