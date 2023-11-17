package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    perkalian()
    pembagian()
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
fun perkalian(){
    try {
        val a = 20
        val b = 23
        val c = a * b
        println(c)
    } catch (e: Exception){
        println("Hasil Perkalian adalah ${e.message}")
    }
}

fun pembagian(){
    try {
        val a = 20
        val b = 0
        val c = a / b
        println(c)
    } catch (e: Exception){
        println("Hasil Pembagian adalah ${e.message}")
    }
}