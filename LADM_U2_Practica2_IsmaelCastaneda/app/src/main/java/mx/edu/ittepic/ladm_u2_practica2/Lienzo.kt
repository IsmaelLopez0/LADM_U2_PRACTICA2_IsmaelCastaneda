package mx.edu.ittepic.ladm_u2_practica2_IsmaelCastaneda

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View


class Lienzo (p: MainActivity) : View(p) {

    var burbuja = Burbuja(60f, 60f, 10f)
    var burbuja2 = Burbuja(60f, 60f, 30f)
    var burbuja3 = Burbuja(60f, 60f, 50f)
    var burbuja4 = Burbuja(60f, 60f, 70f)
    var burbuja5 = Burbuja(60f, 60f, 90f)
    var burbuja6 = Burbuja(60f, 60f, 110f)


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        var paint = Paint()

        canvas.drawColor(Color.BLACK)

        paint.color = Color.YELLOW
        burbuja.dibujar(canvas, paint)
        burbuja2.dibujar(canvas, paint)
        burbuja3.dibujar(canvas, paint)
        burbuja4.dibujar(canvas, paint)
        burbuja5.dibujar(canvas, paint)
        burbuja6.dibujar(canvas, paint)

    }

    fun animar(){
        burbuja.mover(width, height)
        burbuja2.mover(width, height)
        burbuja3.mover(width, height)
        burbuja4.mover(width, height)
        burbuja5.mover(width, height)
        burbuja6.mover(width, height)
        invalidate()
    }
}