package org.sherman.magic.myresume.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_work.*
import org.sherman.magic.myresume.Data.URL_GITHUB

import org.sherman.magic.myresume.R


/**
 * A simple [Fragment] subclass.
 */
class WorkFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val workView: View = inflater!!.inflate(R.layout.fragment_work, container, false)

        return workView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val url = URL_GITHUB
        var workFragment: WebView = workFragmentId


        workFragment.webViewClient = WebViewClient()
        workFragment.loadUrl(url)
    }
}
