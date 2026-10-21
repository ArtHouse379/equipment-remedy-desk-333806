package lwhoistrepairinspection.machinery.equipmentremedydesk.di

import lwhoistrepairinspection.machinery.equipmentremedydesk.data.repository.BookingRepository
import lwhoistrepairinspection.machinery.equipmentremedydesk.data.repository.OnboardingRepository
import lwhoistrepairinspection.machinery.equipmentremedydesk.data.repository.ServiceRepository
import org.koin.dsl.module

val dataModule = module {
    includes(databaseModule, dataStoreModule)

    single {
        OnboardingRepository(
            onboardingDataStoreManager = get(),
            coroutineDispatcher = get(DispatchersQualifiers.IO)
        )
    }

    single { ServiceRepository() }

    single {
        BookingRepository(
            bookingDao = get(),
            coroutineDispatcher = get(DispatchersQualifiers.IO)
        )
    }
}