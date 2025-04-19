fun main() {
    
    //Mutable and fixed sized.
    //Contigous memory
    val ar1 = arrayOf(1,2,3)  // Implicit type declaration of Array
    val ar2 = arrayOf<Float>(1.0f,2.0f,3.0f) // Explicit declaration of Array
    val ar3 = Array(4,{i->i*2})
    println(ar1[1])
    println(ar2[2])
    println(ar3[3])
}
