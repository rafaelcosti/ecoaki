package br.com.ecoaki.ui.atualizar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.ViewModelProvider
import br.com.ecoaki.databinding.FragmentAtualizarCadastroBinding

class FormAtualizarCadastroFragment : Fragment() {

    private var _binding: FragmentAtualizarCadastroBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val atualizarCadastrorViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(FormAtualizarCadastroViewModel::class.java)

        _binding = FragmentAtualizarCadastroBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAtualizarCadastro
        atualizarCadastrorViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}