package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName = "Mutiara"
    val lastName = "Sabrina Jauhari"
    val age = 21
    val isSingle = true

    println("Haloo, nama saya adalah $firstName $lastName, dan saya berusia $age tahun, saya berstatus single $isSingle")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    return Any()
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(anggotaMassive: List<Any>): Any {

    return anggotaMassive[2]
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(anggotaMassive: List<String>): Int {
    val mentor = arrayOf<String>("Imam", "Jovian")

    return mentor.size + anggotaMassive.size
}

fun main() {
    val anggotaMassive = listOf<String>(
        "Muhammad Firdaus",
        "Dito Iqbal Kesuma",
        "Mutiara Sabrina Jauhari",
        "Austin Nicholas",
        "Rahmad Ikhsan",
        "Aina Fazla",
        "Fadhila Risfaniatul",
        "Kayla Vyanca",
        "Rizka Hilmi",
        "Alfin Satriawan",
        "Adityo Khori"
    )

    myProfile()

    val myTeam = myTeam(anggotaMassive)
    println("My team is: $myTeam")

    val totalMember = totalMember(anggotaMassive)
    println("Total Member group : $totalMember")

    val groupId = "Eternal Light"
    val groupMember = anggotaMassive
    val session = "B-Morning"
    println("\n Saya dari grup $groupId berikut member dari grup saya: \n $groupMember \n Kami dari sesi $session")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Eternal Light", anggotaMassive, "Morning")

}