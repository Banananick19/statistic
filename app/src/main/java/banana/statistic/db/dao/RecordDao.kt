package banana.statistic.db.dao

import androidx.room.*
import banana.statistic.db.entities.Record
import java.util.*

@Dao
interface RecordDao {

    @Insert
    suspend fun insertRecord(record: Record)

    @Query("SELECT * FROM Records")
    fun getAllRecords(): List<Record>

    @Query("SELECT * FROM Records LIMIT :count")
    fun getRecords(count: Int): List<Record>

    @Query("SELECT * FROM Records WHERE makeDateTime > :dateStart AND makeDateTime < :dateEnd")
    fun getRecords(dateStart: Date, dateEnd: Date) {

    }


    @Update
    suspend fun updateRecord(record: Record)

    @Delete
    suspend fun deleteRecord(record: Record)

}