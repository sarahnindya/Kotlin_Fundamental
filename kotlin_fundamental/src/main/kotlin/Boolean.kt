fun main(){
    val nilaiMu = 87
    val grade : Char

    grade = if (nilaiMu > 90) {
        'A'
    } else if (nilaiMu <= 90 && nilaiMu > 80) {
       'B'
    } else if (nilaiMu <= 80 && nilaiMu > 70) {
       'C'
    } else if (nilaiMu <= 70 && nilaiMu > 60) {
        'D'
    } else {
       'E'
    }
    print("Nilaimu $grade")
}