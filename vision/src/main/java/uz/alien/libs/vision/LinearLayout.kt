package uz.alien.libs.vision

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.widget.Button

open class LinearLayout : android.widget.LinearLayout {

    constructor(context: Context, init: LinearLayout.() -> Unit) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
//        currentParent = this
        this.gravity = Gravity.CENTER
        this.orientation = VERTICAL
    }

    constructor(
        context: Context,
        gravity: Int = Gravity.CENTER,
        orientation: Int = VERTICAL,
        children: ArrayList<View> = arrayListOf(),
    ) : super(context) {

        this.gravity = gravity
        this.orientation = orientation

        addViews(children)
    }

//    constructor(context: Context, init: android.widget.LinearLayout.() -> Unit) : super(context) {
//        this.init()
//    }

    fun button(init: Button.() -> Unit): Button {
        val button = Button(context)
        button.init()
        addView(button)
        return button
    }

    fun addViews(children: ArrayList<View>) {
        for (child in children) addView(child)
    }
}