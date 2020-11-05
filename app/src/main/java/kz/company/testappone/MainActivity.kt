package kz.company.testappone

import android.os.Bundle
import android.widget.Toast
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
            val n: Int = Random.nextInt(2, 100)
            textViewProstoe.text = n.toString()
            textViewProsto.text = isProstoe(n).toString()
        }

        button_tree.setOnClickListener {
            val str = "Kazak azak".toLowerCase()
            val characterHashMap: HashMap<Char, Int> = HashMap<Char, Int>()
            var countNumber = 0
            for (i in str.indices) {
                val countNumber = str[i]
                if (countNumber != ' ') {
                    if (characterHashMap.containsKey(countNumber)) {
                        characterHashMap[countNumber] = characterHashMap[countNumber]!! + 1
                    } else {
                        characterHashMap[countNumber] = 1
                    }
                }
            }
            text_count.text = characterHashMap.toString()
        }
    }


    fun isProstoe(n: Int): Boolean {
        if (n < 2) return false
        for (m in 2..sqrt(n.toDouble()).toInt()) {
            if (n % m == 0) return false
        }
        return true
    }
}
