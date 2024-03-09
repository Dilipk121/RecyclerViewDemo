package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.adapter.NewsAdapter
import com.example.recyclerviewdemo.data.News

class MainActivity : AppCompatActivity() {

    lateinit var myRecylerView : RecyclerView
    lateinit var newsArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecylerView = findViewById(R.id.recyclerView)



        val news_img = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7
        )

        val news_heading = arrayOf(
            "Delhi Court Reserves Order On Framing Charges Against BJP MP Brij",
            "It’s a very effective tool for generating attention. Just try not to land on the wrong side of an issue or be disrespectful.",
            "10 Reasons Civilization May Collapse Because Of Organic Foods",
            "The top companies use emotional triggers in nearly every headline,eaches top Delhi varsities",
            "DSSSB TGT Computer Science Result 2024 declared at dsssb.del",
            "EWS relaxation demand reaches top Delhi varsities, events at DU, JNU, Jamia",
            "IIT Delhi opens application for undergraduate summer research fellowship 2024"
        )

        //to set where it scroll via horizental or vertical
        myRecylerView.layoutManager = LinearLayoutManager(this)

        newsArrayList = arrayListOf()

        for (i in news_img.indices){

            val data = News(news_heading[i],news_img[i])
            newsArrayList.add(data)
        }

        myRecylerView.adapter = NewsAdapter(this,newsArrayList)

    }
}