package com.example.dagger2notsodeepdive.ui.dashboard

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
import com.example.dagger2notsodeepdive.MyApplication
import com.example.dagger2notsodeepdive.R
import com.example.dagger2notsodeepdive.databinding.FragmentDashboardBinding
import javax.inject.Inject

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    /**
     * TODO #4.1 lifecycle do component
     */
//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        (requireActivity().application as MyApplication).getTopComponent().randomValue.getRandomInt().let {
//            println("DashboardFragment $it")
//        }
//    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}