package android.vuongquocthanh.intentdemo

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val REQUEST_CODE_EXAMPLE = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btIntentObject.setOnClickListener { intentObject() }
        btShowWebPage.setOnClickListener { showWebPage() }
        btStartActivity.setOnClickListener { startActivityForResult(Intent(this, Main2Activity::class.java), REQUEST_CODE_EXAMPLE) }
    }

    fun showWebPage(){
        val intentWebPage = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com.vn"))
        startActivity(intentWebPage)
    }

    fun intentObject(){
        val intent = Intent(this, Main3Activity::class.java)
        val student = Student("hihi", "Cao Van Hieu")
        intent.putExtra("intentObject", student)
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==REQUEST_CODE_EXAMPLE){
            if (resultCode == Activity.RESULT_OK){
//                Nhận giá trị trả về từ Main2Activity
                val result = data?.getStringExtra(Main2Activity.EXTRA_DATA)
                tvResult.text = result
            }else{
                Toast.makeText(this, "Không nhận được dữ liệu trả về!", Toast.LENGTH_LONG).show()
            }
        }
    }
}
