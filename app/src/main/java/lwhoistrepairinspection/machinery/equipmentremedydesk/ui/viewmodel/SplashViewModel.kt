package lwhoistrepairinspection.machinery.equipmentremedydesk.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import lwhoistrepairinspection.machinery.equipmentremedydesk.data.repository.OnboardingRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class SplashViewModel(
    private val onboardingRepository: OnboardingRepository,
) : ViewModel() {

    val onboardedState: StateFlow<Boolean?> =
        onboardingRepository.observeOnboardingState()
            .map { it == true }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.Eagerly,
                initialValue = null
            )
}
