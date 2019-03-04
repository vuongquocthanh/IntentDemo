package android.vuongquocthanh.intentdemo

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "EXTRA_DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btResult.setOnClickListener {
            if (edData.text.isBlank()){
                toast("Vui lòng điền đầy đủ thông tin!")
            }else{
                val data = Intent()
                data.putExtra(EXTRA_DATA, edData.text.toString())
                setResult(Activity.RESULT_OK, data)
                finish()
            }
        }
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_CANCELED)
        super.onBackPressed()
    }
}
