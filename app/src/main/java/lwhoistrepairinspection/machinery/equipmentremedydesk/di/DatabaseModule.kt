package lwhoistrepairinspection.machinery.equipmentremedydesk.di

import androidx.room.Room
import lwhoistrepairinspection.machinery.equipmentremedydesk.data.database.Database
import org.koin.dsl.module

private const val DB_NAME = "sklg_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = Database::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<Database>().bookingDao() }
}