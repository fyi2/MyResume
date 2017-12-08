package org.sherman.magic.myresume.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.sherman.magic.myresume.Adapters.ResumePagerAdapter
import android.content.Intent
import android.net.Uri
import org.sherman.magic.myresume.Data.PHONE_STRING
import org.sherman.magic.myresume.R


class MainActivity : AppCompatActivity() {
    lateinit var viewPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = ResumePagerAdapter(supportFragmentManager)

        var tabs: TabLayout = tabLayoutId
        tabs.setupWithViewPager(viewPager)
    }

    fun phoneHome(view: View){
        val intent = Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse(PHONE_STRING))
        startActivity(intent)
    }
}
