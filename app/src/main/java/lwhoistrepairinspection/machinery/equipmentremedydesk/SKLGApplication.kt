package lwhoistrepairinspection.machinery.equipmentremedydesk

import android.app.Application
import lwhoistrepairinspection.machinery.equipmentremedydesk.di.dataModule
import lwhoistrepairinspection.machinery.equipmentremedydesk.di.dispatcherModule
import lwhoistrepairinspection.machinery.equipmentremedydesk.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class SKLGApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@SKLGApplication)
            modules(appModules)
        }
    }
}
