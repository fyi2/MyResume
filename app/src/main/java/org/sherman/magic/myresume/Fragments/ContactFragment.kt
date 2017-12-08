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
class ContactFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val contactView: View = inflater!!.inflate(R.layout.fragment_contact, container, false)
        return contactView
    }

}// Required empty public constructor
