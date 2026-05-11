package org.example

class Complejo(private var real: Int=0, private var imag: Int=0) {
    fun inicializar(real:Int,imag:Int){
        this.real=real
        this.imag=imag
    }
    fun mostrar(){
        println(this.toString())
    }
    override fun toString():String{
        return "(${real},${imag})"
    }
    fun restar(otro: Complejo): Complejo {
        return Complejo(
            real - otro.real,
            imag - otro.imag
        )
    }
}

fun main() {
    var complejo: Complejo
    complejo= Complejo()
    complejo.inicializar(3,4)
    println("mi número complejo es ${complejo.toString()}")
    var c2:Complejo= Complejo(1,2)
    var c3:Complejo
    c3=complejo.restar(c2)
    c3.mostrar()
}