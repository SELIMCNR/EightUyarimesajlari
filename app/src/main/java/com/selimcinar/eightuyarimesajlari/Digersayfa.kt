package com.selimcinar.eightuyarimesajlari

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Digersayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_digersayfa)
    }
    fun Mesaj(view: View){
        val uyariMesaj=AlertDialog.Builder(this@Digersayfa)
        uyariMesaj.setTitle("Giriş hatası")
        uyariMesaj.setMessage("Hatalı giriş yapıldı tekrar giriş yapmak ister misin?")

        uyariMesaj.setPositiveButton("Evet",DialogInterface.OnClickListener{
            dialogInterface, i ->
            Toast.makeText(this,"Giriş için bekleyiniz",Toast.LENGTH_LONG)
        })

        uyariMesaj.setNegativeButton("Hayır"){
            dialogInterface,i ->
            Toast.makeText(this,"Hatalı giriş çıkış yapıyorsunuz ",Toast.LENGTH_LONG)
        }
        uyariMesaj.show()
    }
}