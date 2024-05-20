package Day7.HighOrderFunctionsAndLamdas

fun main() {
    High(90, 91, 94, {n1: Int, n2: Int, n3: Int -> n1+n2+n3} )
}

fun High(n1: Int, n2:Int, n3: Int, calc: (Int, Int, Int) -> Int){
    println(calc(n1,n2,n3))
}