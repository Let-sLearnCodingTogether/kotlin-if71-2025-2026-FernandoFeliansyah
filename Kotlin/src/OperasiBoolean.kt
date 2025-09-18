fun main() {
    val quizPoint = 500
    val finalExamPoint = 700

    val passQuiz = quizPoint > 80
    val passFinalExam = finalExamPoint > 90

    val pass = passQuiz && passFinalExam

    println("You : $pass")
}