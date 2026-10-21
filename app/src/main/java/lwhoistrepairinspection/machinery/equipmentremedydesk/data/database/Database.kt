package lwhoistrepairinspection.machinery.equipmentremedydesk.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import lwhoistrepairinspection.machinery.equipmentremedydesk.data.dao.BookingDao
import lwhoistrepairinspection.machinery.equipmentremedydesk.data.database.converter.Converters
import lwhoistrepairinspection.machinery.equipmentremedydesk.data.entity.BookingEntity

@Database(
    entities = [BookingEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class Database : RoomDatabase() {

    abstract fun bookingDao(): BookingDao
}

