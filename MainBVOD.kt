package com.bvod.main
import kotlinx.serialization.*
import kotlinx.serialization.json.JSON
import com.bvod.checking.*
import com.bovd.configure.*

fun main() {
    val a = "com.beatgames.beatsaber"
    println(isBeatSaberInstalled(a))
    val b = isBeatSaberInstalled(a)
    
}

fun SocketChecking(Safe: Boolean){
    if(Safe == false){
        println("We Can't open the Socket, Sorry About that.")
    } else {
        //SetUp Dialog for Socket Setup 
        SocketRegister(Safe)
    }

}

fun SocketRegister(Check: Boolean) {
    OpenBvodSocket(Check, 40000, true, true, true, false)
}