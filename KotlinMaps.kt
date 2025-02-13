fun main() {
    
    val mapInmutable: Map<String, Int> = mapOf("Holis" to 1)
    
    val mapMutable: MutableMap<Char, Int> = mutableMapOf()
    
    val completeString = "otorrinolaringologo"
    
    completeString.forEach { char ->
        
        mapMutable[char] = mapMutable.getOrDefault(char, 0) + 1
        
    }
    
    var winner: Pair<Char, Int> = Pair('z', 0)
    
    mapMutable.forEach { entry-> 
    	if (entry.value > winner.second) {
            winner = Pair(entry.key, entry.value)
        }
    }
    
    print(winner)
    
}
