package acgn.app.ui.favorites

import acgn.app.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

// 我最喜欢的漫画 漫画入口
class FavoritesFragment : Fragment() {

    private val favoritesViewModel by viewModels<FavoritesViewModel>()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_favorites, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        favoritesViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }
}