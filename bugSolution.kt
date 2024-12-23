fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val sum = try {
        list.fold(0) { acc, i ->
            if (i == 3) {
                throw Exception("Three is not allowed")
            } else {
                acc + i
            }
        }
    } catch (e: Exception) {
        println("An error occurred: "+ e.message)
        0 // or handle it appropriately, e.g. return a default value
    }
    println(sum)
}