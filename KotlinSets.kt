fun main() {
    
    val list = listOf(1,2,3,3,3,3,3,3,4,4,4,4,5,5,5)
                 
    val mutableSet = mutableSetOf<Int>() 
    
    for (e in list) {
        mutableSet.add(e)
    }
        
    print(mutableSet)
}
