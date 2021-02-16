package SecondaryConstructor.WithoutPrimaryConstructor


//class tanpa primary constructor
class Address {

    var street: String = ""
    var city: String = ""
    var country: String = ""

    //secondary constructor pertama
    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    //secondary constructor kedua
    constructor(paramStreet: String, paramCity: String, paramCountry: String)
            : this(paramStreet, paramCity){
        country = paramCountry
    }
}