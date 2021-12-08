package com.bvod.settings

fun readSettings(configfile: String): String = File(configfile).readText(Charsets.UTF_8)

val filereturn = readSettings("bvodconfig.json")

//TODO Got lazy