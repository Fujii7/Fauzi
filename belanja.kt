fun itembarang(item:String):Int {
    return when (item) {
        "Kaos Polos" -> 112000
        "Topi" ->34999
        "Celana" -> 245000
        "Tas Sekolah" -> 120000
        "Singlet" ->20000
        else ->0
    }
}
fun diskon(harga:Int,):Int{
    return if (harga>=100000){
        (harga * 0.1).toInt()
    }
    else if (harga>=80000){
        (harga * 0.05).toInt()
    }
    else {
        println("Anda tidak mendapatkan diskon")
    }
    
}
fun totalharga(harga:Int, diskon:Int):Int {
    return harga - diskon
}
fun main(){
    val item = "Kemeja"
    val harga = itembarang(item)
    val diskon = diskon(harga)
    val totalharga = totalharga(harga,diskon)
    println("Harga $item adalah \t: $harga \nDengan diskon yaitu \t: $diskon \nTotal harga menjadi \t: $totalharga")
}
