package com.example.criminalintent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class CrimeFragment : Fragment() {

    private lateinit var crime: Crime

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        crime = Crime()
    }

    // Instead of setContentView in Activities, fragments requires overriding onCreateView because
    // you can inflate and hide the view whenever.
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View? {

        // Inflating the view:          Layout ID          View's parent   Attach to parent
        val view = inflater.inflate(R.layout.fragment_crime, container, false) // Fragment's view will be hosted in the activity´s container view
        return view
    }


}