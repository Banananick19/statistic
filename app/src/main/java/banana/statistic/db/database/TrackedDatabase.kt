package banana.statistic.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import banana.statistic.db.dao.TrackedDao
import banana.statistic.db.entities.Tracked

@Database(entities = [Tracked::class], version = 1, exportSchema = true)
abstract class TrackedDatabase: RoomDatabase() {
    abstract fun trackedDao(): TrackedDao
}