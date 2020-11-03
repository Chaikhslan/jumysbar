package kz.company.testappone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.sqrt
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val randomList = (0..10).shuffled().take(3)
            textView.text = randomList.max().toString()
            textViewMin.text = randomList.min().toString()
            textViewAverage.text = randomList.average().toString()
        }

        buttontwo.setOnClickListener {
            val n: Int = Random.nextInt(2,100)
            textViewProstoe.text = n.toString()
            textViewProsto.text = isProstoe(n).toString()
        }

        button_tree.setOnClickListener {
            val text: String = "jurttynbalasy"
            var number:Int = 0
            val textConvert = text.toCharArray()
            for (item in textConvert.indices) textConvert[item] = textConvert[item]
        }
    }


    private fun isProstoe(n: Int): Boolean {
        if (n < 2) return false
        for (m in 2..sqrt(n.toDouble()).toInt()) {
            if (n % m == 0) return false
        }
        return true
    }
}
