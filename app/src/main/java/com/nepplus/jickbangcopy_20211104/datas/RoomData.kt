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

//        if를 사용해서 화면에 비치는 금액이 천단위는 #,000로 나오게 설정
        if (this.price < 10000) {

            val priceStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            return priceStr

        }
//        if밑에 else를 사용하여 억 단위에 억이라는 단어가 나올 수 있게 설정
        else{

            val uk = this.price / 10000
            val rest = this.price % 10000
            val restCommaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            val priceStr = "${uk}억 ${restCommaStr}"

            return priceStr

        }

    }

//    층수를 상황에 따라 가공해서 보여주는 함수.

    fun getFormattedFloor() : String{

        if (this.floor > 0) {
            return "${this.floor}층"

        }
        else if (this.floor == 0){
            return "반지하"
        }
        else {
            return "지하${-this.floor}층"
        }

    }


}