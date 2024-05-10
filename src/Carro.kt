class Carro(var velocity: Long, var model: String, var accelaration: Long = 10 ) {

    fun velocityUp(){
        velocity += accelaration
        }

    fun velocityDown(){
        if (velocity - accelaration < 0){
            velocity = 0
        }else{
            velocity -= accelaration
        }

    }
}