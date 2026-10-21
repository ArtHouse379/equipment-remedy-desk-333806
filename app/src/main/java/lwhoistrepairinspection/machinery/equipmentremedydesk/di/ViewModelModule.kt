package lwhoistrepairinspection.machinery.equipmentremedydesk.di

import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.viewmodel.BookingViewModel
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.viewmodel.CheckoutViewModel
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.viewmodel.OnboardingViewModel
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.viewmodel.ServiceDetailsViewModel
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.viewmodel.ServiceViewModel
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ServiceViewModel(
            serviceRepository = get()
        )
    }

    viewModel {
        ServiceDetailsViewModel(
            serviceRepository = get()
        )
    }

    viewModel {
        BookingViewModel(
            bookingRepository = get(),
            serviceRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            bookingRepository = get(),
        )
    }
}