package org.sherman.magic.myresume.Adapters

import android.support.v4.app.FragmentManager
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import org.sherman.magic.myresume.Fragments.AboutFragment
import org.sherman.magic.myresume.Fragments.ContactFragment
import org.sherman.magic.myresume.Fragments.SkillsFragment
import org.sherman.magic.myresume.Fragments.WorkFragment

/**
 * Created by Admin on 12/7/2017.
 */
open class ResumePagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return AboutFragment()
            1 -> return WorkFragment()
            2 -> return SkillsFragment()
            else -> return ContactFragment()
        }
        return AboutFragment()
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence {
        when(position){
            0 -> return "ABOUT"
            1 -> return "WORK"
            2 -> return "SKILLS"
            else -> return "CONTACT"
        }
        return super.getPageTitle(position)
    }
}