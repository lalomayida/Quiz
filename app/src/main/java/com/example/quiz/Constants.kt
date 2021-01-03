package com.example.quiz

object Constants {

    //Constant Variables
    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>();
        val q1 = Question(1,
        "¿Donde es el paisaje de la foto?",
        R.drawable.image1,
        "Anahuac",
        "Ibero",
        "Amazcala",
        "Zibatá",
        1
        );
        val q2 = Question(2,
            "¿Donde es el paisaje de la foto?",
            R.drawable.image2,
            "Italia",
            "Francia",
            "Alemania",
            "Pakistan",
            1
        );
        val q3 = Question(3,
            "¿Donde es el paisaje de la foto?",
            R.drawable.image3,
            "Italia",
            "Francia",
            "Japón",
            "Corea",
            1
        );
        val q4 = Question(4,
            "¿Donde es el paisaje de la foto?",
            R.drawable.image4,
            "California",
            "Inglaterra",
            "Cancún",
            "Florida",
            1
        );
        val q5 = Question(5,
            "¿Donde es el paisaje de la foto?",
            R.drawable.image5,
            "Anahuac",
            "Ibero",
            "Amazcala",
            "Zibatá",
            1
        );
        val q6 = Question(6,
            "¿Donde es el paisaje de la foto?",
            R.drawable.image6,
            "Anahuac",
            "Ibero",
            "Amazcala",
            "Zibatá",
            1
        );
        val q7 = Question(7,
            "¿Donde es el paisaje de la foto?",
            R.drawable.image7,
            "Anahuac",
            "Ibero",
            "Amazcala",
            "Zibatá",
            1
        );

        questionList.add(q1)
        questionList.add(q2)
        questionList.add(q3)
        questionList.add(q4)
        questionList.add(q5)
        questionList.add(q6)
        questionList.add(q7)
        return questionList
    }
}