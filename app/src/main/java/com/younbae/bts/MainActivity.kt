package com.younbae.bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1. 화면이 클릭되었다는 것을 알아야한다.
        val image1 =findViewById<ImageView>(R.id.bts_image_1)// val로 변수하나 선언 이변수 안에 이미지를 넣음
        val image2 =findViewById<ImageView>(R.id.bts_image_2)
        val image3 =findViewById<ImageView>(R.id.bts_image_3)
        val image4 =findViewById<ImageView>(R.id.bts_image_4)
        val image5 =findViewById<ImageView>(R.id.bts_image_5)
        val image6 =findViewById<ImageView>(R.id.bts_image_6)
        val image7 =findViewById<ImageView>(R.id.bts_image_7)

        image1.setOnClickListener{ // Image를 클릭했을때 발생하는 것
            Toast.makeText(this,"1번 클릭완료",Toast.LENGTH_LONG).show() // 토스트 메세지를 띄울 수 있음
            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게보여줌
            var intent = Intent(this,Bts1Activity::class.java)
            startActivity(intent)
        }

        image2.setOnClickListener{ // Image를 클릭했을때 발생하는 것
            Toast.makeText(this,"2번 클릭완료",Toast.LENGTH_LONG).show() // 토스트 메세지를 띄울 수 있음
            var intent = Intent(this,Bts2Activity::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener{ // Image를 클릭했을때 발생하는 것
            Toast.makeText(this,"3번 클릭완료",Toast.LENGTH_LONG).show() // 토스트 메세지를 띄울 수 있음
            var intent = Intent(this,Bts3Activity::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener{ // Image를 클릭했을때 발생하는 것
            Toast.makeText(this,"4번 클릭완료",Toast.LENGTH_LONG).show() // 토스트 메세지를 띄울 수 있음
            var intent = Intent(this,Bts4Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener{ // Image를 클릭했을때 발생하는 것
            Toast.makeText(this,"5번 클릭완료",Toast.LENGTH_LONG).show() // 토스트 메세지를 띄울 수 있음
            var intent = Intent(this,Bts5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener{ // Image를 클릭했을때 발생하는 것
            Toast.makeText(this,"6번 클릭완료",Toast.LENGTH_LONG).show() // 토스트 메세지를 띄울 수 있음
            var intent = Intent(this,Bts6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener{ // Image를 클릭했을때 발생하는 것
            Toast.makeText(this,"7번 클릭완료",Toast.LENGTH_LONG).show() // 토스트 메세지를 띄울 수 있음
            var intent = Intent(this,Bts7Activity::class.java)
            startActivity(intent)
        }



    }
}