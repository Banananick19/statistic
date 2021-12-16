package banana.statistic.db.dao

import androidx.room.*
import banana.statistic.db.entities.Tracked


@Dao
interface TrackedDao {
    @Insert
    suspend fun insertCategory(tracked: Tracked)

    @Query("SELECT * FROM Tracked")
    fun getALlTracked(): List<Tracked>

    @Update
    suspend fun updateTracked(tracked: Tracked)

    @Delete
    suspend fun deleteTracked(tracked: Tracked)
}