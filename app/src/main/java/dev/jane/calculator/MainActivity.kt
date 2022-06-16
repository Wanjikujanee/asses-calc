package dev.jane.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivityActivity : AppCompatActivity() {
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
    lateinit var btnMultiplication: Button
    lateinit var btnDivision: Button
    lateinit var etnumber: EditText
    lateinit var etnumber2: EditText
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction= findViewById(R.id.btnSubtraction)
        btnMultiplication = findViewById(R.id.btnMultiplication)
        btnDivision = findViewById(R.id.btnDivision)
        etnumber = findViewById(R.id.etnumber)
        etnumber2 = findViewById(R.id.etnumber2)
        tvResult= findViewById(R.id.tvResults)

        btnAddition.setOnClickListener {
            val number = etnumber.text.toString()
            val numberDecimal = etnumber2.text.toString()
            if (number.isBlank()) {
                etnumber.error = "Number is required"
                return@setOnClickListener
            }
            if (numberDecimal.isBlank()) {
                etnumber2.error = "NumberDecimal is required"
                return@setOnClickListener
            }
            addition(number.toInt(), numberDecimal.toInt())

        }
        btnSubtraction.setOnClickListener {
            val number = etnumber.text.toString()
            val numberDecimal = etnumber2.text.toString()
            if (number.isBlank()) {
                etnumber.error = "Number is required"
                return@setOnClickListener
            }
            if (numberDecimal.isBlank()) {
                etnumber2.error="NumberDecimal is required"
                return@setOnClickListener
            }
            subtraction(number.toInt(),numberDecimal.toInt())
        }
        btnMultiplication.setOnClickListener {
            val number = etnumber.text.toString()
            val numberDecimal = etnumber2.text.toString()
            if (number.isBlank()) {
                etnumber.error="Number is required"
                return@setOnClickListener
            }
            if (numberDecimal.isBlank()) {
                etnumber2.error="NumberDecimal is required"
                return@setOnClickListener
            }
            multiplication(number.toInt(),numberDecimal.toInt())
        }

        btnDivision.setOnClickListener {
            val number = etnumber.text.toString()
            val numberDecimal = etnumber2.text.toString()
            if (number.isBlank()) {
                etnumber.error="Number is required"
                return@setOnClickListener
            }
            if (numberDecimal.isBlank()) {
                etnumber2.error="NumberDecimal is required"
                return@setOnClickListener
            }
            division(number.toInt(),numberDecimal.toInt())
        }
    }


    fun addition(number: Int, numberDecimal: Int) {
        val addition = number + numberDecimal
        tvResult.text = addition.toString()

    }

    fun subtraction(number: Int, numberDecimal: Int) {
        val subtraction = number - numberDecimal
        tvResult.text = subtraction.toString()
    }

    fun multiplication(number:Int, numberDecimal:Int){
        val multiply=number*numberDecimal
        tvResult.text=multiply.toString()

    fun division(number:Int, numberDecimal:Int){
        val divide=number%numberDecimal
        tvResult.text=divide.toString()
    }

        }


fun validatenumber() {
    var Number=etnumber.text.toString()
    var =Number.text.toString()
    if(Number.isBlank()){
        etnumber.error="Number is invalid"
    }
    if (Number.isBlank()){
        etnumber2.error="Number is required"
    }
      }
