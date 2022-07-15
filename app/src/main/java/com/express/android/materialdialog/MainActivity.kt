package com.express.android.materialdialog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.express.android.materialdialog.adapter.MenuAdapter
import com.express.android.materialdialog.databinding.ActivityMainBinding
import com.express.android.materialdialog.entity.MenuItem
import com.express.android.materialdialog.listener.MenuListener
import com.express.android.materialdialog.ui.*

class MainActivity : AppCompatActivity(), MenuListener {

    private lateinit var binding: ActivityMainBinding

    private val listMenu = mutableListOf<MenuItem>()
    private val menuAdapter = MenuAdapter(listMenu, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        generateMenu()


        binding.menuRecyclerView.apply {
            adapter = menuAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }


        menuAdapter.notifyDataSetChanged()
    }

    private fun generateMenu() {
        listMenu.apply {
            add(
                MenuItem(
                    MENU_ID_TEXTVIEW,
                    getString(R.string.text_textview),
                    getString(R.string.text_subtitle_textview)
                )
            )
            add(
                MenuItem(
                    MENU_ID_BUTTON,
                    getString(R.string.text_button),
                    getString(R.string.text_subtitle_button)
                )
            )
            add(
                MenuItem(
                    MENU_ID_MENU,
                    getString(R.string.text_option_menu),
                    getString(R.string.text_subtitle_option_menu)
                )
            )

            add(
                MenuItem(
                    MENU_ID_EDITTEXT,
                    getString(R.string.text_edittext_menu),
                    getString(R.string.text_subtitle_edittext_menu)
                )
            )
            add(
                MenuItem(
                    MENU_ID_DIALOG,
                    getString(R.string.text_dialog_menu),
                    getString(R.string.text_subtitle_dialog_menu)
                )
            )
            add(
                MenuItem(
                    MENU_ID_AUTO_COMPLETE_TEXTVIEW,
                    getString(R.string.text_autocomplete_menu),
                    getString(R.string.text_subtitle_autocomplete_menu)
                )
            )
        }

    }

    override fun onMenuClicked(menuItem: MenuItem) {
        val intent = when (menuItem.id) {
            MENU_ID_TEXTVIEW -> Intent(this, TextViewActivity::class.java)
            MENU_ID_BUTTON -> Intent(this, ButtonActivity::class.java)
            MENU_ID_MENU -> Intent(this, MenuActivity::class.java)
            MENU_ID_EDITTEXT -> Intent(this, EditTextActivity::class.java)
            MENU_ID_DIALOG -> Intent(this, DialogActivity::class.java)
            MENU_ID_AUTO_COMPLETE_TEXTVIEW -> Intent(this, AutoCompleteActivity::class.java)
            else -> null
        }
        startActivity(intent)
    }

    companion object {
        private const val MENU_ID_TEXTVIEW = 1
        private const val MENU_ID_BUTTON = 2
        private const val MENU_ID_MENU = 3
        private const val MENU_ID_EDITTEXT = 4
        private const val MENU_ID_DIALOG = 5
        private const val MENU_ID_AUTO_COMPLETE_TEXTVIEW = 6
    }
}