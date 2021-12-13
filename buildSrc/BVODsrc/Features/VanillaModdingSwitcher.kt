package com.bvod.switcher
import com.bvod.packing.*

fun BSPackSwitching(switchto: Int, OptionOperator: Int) {
    if(switchto == 2) {
        ModBeatSaberUninstall(OptionOperator)
        VanillaInstall(OptionOperator)
    }
    if(switchto == 1){
        VanillaUninstall(OptionOperator)
        ModBeatSaberInstall(OptionOperator)
    }
    else {
        return
    }
} 