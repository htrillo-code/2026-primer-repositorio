package org.example // 1. Siempre la primera línea

// 2. Definición de la clase (El Molde)
class Complejo {
    private var reales: Int = 0
    private var imaginarios: Int = 0

    fun valor(reales: Int, imaginarios: Int) {
        this.reales = reales
        this.imaginarios = imaginarios
    }

    fun mostrar(): String {
        return "($reales, $imaginarios)"
    }
}

// 3. El punto de inicio (Donde usas el molde)
fun main() {
    var complejo: Complejo    // Reservas el nombre
    complejo = Complejo()     // Fabricas el objeto real
    
    complejo.valor(3, 4)      // Le das los valores
    println(complejo.mostrar()) // ¡Imprimes el resultado!
    println("tururum o ya ppepo ah") // ¡Imprimes el resultado!
}