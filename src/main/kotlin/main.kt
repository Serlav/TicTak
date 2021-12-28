fun main() {
    // field()

    val field = mutableListOf<String>()
    var arr = emptyArray<String>()
    var f: String
    var i = 0
    println(field)

    while (true) {
        println("Введите элементы массива")
        f = readLine().toString()

        if (f == "end") {
            break
        } else {
            println(f)
            field.add(i, f)
            i += 1
        }
    }
    println(field)
    var j = 0
    for (fields in field) {
//        arr[] = field[]
        j += 1
    }
    println(j)
//    println(field.last())
}



