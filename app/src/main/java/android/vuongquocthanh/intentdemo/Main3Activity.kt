package android.vuongquocthanh.intentdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val bundle : Bundle? = intent.extras
        val student : Student = bundle?.getParcelable("intentObject") as Student
        tvID.text = student.studentID
        tvName.text = student.studentName
    }
}
