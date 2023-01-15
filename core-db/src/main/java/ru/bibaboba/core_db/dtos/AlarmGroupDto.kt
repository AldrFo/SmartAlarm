package ru.bibaboba.core_db.dtos

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity
data class AlarmGroupDto(
    @ColumnInfo(name = "id")
    var id: Long = 0,
    @ColumnInfo(name = "start_time")
    var startTime: String,
    @ColumnInfo(name = "end_time")
    var endTime: String,
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "alarms.id")
    var alarmId: Long = 0,
    @ColumnInfo(name = "date_time")
    var dateTime: String,
    @ColumnInfo(name = "alarms.name")
    var alarmName: String,
    @ColumnInfo(name = "enabled")
    var enabled: Boolean,
    @ColumnInfo(name = "ringtone_enabled")
    var ringtoneEnabled: Boolean,
    @ColumnInfo(name = "vibro_enabled")
    var vibroEnabled: Boolean,
    @ColumnInfo(name = "ringtone_path")
    var ringtonePath: String,
)