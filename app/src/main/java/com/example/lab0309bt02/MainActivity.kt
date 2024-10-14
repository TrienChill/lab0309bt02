package com.example.lab0309bt02

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab0309bt02.ui.theme.Lab0309bt02Theme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.view)
        val name = findViewById<TextView>(R.id.name)
        val price = findViewById<TextView>(R.id.price)
        val product = Product("Sản phẩm 1", 10)
        val product1 = Product("sản phẩm 3", 30)
        val Product2 = Product("sản phẩm 4", 100)

        name.text = product1.name
        price.text = "Giá: ${product.price} VNĐ"
    }
}

