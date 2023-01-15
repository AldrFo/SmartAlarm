package ru.bibaboba.smartalarm.Entities

import java.time.LocalDateTime

open class AlarmGroup(
    var name: String,
    var enabled: Boolean,
    var alarms: List<Alarm>,
    var startTime: LocalDateTime,
    var endTime: LocalDateTime
)