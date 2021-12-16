package banana.statistic.db.entities

import androidx.room.*
import androidx.room.ForeignKey.CASCADE
import kotlinx.datetime.LocalDateTime

@Entity(tableName = "Records", foreignKeys = [
    ForeignKey(entity = Tracked::class,
        parentColumns = ["name"],
        childColumns = ["category"],
        onDelete = CASCADE)])
@TypeConverters(DateConverter::class)
data class Record(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name="category")
    var categoryName: String,
    var value: String, //хранит значение, которое может быть и числом(зависит от параметров isValueString и isValueNumber)
    var isValueString: Boolean,
    var isValueNumber: Boolean,
    var makeDateTime: LocalDateTime
)
