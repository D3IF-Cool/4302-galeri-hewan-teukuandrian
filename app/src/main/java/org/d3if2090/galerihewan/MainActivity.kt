package org.d3if2090.galerihewan

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nextButton: Button = findViewById(R.id.nextButton)
        nextButton.setOnClickListener { showNext() }
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)

    }
        Hewan("Angsa", "Cygnus olor", R.drawable.angsa),
        Hewan("Ayam", "Gallus gallus", R.drawable.ayam),
        Hewan("Bebek", "Cairina moschata", R.drawable.bebek),
        Hewan("Domba", "Ovis ammon", R.drawable.domba),
        Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun),
        Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing),
        Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci),
        Hewan("Kerbau", "Bubalus bubalis", R.drawable.kerbau),
        Hewan("Kuda", "Equus caballus", R.drawable.kuda),
        Hewan("Sapi", "Bos taurus", R.drawable.sapi),
        )
    }

    private fun showNext() {
        index = if (index == hewan.size - 1) 0 else index + 1


            imageView.setImageResource(resourceId)

            val textView: TextView = findViewById(R.id.nameTextView)
            textView.text = hewan[index]
        }
    }
}