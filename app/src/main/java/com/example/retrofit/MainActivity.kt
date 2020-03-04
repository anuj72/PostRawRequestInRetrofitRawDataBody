package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.test.mvvm.api.MyRetrofitBuilder
import retrofit2.HttpException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.IO ).launch {
            try {
               var str1="{\n" +
                       "    \"data\" : {\n" +
                       "        \"mobile\" : \"qwer\",\n" +
                       "        \"password\" : \"qwer\"\n" +
                       "    },\n" +
                       "    \"commom\" : {}\n" +
                       "}"
                val userdata = MyRetrofitBuilder.apiService.post(str1.toString())
                withContext(Dispatchers.Main) {
                   var value = userdata
                    Log.v("ssssss",value.toString())
                }
            }catch (e: HttpException){
                Log.v("Exception",e.toString())
            }

        }
    }
}
