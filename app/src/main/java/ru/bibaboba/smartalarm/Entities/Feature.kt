package ru.bibaboba.smartalarm.Entities

sealed class Feature {


    object RandomRingtone : Feature()

    object Puzzle : Feature()

    object ChangeRingtone : Feature()

}