package com.bvod.packing
import com.bvod.preset.*
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket


//Import Socket for Interaction with the Android App, Web and the BVOD Server 

fun isBSInstalled(bgname: String): Boolean {
    if(bgname == bspackagename) {
        return true
    }
    else 
    {
        return false
    }
}

fun ModdedBeatSaber(Option: Int) {
    //Fetch the Modded BeatSaber off of the BVOD Server. Why? Because It's faster and usually more stable than doing it client wise.
}

fun ModBeatSaberInstall(Option: Int){
    //obvious but installs the Modded BeatSaber APK and resigns it.
}

fun VanillaUninstall(Option: Int){
    // Uninstalls the Vanilla version of BeatSaber.
}

fun ModBeatSaberUninstall(Option: Int) {

}

fun VanillaInstall(Option: Int){

}

