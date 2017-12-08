package org.sherman.magic.myresume.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_about.*
import org.sherman.magic.myresume.Data.URL_LINKEDIN

import org.sherman.magic.myresume.R


/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val aboutView: View = inflater!!.inflate(R.layout.fragment_about, container, false)
        return aboutView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val url = URL_LINKEDIN
        var aboutFragment: WebView = aboutFragmentId


        aboutFragment.webViewClient = WebViewClient()
        aboutFragment.loadUrl(url)
    }

}// Required empty public constructor
