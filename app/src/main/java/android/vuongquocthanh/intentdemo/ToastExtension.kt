package android.vuongquocthanh.intentdemo

import android.content.Context
import android.support.v4.app.Fragment
import android.widget.Toast

fun Context.toast(message:String, duration:Int = Toast.LENGTH_LONG){
    Toast.makeText(this, message, duration).show()
}