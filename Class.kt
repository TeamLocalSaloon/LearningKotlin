fun main() {
    var l1 = Lamp() // creating Lamp class object.
    l1.lampStatus()	
    l1.turnOn()
    l1.lampStatus()
    l1.turnOff()
}

class Lamp{		// Class without a constructor or default constructor
    
    var isLamp : Boolean = false
    
    fun turnOn(){
        isLamp = true
        println("The Lamp is turned on!!")
        
    }
    
    fun turnOff(){
        isLamp = false
        println("The Lamp is turned Off!!")
        
    }
    
    fun lampStatus(){
        if(isLamp) println("The Lamp is currently On") else println("The Lamp is currently Off.")
    }
}
