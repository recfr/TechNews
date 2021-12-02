package com.recep.technologynews.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.recep.technologynews.R
import com.recep.technologynews.databinding.FragmentDetailBinding

private const val ARG_PARAM1 = "title"
private const val ARG_PARAM2 = "detail"
private const val ARG_PARAM3 = "media"


class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private var param1: String? = null
    private var param2: String? = null
    private var param3: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
            param3 = it.getInt(ARG_PARAM3)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root

    //        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        requireView().findViewById<TextView>(R.id.textView_title_detailsFragment).text = param1
//        requireView().findViewById<TextView>(R.id.textView_details_detailsFragment).text = param2

        binding.textViewTitleDetailsFragment.text = param1
        binding.textViewDetailsDetailsFragment.text = param2
        param3?.let { binding.imageViewDetailsFragment.setImageResource(it) }



    }

}