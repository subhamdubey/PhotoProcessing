package io.subham.photoprocessing

import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.photo)

        val photoProcessing = findViewById<Button>(R.id.photo_processing)
        val imageView = findViewById<ImageView>(R.id.image_view)
        photoProcessing.setOnClickListener {
            val filteredPhoto = PhotoProcessing.filterPhoto(bitmap, 5, false)
            imageView.setImageBitmap(filteredPhoto)
        }
    }
}