package com.mrt.mytravellifemap.tools

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.VideoView

class MyVideoView : VideoView {

    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)

    //重點就在此 , 覆寫這個 onMeasure 就可以滿板了 : )
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        int width = getDefaultSize( 0, widthMeasureSpec);
//        int height = getDefaultSize( 0 , heightMeasureSpec);
//        setMeasuredDimension(width , height);
        val width = MeasureSpec.getSize(widthMeasureSpec)
        val height = width * 1136 / 640
        Log.e("tty", "$width : $height")
        setMeasuredDimension(width, height)
    }
}