package org.example

class Complejo(private var real: Double=0.0, private var imag: Double=0.0) {
    fun inicializar(real:Double,imag:Double){
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
    fun multiplicar(otro: Complejo): Complejo {
            val r =  real * otro.real - (this.imag*otro.imag)
            val i = real * otro.imag +(imag * otro.real)
            return Complejo(r,i)
    }
        fun dividir(otro: Complejo): Complejo {
            val denominador= otro.real*otro.real + (otro.imag*otro.imag)
            val r = (real * otro.real + (this.imag*otro.imag)) / denominador
            val i = (this.imag * otro.real - (this.real * otro.imag)) /denominador

            return Complejo(r,i)
    }
}

fun main() {
    var complejo: Complejo
    complejo= Complejo()
    complejo.inicializar(3.0,4.0)
    println("mi número complejo es ${complejo.toString()}")
    var c2:Complejo= Complejo(1.0,2.0)
    var c3:Complejo
    c3=complejo.restar(c2)
    c3.mostrar()
    var c4=complejo.multiplicar(c2)
    c4.mostrar()
    var c5=complejo.dividir(c2)
    c5.mostrar()
}