package com.example.pdm_0x2

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import java.lang.String

import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var seekBar0x1: SeekBar
    private lateinit var seekBar0x2: SeekBar
    private lateinit var seekBar0x3: SeekBar

    private var seekBar0x1Value: Int = 0
    private var seekBar0x2Value: Int = 0
    private var seekBar0x3Value: Int = 0

    private lateinit var textViewColor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val x: Int = Random.nextInt(1, 255);
        // val y: Int = Random.nextInt(1, 255);
        // val z: Int = Random.nextInt(1, 255);

        // val hex = String.format(
        //     "#%02x%02x%02x", x, y, z)
        // textViewColor.text = hex

        // textViewColor.setBackgroundColor(
        //     Color.rgb(x, y, z))

        this.seekBar0x1 = findViewById(R.id.seekBar0x1)
        this.seekBar0x2 = findViewById(R.id.seekBar0x2)
        this.seekBar0x3 = findViewById(R.id.seekBar0x3)

        this.textViewColor = findViewById(R.id.textViewColor)

        seekBar0x1.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            @SuppressLint("SetTextI18n")
            override fun onProgressChanged(
                seekBar: SeekBar, progress: Int,
                fromUser: Boolean
            ) {
                seekBar0x1Value = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                textViewColor.setBackgroundColor(
                    Color.rgb(seekBar0x1Value, seekBar0x2Value, seekBar0x3Value))
                val hex = String.format(
                    "#%02x%02x%02x", seekBar0x1Value, seekBar0x2Value, seekBar0x3Value)
                textViewColor.text = hex
            }
        })

        seekBar0x2.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            @SuppressLint("SetTextI18n")
            override fun onProgressChanged(
                seekBar: SeekBar, progress: Int,
                fromUser: Boolean
            ) {
                seekBar0x2Value = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                textViewColor.setBackgroundColor(
                    Color.rgb(seekBar0x1Value, seekBar0x2Value, seekBar0x3Value))
                val hex = String.format(
                    "#%02x%02x%02x", seekBar0x1Value, seekBar0x2Value, seekBar0x3Value)
                textViewColor.text = hex
            }
        })

        seekBar0x3.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            @SuppressLint("SetTextI18n")
            override fun onProgressChanged(
                seekBar: SeekBar, progress: Int,
                fromUser: Boolean
            ) {
                seekBar0x3Value = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                textViewColor.setBackgroundColor(
                    Color.rgb(seekBar0x1Value, seekBar0x2Value, seekBar0x3Value))
                val hex = String.format(
                    "#%02x%02x%02x", seekBar0x1Value, seekBar0x2Value, seekBar0x3Value)
                textViewColor.text = hex
            }
        })
    }
}