package com.express.android.materialdialog.ui

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.express.android.materialdialog.R
import com.express.android.materialdialog.databinding.ActivityAutoCompleteBinding

class AutoCompleteActivity : AppCompatActivity() {

    private var _binding: ActivityAutoCompleteBinding? = null
    val binding: ActivityAutoCompleteBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)


        val androidName = mutableListOf<String>().apply {
            add("Cupcake")
            add("Cuka")
            add("Donut")
            add("Domba")
            add("Eclair")
            add("Edi")
            add("Froyo")
            add("Fanta")
            add("Ginger bread")
            add("Gula")
            add("Honey comb")
            add("Harimau")
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, androidName)
        binding.autoComplete.setAdapter(adapter)
    }
}