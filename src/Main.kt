import kotlin.math.*

fun main() {
    val array = doubleArrayOf(5.4, 7.6, 1.2, 3.3, 7.1, 9.8, 45.3, 100.2, 4.5, 6.6)
    println("Произведение элементов массива: " +
            String.format("%.99f", productOfArrayElements(array)).trimEnd('0')
    )

    val arrayInt = intArrayOf(5, 7, 1, 3, 8, 9, 45, 100)
    println("Среднее арифметическое элементов массива: " + arithmeticMeanOfArrayElements(arrayInt))

    printInSameOrderAllEvenNumbersAndNumberOfSuchNumbers(arrayInt)

    val N = 8
    println("Целочисленный массив размера $N, содержащий степени двойки от первой до $N-й: "
            + integerArrayContainingPowersOfTwo(N).asList())
}

/*
Создать массив из 10 чисел с плавающей точкой. Найти произведение его элементов.
*/
fun productOfArrayElements(array: DoubleArray): Double {
    var result = 1.0
    for (a in array) result *= a
    return result
}

/*
Создать массив из 8 целых чисел. Найти среднее арифметическое его элементов.
*/
fun arithmeticMeanOfArrayElements(arrayInt: IntArray): Double{
    return arrayInt.average()
}

/*
Дан массив размерностью size. Вывести в том же порядке все четные числа из данного набора и количество K таких чисел.
*/
fun printInSameOrderAllEvenNumbersAndNumberOfSuchNumbers(array: IntArray){
    var K = 0
    print("Вывести в том же порядке все четные числа из набора ${array.asList()} : ")
    for (a in array.indices){
        if (array[a] % 2 == 0){
            if (a != array.size - 1) print("${array[a]}, ") else print(array[a])
            K++
        }
    }
    println(" и количество таких чисел: $K")
}

/*
Дано целое число N(>0).
Сформировать и вывести целочисленный массив размера N, содержащий степени двойки от первой до N-й: 2,4,8,16,….
*/
fun integerArrayContainingPowersOfTwo(N: Int): IntArray {
    val arrayInt = IntArray(N)
    for (a in 0..<N) arrayInt[a] = 2.0.pow(a + 1.toDouble()).toInt()
    return arrayInt
}

/*
Примечания:
- Для вывода значений на экран используйте функцию println().
*/