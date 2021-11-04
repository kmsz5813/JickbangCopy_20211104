package com.nepplus.jickbangcopy_20211104.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.jickbangcopy_20211104.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val redId: Int,
    val mList: ArrayList<RoomData>) : ArrayAdapter<RoomData>( mContext, redId, mList) {
}