package com.selimcinar.eightuyarimesajlari

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Uyari mesajlari toast ve alert
        // Context activityMain this,this@MainActivity : applicationContext uygulama contexti
     /*
        Toast.makeText(this,"Hoşgeldin!",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Hoşgelmişen",Toast.LENGTH_LONG).show()
*/
        Toast.makeText(applicationContext,"Hoşgeldin",Toast.LENGTH_LONG).show()
    }
    fun mesajGoster(view:View){
        val uyariMesaji=AlertDialog.Builder(this@MainActivity)
        //alert-->uyarimesajini inşaa ediyoruz.
        uyariMesaji.setTitle("Şifre Hatası")       //Uyari mesajı başlığı
        uyariMesaji.setMessage("Şifreyi girmediniz,baştan denemek ister misiniz?")  //Uyari mesajı metni

        //Lambda Gösterimi
        uyariMesaji.setPositiveButton("Evet",DialogInterface.OnClickListener{      // Uyari mesajında evete tıklanınca ne olsun
            dialogInterface, i ->
            Toast.makeText(this,"Baştan deniyorsunuz",Toast.LENGTH_LONG).show()
        })

        uyariMesaji.setNegativeButton("Hayir") {dialogInterface,i -> // 2.farklı örnek hayıra basılınca ne olsun.
            Toast.makeText(this,"Hayırı seçtiniz,Deneyemiyorsunuz",Toast.LENGTH_LONG).show()
        }
        uyariMesaji.show()
    }
    fun aktiviteyeGit(view: View){
        val intent=Intent(applicationContext,Digersayfa::class.java)
        startActivity(intent)
    }
}