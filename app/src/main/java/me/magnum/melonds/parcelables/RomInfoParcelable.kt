package me.magnum.melonds.parcelables

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import me.magnum.melonds.domain.model.RomInfo

@Parcelize
class RomInfoParcelable(val gameCode: String, val headerChecksum: Int, val gameTitle: String) : Parcelable {
    companion object {
        fun fromRomInfo(romInfo: RomInfo): RomInfoParcelable {
            return RomInfoParcelable(romInfo.gameCode, romInfo.headerChecksum.toInt(), romInfo.gameTitle)
        }
    }

    fun toRomInfo(): RomInfo {
        return RomInfo(gameCode, headerChecksum.toUInt(), gameTitle)
    }
}