package ru.bibaboba.smartalarm.Entities

import java.time.LocalDateTime

data class Alarm(
    var name: String,
    var enabled: Boolean,
    var time: LocalDateTime,
    var pattern: VibroPattern,
    var vibroEnabled: Boolean,
    var ringtoneEnabled: Boolean,
    var ringtonePath: String,
    var features: List<Feature>
)