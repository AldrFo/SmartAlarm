package ru.bibaboba.core_db.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE
import androidx.room.PrimaryKey

@Entity(
    tableName = "features_to_alarms",
    foreignKeys = [
        ForeignKey(
            entity = AlarmsTable::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("alarm_id"),
            onDelete = CASCADE
        )]
)
data class AlarmsFeatureTable(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "feature_id")
    var id: Long = 0,
    @ColumnInfo(name = "alarm_id")
    var alarmId: Long
)