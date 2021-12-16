package banana.statistic.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import banana.statistic.db.dao.RecordDao
import banana.statistic.db.entities.Record

@Database(entities = [Record::class], version = 1, exportSchema = true)
abstract class RecordDatabase: RoomDatabase() {
    abstract fun recordDao(): RecordDao
}