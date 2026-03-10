package oop_00000110698_MuhammadIrsalGinanjar.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    t
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }


    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}