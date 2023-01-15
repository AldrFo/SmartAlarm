package ru.bibaboba.core_db.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE
import androidx.room.PrimaryKey

@Entity(
    tableName = "alarms",
    foreignKeys = [
        ForeignKey(
            entity = AlarmGroupsTable::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("group_id"),
            onDelete = CASCADE
        )]
)
data class AlarmsTable(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0,
    @ColumnInfo(name = "group_id")
    var groupId: Long?,
    @ColumnInfo(name = "date_time")
    var dateTime: String,
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "enabled")
    var enabled: Boolean,
    @ColumnInfo(name = "ringtone_enabled")
    var ringtoneEnabled: Boolean,
    @ColumnInfo(name = "vibro_enabled")
    var vibroEnabled: Boolean,
    @ColumnInfo(name = "ringtone_path")
    var ringtonePath: String,
)