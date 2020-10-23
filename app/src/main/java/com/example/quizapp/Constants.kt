package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "vad är det här för skylt?",
            R.drawable.motesplats,
            "Mötesplats", "väjningsplikt",
            "förbjudet område", "landsväg", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "vad är det här för skylt?",
            R.drawable.stoppskylt,
            "Angola", "Austria",
            "stoppskylt", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "vad är det här för skylt?",
            R.drawable.hufvudled,
            "Belarus", "Belize",
            "Brunei", "huvudled", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "vad är det här för skylt?",
            R.drawable.slirigvag,
            "Bahamas", "varning för slirig väg",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "vad är det här för skylt?",
            R.drawable.pabjudenkorbana,
            "Gabon", "France",
            "Fiji", "påbjuden körbana", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "vad är det här för skylt?",
            R.drawable.slalom,
            "förbud mot omkörning", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "vad är det här för skylt?",
            R.drawable.vajn,
            "Dominica", "Egypt",
            "väjningsplikt", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "vad är det här för skylt?",
            R.drawable.witch,
            "Ireland", "Iran",
            "Hungary", "förbud mot häxor", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "vad är det här för skylt?",
            R.drawable.motorvagskylt,
            "Australia", "motorväg",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "vad är det här för skylt?",
            R.drawable.vajningmot,
            "väjningsplikt mot mötande fordon", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)

        return questionsList
    }

}
