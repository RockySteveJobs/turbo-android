package com.basecamp.turbolinks

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

class TurbolinksFragmentViewModel : ViewModel() {
    val title: MutableLiveData<String> = MutableLiveData()

    fun setTitle(newTitle: String) {
        title.value = newTitle
    }

    companion object {
        fun get(location: String, fragment: TurbolinksFragment): TurbolinksFragmentViewModel {
            return ViewModelProviders.of(fragment).get(location, TurbolinksFragmentViewModel::class.java)
        }
    }
}