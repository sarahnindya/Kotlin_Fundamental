fun main() {
    val schoolOpen = 7
    val schoolClosed = 16
    val now = 20
    val isOpen = now < schoolOpen || now > schoolClosed
    print("School is closed : $isOpen")
    /*
   Output : School is closed : true
   */
}