package com.example.affirmations.data
//import com.squareup.picasso
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, "https://prod.pictures.autoscout24.net/listing-images/1d335626-5a6f-4844-8ca4-1a563f7e4443_1fb8134f-33ff-438b-b9ff-a0cf77f4ea93.jpg/1920x1080.webp"),
            //Affirmation(R.string.affirmation2, R.drawable.image2),
            //Affirmation(R.string.affirmation3, R.drawable.image3),
            //Affirmation(R.string.affirmation4, R.drawable.image4),
            //Affirmation(R.string.affirmation5, R.drawable.image5),
            //Affirmation(R.string.affirmation6, R.drawable.image6),
            //Affirmation(R.string.affirmation7, R.drawable.image7),
            //Affirmation(R.string.affirmation8, R.drawable.image8),
            //Affirmation(R.string.affirmation9, R.drawable.image9),
            //Affirmation(R.string.affirmation10, R.drawable.image10)

        )
    }
}