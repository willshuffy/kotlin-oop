package AnonymousClass

import AnonymousClass.Class.Mountain

fun hikeTrack(track : Mountain){
    track.track()
}

//contoh tanpa menggunakan anonymous class
class SampleMountain : Mountain{
    override fun track() {
        println("Hiking mountain")
    }
}

fun main() {

    hikeTrack(SampleMountain()) //hanya dengan seperti itu maka hanya implementasi class seperti biasanya

    //contoh dengan implementasi anonymous class
    hikeTrack(object : Mountain {
        override fun track() { //jadi bisa langsung mendeklarasikan objectnya secara langsung
            println("Mountain A")
        }
    })

    hikeTrack(object : Mountain{
        override fun track() {
            println("Mountain B")
        }
    })

}