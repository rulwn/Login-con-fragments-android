package raul.ochoa.emulador_20230159_raul

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_contactanos.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_contactanos : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val correo = "20230159@ricaldone.edu.sv"
        val root = inflater.inflate(R.layout.fragment_contactanos, container, false)
        //llamar
        val btningresar = root.findViewById<Button>(R.id.btnCorreo)
        btningresar.setOnClickListener  {
            Toast.makeText(context, correo, Toast.LENGTH_LONG).show()
        }
        return root

    }
}