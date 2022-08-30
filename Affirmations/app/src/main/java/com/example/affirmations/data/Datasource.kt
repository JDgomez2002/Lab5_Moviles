package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, "https://github.com/JDgomez2002/Lab5_Moviles/blob/main/Images_Garage/Lamborghini%20Aventador%20LP700.jpg?raw=true"),
            Affirmation(R.string.affirmation2, "https://github.com/JDgomez2002/Lab5_Moviles/blob/main/Images_Garage/BMW%20Serie%208.png?raw=true"),
            Affirmation(R.string.affirmation3, "https://github.com/JDgomez2002/Lab5_Moviles/blob/main/Images_Garage/CX5.png?raw=true"),
            Affirmation(R.string.affirmation4, "https://github.com/JDgomez2002/Lab5_Moviles/blob/main/Images_Garage/Camaro.jpg?raw=true"),
            Affirmation(R.string.affirmation5, "https://github.com/JDgomez2002/Lab5_Moviles/blob/main/Images_Garage/Ferrari488GTB.jpg?raw=true"),
            Affirmation(R.string.affirmation6, "https://github.com/JDgomez2002/Lab5_Moviles/blob/main/Images_Garage/Jeep%20Wrangler%20JL.png?raw=true"),
            Affirmation(R.string.affirmation7, "https://github.com/JDgomez2002/Lab5_Moviles/blob/main/Images_Garage/Land%20Rover%20Discovery.jpg?raw=true"),
            Affirmation(R.string.affirmation8, "https://github.com/JDgomez2002/Lab5_Moviles/blob/main/Images_Garage/Porsche%20Taycan.png?raw=true"),
            Affirmation(R.string.affirmation9, "https://github.com/JDgomez2002/Lab5_Moviles/blob/main/Images_Garage/Aston%20Martin%20DB5%201964.jpg?raw=true"),
            Affirmation(R.string.affirmation10, "https://github.com/JDgomez2002/Lab5_Moviles/blob/main/Images_Garage/Volvo%20XC90.png?raw=true")

        )
    }
}