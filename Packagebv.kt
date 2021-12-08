package com.bvod.checking
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket


fun isBeatSaberInstalled(bspack: String): Boolean {
    var BeatSaberM = bspack
    var currentpk = "com.beatgames.beatsaber"
    if(BeatSaberM == currentpk) {
        return true 
    }else {
        return false 
    }   
}

fun OpenBvodSocket(GoAhead: Boolean, BvodPort: Int, AllowMobile: Boolean, DevMode: Boolean, Debug: Boolean, iOSSupport: Boolean) {
    
}
   