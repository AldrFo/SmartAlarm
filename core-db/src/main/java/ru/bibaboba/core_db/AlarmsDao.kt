package ru.bibaboba.core_db

import androidx.room.*
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import ru.bibaboba.core_db.tables.AlarmsTable

@Dao
interface AlarmsDao {

    @Query("select * from alarms")
    fun getAllAlarms(): Single<List<AlarmsTable>>

    @Query("select * from alarms where group_id is null")
    fun getSingleAlarms(): Single<List<AlarmsTable>>

    @Query("select * from alarms where ")
    fun getGroupOfAlarms(): Single<List<AlarmsTable>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAlarm(alarm: AlarmsTable): Completable

    @Query("delete from alarms where id = :id")
    fun removeAlarm(id: Long): Completable

    @Delete
    fun removeAlarm(alarm: AlarmsTable): Completable
}