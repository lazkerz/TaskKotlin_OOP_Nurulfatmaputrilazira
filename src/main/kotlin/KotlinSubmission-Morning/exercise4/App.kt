package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    var login = true
    try {
        println("Anda sudah login $login")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika")
    }
}
