fun main(){
 var ip1: String = " "
    testValidIpAddress(name = "handle empty address should return false",
        result = isValidIpAddress(ip1),
        correctResult = false)

    var ip2: String = "25.144.111.223"
    testValidIpAddress(name = "handle valid address should return true",
        result = isValidIpAddress(ip2),
        correctResult = true)

    var ip3: String = "255.044.111.222"
    testValidIpAddress(name = "handle segment address start with zero should return false",
        result = isValidIpAddress(ip3),
        correctResult = false)

    var ip4: String = "258.044.111.222"
    testValidIpAddress(name = "handle segment address value outside range 0-255 should return false",
        result = isValidIpAddress(ip4),
        correctResult = false)

    var ip5: String = "aaa.144.111.222"
    testValidIpAddress(name = "handle non numerical segment address should return false",
        result = isValidIpAddress(ip5),
        correctResult = false)

    var ip5_2: String = "23.14.*.222"
    testValidIpAddress(name = "handle invalid character (other character)  should return false",
        result = isValidIpAddress(ip5_2),
        correctResult = false)

    var ip6: String = "23.144.111.222.32"
    testValidIpAddress(name = "handle invalid segments count should return false",
        result = isValidIpAddress(ip6),
        correctResult = false)


    var ip7: String = "23.g.111.222"
    testValidIpAddress(name = "handle invalid character (alphabet character)  should return false",
        result = isValidIpAddress(ip7),
        correctResult = false)



    var ip8: String = "23.14.-43.222"
    testValidIpAddress(name = "handle invalid number (negative number) should return false",
        result = isValidIpAddress(ip8),
        correctResult = false)

    var ip9: String = "23.14.0.222"
    testValidIpAddress(name = "handle valid address segment which it's value is zero should return true",
        result = isValidIpAddress(ip9),
        correctResult = true)

    var ip10: String = "23.14.0.222."
    testValidIpAddress(name = "handle address that contain more than 3 dots should return false",
        result = isValidIpAddress(ip10),
        correctResult = false)



}
fun testValidIpAddress(name:String, result:Boolean, correctResult:Boolean){
    if (result == correctResult){
        println("success $name")
    }else{
        println("failed $name")
    }
}

