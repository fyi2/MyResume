package org.sherman.magic.myresume.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import org.sherman.magic.myresume.R


/**
 * A simple [Fragment] subclass.
 */
class SkillsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val skillsView: View = inflater!!.inflate(R.layout.fragment_skills, container, false)
        return skillsView
    }

}// Required empty public constructor
