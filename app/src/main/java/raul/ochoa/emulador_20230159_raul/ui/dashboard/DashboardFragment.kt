package raul.ochoa.emulador_20230159_raul.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import raul.ochoa.emulador_20230159_raul.R
import raul.ochoa.emulador_20230159_raul.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    val nombreEstudiante = "Raul Ochoa"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        //llamar
        val btningresar = root.findViewById<Button>(R.id.btnImprimir)
        btningresar.setOnClickListener {
            Toast.makeText(context, nombreEstudiante, Toast.LENGTH_LONG).show()
        }
        return root

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
