package com.android.example.hello

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.android.example.hello.databinding.FragmentSecondBinding
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            // TODO: 2 - Invoke function showMessage() passing the textMessage argument to show the message to the user

        }
    }

    // TODO: 1 - Create the function showMessage() with one argument which receives a text.
    //  What's the correct data type to use to show this text message?
    //  Additionally declare the documentation using the function showSnackbar(text: String) as a example
    

    /**
     * Show a [Snackbar] and then execute the defined action.
     * @param text The text to show.
     */
    private fun showSnackbar(text: String) {
        Snackbar.make(binding.root, text, Snackbar.LENGTH_INDEFINITE)
            .setAction("Previous") {
                findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
            }
            .show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}