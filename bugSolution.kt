fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.replaceAll { it * 2 }
    println(mutableList) // Output: [2, 4, 6, 8, 10]

    //Alternative using indices
    for (i in mutableList.indices) {
        mutableList[i] *= 2
    }
    println(mutableList) // Output: [4, 8, 12, 16, 20]
}