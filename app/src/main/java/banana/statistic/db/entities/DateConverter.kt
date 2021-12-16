package banana.statistic.db.entities

import androidx.room.TypeConverter
import kotlinx.datetime.*


class DateConverter {
    companion object {
        @TypeConverter
        fun fromLocalDateTime(localDateTime: LocalDateTime): Long {
            return localDateTime.toInstant(TimeZone.currentSystemDefault()).epochSeconds
        }

        @TypeConverter
        fun toLocalDateTime(epochSeconds: Long): LocalDateTime {
            return Instant.fromEpochSeconds(epochSeconds).toLocalDateTime(TimeZone.currentSystemDefault())
        }

    }
}