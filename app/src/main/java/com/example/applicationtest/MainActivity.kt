package com.example.applicationtest
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cities = mutableListOf("New York","Paris","London","Naples","Oslo","Sydney","Calcutta")
    	var cityText = findViewById<TextView>(R.id.cityTextId)
    	var randomCityButton = findViewById<Button>(R.id.cityButton)
    	cityText.text = "Random City"
    	
    	randomCityButton.setOnClickListener{
    		cityText.text = cities.random()
    		}
    	
    	
    }
}
