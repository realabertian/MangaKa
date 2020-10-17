package acgn.app.ui.search

import acgn.app.R
import acgn.app.databinding.FragmentSearchBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import org.aber.viewbinding.viewBinding

class SearchFragment : Fragment(R.layout.fragment_search) {

    private val searchViewModel by viewModels<SearchViewModel>()

    private val searchViewBinding by viewBinding(FragmentSearchBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        searchViewModel.text.observe(viewLifecycleOwner, {
            searchViewBinding.textHome.text = it
        })
    }
}