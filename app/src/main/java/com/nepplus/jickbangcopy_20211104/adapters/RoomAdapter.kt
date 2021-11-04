package com.nepplus.jickbangcopy_20211104.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.jickbangcopy_20211104.R
import com.nepplus.jickbangcopy_20211104.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val redId: Int,
    val mList: ArrayList<RoomData>) : ArrayAdapter<RoomData>( mContext, redId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temRow = convertView
        if (temRow == null) {
            temRow = mInflater.inflate(R.layout.room_list_item, null)
        }

        val row = temRow!!

        val roomData = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressAndFloor = row.findViewById<TextView>(R.id.txtAddressAndFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        txtDescription.text = roomData.description
        txtPrice.text = roomData.getFormattedPrice()
        txtAddressAndFloor.text = "${roomData.address}, ${roomData.getFormattedFloor()}"


        return row

    }

}