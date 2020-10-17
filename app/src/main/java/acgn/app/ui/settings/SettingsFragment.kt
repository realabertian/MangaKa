package acgn.app.ui.settings

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import acgn.app.databinding.FragmentSettingsBinding
import androidx.fragment.app.viewModels
import org.aber.viewbinding.viewBinding

class SettingsFragment : Fragment() {

    private val settingsViewModel by viewModels<SettingsViewModel>()

    private val binding by viewBinding(FragmentSettingsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        settingsViewModel.text.observe(viewLifecycleOwner, {
            binding.textSlideshow.text = it
        })
    }
}