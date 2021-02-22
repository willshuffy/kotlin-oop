package Hashcode.Class

class Username(val name: String) {

    /*
        contoh  tanpa function hashcode :
                                            - hashcode hanya akan mengenerate variable objectnya saja
                                            - jadi walaupun data string nya sama, namun berbeda variabel objectnya, maka representasi angka uniknya berbeda
                                            - biasanya number unik dari representasi hashcode akan sering digunakan pada struktur data, untuk memastikan tidak ada data duplicate
                                            - untuk mengetesnya, coment function hashcode nya

     */


    //contoh implementasi function hashcode
    override fun hashCode(): Int {
        return name.hashCode()
    }

    /*
        contoh dengan function hashcode :
                                            - dengan mengimplementasikan hashcode, kita dapat bebas membuat hashcode nya seperti apa saja
                                            - pada contoh ini, kita akan mengambil hashcode dari atribute name, yang dimana hashcode akan merepresentasikan number unik dari masing" data string nya
                                            - jika datanya sama dan hashcode nya sama maka dianggap objectnya sama
     */

    override fun equals(other: Any?): Boolean {
        return when (other){
            is Username -> other.name == this.name
            else -> false
        }
    }
}