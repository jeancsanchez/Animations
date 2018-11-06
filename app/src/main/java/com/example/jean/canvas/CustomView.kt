package com.example.jean.canvas

import android.content.Context
import android.graphics.*
import android.support.design.widget.BottomNavigationView
import android.util.AttributeSet
import android.view.View

/**
 * This class represents...
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 06/11/18.
 * Jesus is alive!
 */
class CustomView : View {
    private var mPath: Path? = null
    private var mPaint: Paint? = null

    constructor(context: Context) : super(context) {
        init()
    }


    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()

    }

    private fun init() {
        mPath = Path()
        mPaint = Paint()

        mPaint?.style = Paint.Style.FILL
        mPaint?.color = Color.BLACK
    }


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawCircle((width / 2).toFloat(), (height / 2).toFloat(), 40f, mPaint)
    }
}
