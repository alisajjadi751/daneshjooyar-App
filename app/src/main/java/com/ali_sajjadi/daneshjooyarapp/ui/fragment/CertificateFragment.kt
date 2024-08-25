package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelCertificateFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterCertificateFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewCertificateFragment

class CertificateFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = ViewCertificateFragment(requireContext())
        val model = ModelCertificateFragment(requireContext())
        val presenter = PresenterCertificateFragment(view, model)
        presenter.onCreate()
        return view.binding.root
    }

}