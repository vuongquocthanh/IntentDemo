package android.vuongquocthanh.intentdemo

import android.os.Parcelable
import androidx.versionedparcelable.ParcelField
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student(var studentID:String, var studentName:String):Parcelable