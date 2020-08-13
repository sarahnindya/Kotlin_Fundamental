fun main() {
    val panjang = "20"
    val lebar = 12.5
    val tinggi = 10
    val volume = Double
    hitungVolume(20.0, 11.5, 10.0)
}
fun hitungVolume(p : Double, l : Double, t : Double) {
    val v = p * l * t
    println("Volume dari balok yang mempunyai panjang $p, lebar $l, dan tinggi $t, ini adalah $v")
}