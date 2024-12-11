package com.example.pertemuan10.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pertemuan10.data.dao.MahasiswaDao
import com.example.pertemuan10.data.entity.Mahasiswa

@Database(entities = [Mahasiswa:: class], version = 1, exportSchema = false )
abstract class KrsDatabase : RoomDatabase(){
    //mendfinisikan fungsi untuk mengakses data mahasiswa
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object{
        @Volatile // memastikan nilai variabel instance selalu sama di semua thread
        private var instance: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase{
            return (instance ?: synchronized(this){
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java,
                    "KrsDatabase"
                )
                    .build().also { instance= it }
            })
        }

    }
}
