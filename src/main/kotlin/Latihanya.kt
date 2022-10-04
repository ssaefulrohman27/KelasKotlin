fun main () {
    var lamaparkir: Int
    var biayaparkir: Float

    lamaparkir = 8
    //rule biaya parkir

    val tarifdasar = 10
    val tarifberikutnya = 0.5
    val maxtarifperhari = 15

    if ( lamaparkir <= 5) {
        biayaparkir = (lamaparkir*tarifdasar).toFloat()
    }
    else if ((lamaparkir > 5) && (lamaparkir < 24)) {
        biayaparkir = 5+((tarifberikutnya-5)*lamaparkir).toFloat()
    }
    else {
        biayaparkir = maxtarifperhari.toFloat()
    }

    println("lamapakir : $lamaparkir ")
    println("biayaparkir : $biayaparkir")

}
