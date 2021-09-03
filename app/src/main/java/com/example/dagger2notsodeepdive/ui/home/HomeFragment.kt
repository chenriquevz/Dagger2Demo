package com.example.dagger2notsodeepdive.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2notsodeepdive.DeepDive.RandomValue
import com.example.dagger2notsodeepdive.DeepDive.RandomValue2
import com.example.dagger2notsodeepdive.MainActivity
import com.example.dagger2notsodeepdive.R
import com.example.dagger2notsodeepdive.databinding.FragmentHomeBinding
import javax.inject.Inject

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    /**
     * TODO #4 activitycomponent igual ao Psafe atual
     */
//    @Inject
//    lateinit var randomValue: RandomValue
//
//
//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        (requireActivity() as MainActivity).activityAnotherTopComponent.inject(this)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        println("HomeFragment ${randomValue.getRandomInt()}")
//    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}