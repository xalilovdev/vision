package uz.alien.libs.vision

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.widget.LinearLayout.LayoutParams

class TextView : androidx.appcompat.widget.AppCompatTextView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    constructor(
        context: Context,
        text: String,
        gravity: Int = Gravity.CENTER,
        width: Int = LayoutParams.WRAP_CONTENT,
        height: Int = LayoutParams.WRAP_CONTENT
    ) : super(context) {
        val layoutParams = LayoutParams(width, height)
        this.layoutParams = layoutParams
        this.text = text
        this.gravity = gravity
    }

    init {
//        currentParent?.addView(this)
    }
}