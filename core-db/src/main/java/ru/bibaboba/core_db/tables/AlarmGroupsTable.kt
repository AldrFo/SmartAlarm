package ru.bibaboba.core_db.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "alarm_groups"
)
data class AlarmGroupsTable(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0,
    @ColumnInfo(name = "start_time")
    var startTime: String,
    @ColumnInfo(name = "end_time")
    var endTime: String,
    @ColumnInfo(name = "name")
    var name: String
)