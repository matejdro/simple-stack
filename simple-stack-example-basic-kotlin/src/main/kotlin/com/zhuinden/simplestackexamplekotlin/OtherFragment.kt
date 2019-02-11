package com.zhuinden.simplestackexamplekotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.other_view.*
import org.jetbrains.anko.sdk15.listeners.onClick

/**
 * Created by Owner on 2017.11.13.
 */

class OtherFragment : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.other_view, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bug144.onClick {
            MainActivity.get(view.context).navigateTo(OtherKey())
        }

        bug145.onClick {
            MainActivity.get(view.context).goBack()
            MainActivity.get(view.context).navigateTo(OtherKey())
        }
    }
}
