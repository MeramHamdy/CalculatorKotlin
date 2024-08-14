package com.example.fristappkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fristappkotlin.ui.theme.FristAppKotlinTheme

class MainActivity : ComponentActivity() {
    lateinit var confirmBT : Button
    lateinit var helloTV : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.session1)

//        var cofirmBT : Button = findViewById(R.id.bt_confirm)
        confirmBT = findViewById(R.id.bt_confirm)
//        var helloTV : TextView = findViewById(R.id.tv_hello)
        helloTV = findViewById(R.id.tv_hello)



        confirmBT.setOnClickListener{   //call back method  //for any view not btn only
//            Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT).show() //context---ennvironment or same activity now
            helloTV.text= "Confirmed"
        }
    }

    override fun onResume() {
        super.onResume()
        confirmBT.text= ""
    }
}