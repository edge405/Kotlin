package Day7.HighOrderFunctionsAndLamdas

fun main() {
    val avg = {num1: Int, num2: Int, num3: Int -> (num1+num2+num3)/3 }

    println(avg(99, 90, 91))
}