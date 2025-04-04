fun isValidIpAddress(ip: String): Boolean {
    if (ip.isEmpty()){
        return false
    }
    val ipSegments = ip.split('.')
    if (ipSegments.size != 4) {
//        println("Invalid IP address; not 4 segments")
        return false
    }
    for (seg in ipSegments){
        if (seg.startsWith('0') && seg.length > 1){
//            println("start with zero")
            return false
        }
        var segNum = seg.toIntOrNull() ?: return false

        if ((segNum !in 0..255)){
//            println("segment value outside range 0-255")
            return false
        }

    }
    return true
}