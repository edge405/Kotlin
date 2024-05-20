package Day7.HighOrderFunctionsAndLamdas

fun main() {
    HighOrder(50, 80, 40, ::myfunction)
}
fun myfunction(num1: Int, num2: Int, num3: Int): Int{
    return (num1+num2+num3)/3
}

fun HighOrder(num1: Int, num2: Int, num3: Int, funcName:(Int, Int, Int) -> Int) {
    println(funcName(num1, num2, num3))
}
