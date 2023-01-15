package ru.bibaboba.core_db

import androidx.room.Dao
import androidx.room.Query
import io.reactivex.rxjava3.core.Single
import ru.bibaboba.core_db.dtos.AlarmGroupDto
import ru.bibaboba.core_db.tables.AlarmGroupsTable

@Dao
interface AlarmGroupsDao {

    @Query("select * from alarm_groups")
    fun getAlarmGroups(): Single<List<AlarmGroupsTable>>

    @Query(
        "select " +
                "id, start_time, end_time, name, alarms.id, " +
                "date_time, alarms.name, enabled, ringtone_enabled, " +
                "vibro_enabled, ringtone_path " +
            "from alarm_groups " +
            "inner join alarms " +
            "on alarm_groups.id = alarms.group_id"
    )
    fun getAlarmsInGroups(): Single<List<AlarmGroupDto>>

}