package mx.edu.ittepic.ladm_u2_practica2_IsmaelCastaneda

import android.graphics.Canvas
import android.graphics.Paint

class Burbuja (){

    var x = 0f
    var y = 0f
    var radio = 0f
    var incX = 5f//valor por defecto si radio es mayor igual a 100
    var incY = 5f

    constructor(x: Float, y: Float, radio: Float): this() {
        this.x = x
        this.y = y
        this.radio = radio
        if(radio in 75.0..99.9){
            incX *= 2
            incY *= 2
        }
        if(radio in 50.0..74.9){
            incX *= 3
            incY *= 3
        }
        if(radio in 25.0..49.9){
            incX *= 4
            incY *= 4
        }
        if(radio in 0.0..24.9){
            incX *= 5
            incY *= 5
        }
    }

    fun dibujar(c: Canvas, p: Paint){
        c.drawCircle(x, y, radio, p)
    }

    fun mover(width: Int, height: Int){
        x += incX
        if(x>=width || x<=0)
            incX *= -1
        y += incY
        if(y>=height || y<=0)
            incY *= -1
    }

}