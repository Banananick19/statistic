package banana.statistic.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone.Companion.currentSystemDefault
import kotlinx.datetime.toLocalDateTime
import java.util.*

@Entity(tableName="Tracked")
@TypeConverters(DateConverter::class)
data class Tracked(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name: String,
    var startDateTime: LocalDateTime
)
