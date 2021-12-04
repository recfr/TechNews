package com.recep.technologynews.ui

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.recep.technologynews.databinding.FragmentPersonalBinding

class PersonalFragment : Fragment() {
    private var _binding: FragmentPersonalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        _binding = FragmentPersonalBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupHyperlink()

    }

    private fun setupHyperlink() {
        binding.textviewHyperlinkGithub.movementMethod = LinkMovementMethod.getInstance()
        binding.textviewHyperlinkMedium.movementMethod = LinkMovementMethod.getInstance()
        binding.textviewHyperlinkLinkedin.movementMethod = LinkMovementMethod.getInstance()
    }
}