package kz.company.testappone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val randomList = (0..10).shuffled().take(3)
            textView.text = randomList.max().toString()
            textViewMin.text = randomList.min().toString()
            textViewAverage.text = randomList.average().toString()

            val prosto = 15
            if (prosto % 2 == 1) {
                textViewProsto.text = prosto.toString()
            }
        }
    }
    
}
