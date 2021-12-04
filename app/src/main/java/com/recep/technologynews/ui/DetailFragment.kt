package com.recep.technologynews.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.recep.technologynews.databinding.FragmentDetailBinding
import kotlin.properties.Delegates

lateinit var title: String
lateinit var detail: String
var media by Delegates.notNull<Int>()


class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // safeArgs has to initialize in onCreate method.
        title = DetailFragmentArgs.fromBundle(requireArguments()).argumentTitle
        detail = DetailFragmentArgs.fromBundle(requireArguments()).argumentDetail
        media = DetailFragmentArgs.fromBundle(requireArguments()).argumentMedia
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.textViewTitleDetailsFragment.text = title
        binding.textViewDetailsDetailsFragment.text = detail
        media.let { binding.imageViewDetailsFragment.setImageResource(it) }

    }
}