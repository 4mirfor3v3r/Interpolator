package com.amier.interpolator

import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.Interpolator
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.accelerate_cubic))
            tv.text = "accelerate_cubic"
        }
        button2.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.accelerate_decelerate))
            tv.text = "accelerate_decelarate"
        }
        button3.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.accelerate_quad))
            tv.text = "accelerate_quad"
        }
        button4.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.accelerate_quint))
            tv.text = "accelerate_quint"
        }
        button5.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.anticipate))
            tv.text = "anticipate"

        }
        button6.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.anticipate_overshoot))
            tv.text = "anticipate_overshoot"
        }
        button7.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.bounce))
            tv.text = "accelerate_decelarate"
        }
        button8.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.cycle))
            tv.text = "bounce"
        }
        button9.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.decelerate_cubic))
            tv.text = "decelerate_cubic"
        }
        button10.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.decelerate_quad))
            tv.text = "decelerate_quad"
        }
        button11.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.decelerate_quint))
            tv.text = "decelerate_quint"
        }
        button12.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.fast_out_extra_slow_in))
            tv.text = "fast_out_extra_slow_in"
        }
        button13.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.fast_out_linear_in))
            tv.text = "fast_out_linear_in"
        }
        button14.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.fast_out_slow_in))
            tv.text = "fast_out_slow_in"
        }
        button15.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.linear))
            tv.text = "linear"
        }
        button16.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.linear_out_slow_in))
            tv.text = "linear_out_slow_in"
        }
        button17.setOnClickListener {
            animate(AnimationUtils.loadInterpolator(this,android.R.interpolator.overshoot))
            tv.text = "overshoot"
        }
    }
    private fun animate(interpolator: Interpolator){
        val img_animation = findViewById<ConstraintLayout>(R.id.layout)
        val height = resources.displayMetrics.heightPixels.toFloat() - resources.displayMetrics.ydpi
        Log.e("Height Pixel", height.toString())
        Log.e("Height DPI",resources.displayMetrics.ydpi.toString())
        Log.e("Height Density",resources.displayMetrics.density.toString())
        Log.e("Height Scaled density",resources.displayMetrics.scaledDensity.toString())
        val animation = TranslateAnimation(0.0f, 0f, 0.0f, height)
        animation.interpolator = interpolator
        animation.repeatMode = TranslateAnimation.REVERSE
        animation.duration = 1800
        animation.repeatCount = TranslateAnimation.INFINITE

        img_animation.startAnimation(animation) // start animation
    }
}
