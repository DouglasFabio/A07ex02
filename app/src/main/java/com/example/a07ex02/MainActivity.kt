package com.example.a07ex02

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var meuLayout = findViewById<ConstraintLayout>(R.id.telaPrincipal)

        meuLayout.setOnClickListener { view ->
            var rotulo = "clicou"
            var s = Snackbar.make(view, rotulo.toString(), Snackbar.LENGTH_INDEFINITE )
            s.setAction("Fechar", {s.dismiss()})
            s.show()
        }
    }
}