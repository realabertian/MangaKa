package acgn.app.ui.settings

import acgn.player.HelloJni
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = HelloJni.helloworld()
    }
    val text: LiveData<String> = _text
}