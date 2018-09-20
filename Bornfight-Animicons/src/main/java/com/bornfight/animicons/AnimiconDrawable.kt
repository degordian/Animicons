package com.bornfight.animicons

import android.content.Context
import android.support.annotation.DrawableRes
import android.support.annotation.StyleRes
import android.support.graphics.drawable.AnimatedVectorDrawableCompat
import android.support.v7.view.ContextThemeWrapper

object AnimiconDrawable {

    /**
     * Static function for creating an Animated Vector Drawable from the icon pack.
     * Icon style is customizable.
     *
     * @param context App context
     * @param iconIdResource Icon resource ID
     * @param styleId Icon style
     * @return styled animated vector drawable
     */
    @JvmStatic
    @JvmOverloads
    fun create(context: Context,
               @DrawableRes iconIdResource: Int,
               @StyleRes styleId: Int = R.style.AnimiconStyle): AnimatedVectorDrawableCompat? {
        val wrapper = ContextThemeWrapper(context, styleId)
        return AnimatedVectorDrawableCompat.create(wrapper, iconIdResource)
    }

}