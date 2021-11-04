package com.nepplus.jickbangcopy_20211104.datas

import java.text.NumberFormat
import java.util.*

class RoomData(
    val price : Int,
    val address: String,
    val floor: Int,
    val description: String) {

//    가격에 따라 다른 형태로 가공해서 가격을 알려주는 함수

    fun getFormattedPrice() : String{

        if (this.price < 10000) {

            val priceStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            return priceStr

        }
        else{

            val uk = this.price / 10000
            val rest = this.price % 10000
            val restCommaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            val priceStr = "${uk}억 ${restCommaStr}"

            return priceStr

        }

    }

}