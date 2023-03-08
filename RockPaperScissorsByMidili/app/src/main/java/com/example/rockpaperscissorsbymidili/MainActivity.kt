package com.example.rockpaperscissorsbymidili

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import androidx.core.view.isVisible
import com.example.rockpaperscissorsbymidili.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var userpick:String=""
    private var botpick:String=""
    private var userwins:Int=0
    private var botwins:Int=0
    private var draws:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.chronometer.base = SystemClock.elapsedRealtime()
        binding.chronometer.start()
    }

    fun rockBtnClick(view:View){
        binding.userpickview.setImageResource(R.drawable.rockuser)
        userpick="rock"
    }

    fun paperBtnClick(view:View){
        binding.userpickview.setImageResource(R.drawable.paperuser)
        userpick="paper"
    }

    fun scissorsBtnClick(view:View){
        binding.userpickview.setImageResource(R.drawable.scissorsuser)
        userpick="scissors"
    }

    fun spockBtnClick(view:View){
        binding.userpickview.setImageResource(R.drawable.spockuser)
        userpick="spock"
    }

    fun lizardBtnClick(view:View){
        binding.userpickview.setImageResource(R.drawable.lizarduser)
        userpick="lizard"
    }

    fun statBtnClick(view:View){
        if(binding.statBtn.text=="показать статистику"){
            binding.userwintxt.isVisible=true
            binding.userwinnum.isVisible=true
            binding.botwinnum.isVisible=true
            binding.botwintxt.isVisible=true
            binding.chronometer.isVisible=true
            binding.timetxt.isVisible=true
            binding.drawnum.isVisible=true
            binding.drawtxt.isVisible=true
            binding.statBtn.text="скрыть статистику"
        }
        else{
            binding.userwintxt.isVisible=false
            binding.userwinnum.isVisible=false
            binding.botwinnum.isVisible=false
            binding.botwintxt.isVisible=false
            binding.chronometer.isVisible=false
            binding.timetxt.isVisible=false
            binding.drawnum.isVisible=false
            binding.drawtxt.isVisible=false
            binding.statBtn.text="показать статистику"
        }
    }

    fun startBtnClick(view:View){
        if(binding.userpickview.getDrawable().getConstantState() != getResources().getDrawable( R.drawable.mainpick).getConstantState()){
            when(Random.nextInt(1,6)){
                1->{
                    botpick="rock"
                    binding.botpickview.setImageResource(R.drawable.rockbot)
                }
                2->{
                    botpick="paper"
                    binding.botpickview.setImageResource(R.drawable.paperbot)
                }
                3->{
                    botpick="scissors"
                    binding.botpickview.setImageResource(R.drawable.scissorsbot)
                }
                4->{
                    botpick="spock"
                    binding.botpickview.setImageResource(R.drawable.spockbot)
                }
                5->{
                    botpick="lizard"
                    binding.botpickview.setImageResource(R.drawable.lizardbot)
                }
            }
            //победы пользователя
            if(userpick=="scissors"&&botpick=="paper"){
                binding.resView.setImageResource(R.drawable.scissorsvspaper)
                binding.notifTxt.text="ВЫ ПОБЕДИЛИ!"
                userwins++
            }
            if(userpick=="paper"&&botpick=="rock"){
                binding.resView.setImageResource(R.drawable.papervsrock)
                binding.notifTxt.text="ВЫ ПОБЕДИЛИ!"
                userwins++
            }
            if(userpick=="rock"&&botpick=="lizard"){
                binding.resView.setImageResource(R.drawable.rockvslizard)
                binding.notifTxt.text="ВЫ ПОБЕДИЛИ!"
                userwins++
            }
            if(userpick=="lizard"&&botpick=="spock"){
                binding.resView.setImageResource(R.drawable.lizardvsspock)
                binding.notifTxt.text="ВЫ ПОБЕДИЛИ!"
                userwins++
            }
            if(userpick=="spock"&&botpick=="scissors"){
                binding.resView.setImageResource(R.drawable.spockvsscissors)
                binding.notifTxt.text="ВЫ ПОБЕДИЛИ!"
                userwins++
            }
            if(userpick=="scissors"&&botpick=="lizard"){
                binding.resView.setImageResource(R.drawable.scissorsvslizard)
                binding.notifTxt.text="ВЫ ПОБЕДИЛИ!"
                userwins++
            }
            if(userpick=="lizard"&&botpick=="paper"){
                binding.resView.setImageResource(R.drawable.lizardvspaper)
                binding.notifTxt.text="ВЫ ПОБЕДИЛИ!"
                userwins++
            }
            if(userpick=="paper"&&botpick=="spock"){
                binding.resView.setImageResource(R.drawable.papervsspock)
                binding.notifTxt.text="ВЫ ПОБЕДИЛИ!"
                userwins++
            }
            if(userpick=="spock"&&botpick=="rock"){
                binding.resView.setImageResource(R.drawable.spockvsrock)
                binding.notifTxt.text="ВЫ ПОБЕДИЛИ!"
                userwins++
            }
            if(userpick=="rock"&&botpick=="scissors"){
                binding.resView.setImageResource(R.drawable.rockvsscissors)
                binding.notifTxt.text="ВЫ ПОБЕДИЛИ!"
                userwins++
            }
            //победы бота
            if(botpick=="scissors"&&userpick=="paper"){
                binding.resView.setImageResource(R.drawable.papervsscissors)
                binding.notifTxt.text="БОТ ПОБЕДИЛ!"
                botwins++
            }
            if(botpick=="paper"&&userpick=="rock"){
                binding.resView.setImageResource(R.drawable.rockvspaper)
                binding.notifTxt.text="БОТ ПОБЕДИЛ!"
                botwins++
            }
            if(botpick=="rock"&&userpick=="lizard"){
                binding.resView.setImageResource(R.drawable.lizardvsrock)
                binding.notifTxt.text="БОТ ПОБЕДИЛ!"
                botwins++
            }
            if(botpick=="lizard"&&userpick=="spock"){
                binding.resView.setImageResource(R.drawable.spockvslizard)
                binding.notifTxt.text="БОТ ПОБЕДИЛ!"
                botwins++
            }
            if(botpick=="spock"&&userpick=="scissors"){
                binding.resView.setImageResource(R.drawable.scissorsvsspock)
                binding.notifTxt.text="БОТ ПОБЕДИЛ!"
                botwins++
            }
            if(botpick=="scissors"&&userpick=="lizard"){
                binding.resView.setImageResource(R.drawable.lizardvsscissors)
                binding.notifTxt.text="БОТ ПОБЕДИЛ!"
                botwins++
            }
            if(botpick=="lizard"&&userpick=="paper"){
                binding.resView.setImageResource(R.drawable.papervslizard)
                binding.notifTxt.text="БОТ ПОБЕДИЛ!"
                botwins++
            }
            if(botpick=="paper"&&userpick=="spock"){
                binding.resView.setImageResource(R.drawable.spockvspaper)
                binding.notifTxt.text="БОТ ПОБЕДИЛ!"
                botwins++
            }
            if(botpick=="spock"&&userpick=="rock"){
                binding.resView.setImageResource(R.drawable.rockvsspock)
                binding.notifTxt.text="БОТ ПОБЕДИЛ!"
                botwins++
            }
            if(botpick=="rock"&&userpick=="scissors"){
                binding.resView.setImageResource(R.drawable.scissorsvsrock)
                binding.notifTxt.text="БОТ ПОБЕДИЛ!"
                botwins++
            }
            //ничья
            if(botpick==userpick){
                binding.resView.setImageResource(R.drawable.draw)
                binding.notifTxt.text="НИЧЬЯ!"
                draws++
            }
            binding.userwinnum.text=userwins.toString()
            binding.botwinnum.text=botwins.toString()
            binding.drawnum.text=draws.toString()
        }
    }


}