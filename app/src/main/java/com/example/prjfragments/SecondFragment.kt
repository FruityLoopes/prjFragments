package com.example.prjfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val layout = inflater.inflate(R.layout.fragment_second, container , false)
        val editText: EditText = layout.findViewById(R.id.txtInput)
        val textView: TextView = layout.findViewById(R.id.txtOutput)
        val button: Button = layout.findViewById(R.id.btnFrame2)

        button.setOnClickListener(){
            textView.text=editText.text
        }


        return layout
    }

}