package ru.bibaboba.smartalarm.Entities

import java.time.LocalDateTime

class CycleAlarm(
    name: String,
    enabled: Boolean,
    alarms: List<Alarm>,
    startTime: LocalDateTime,
    endTime: LocalDateTime,
    var period: Int
): AlarmGroup(name, enabled, alarms, startTime, endTime)