package com.design_shinbi.quiz.test;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.design_shinbi.quiz.Question;

class QuizTest {

    /*@Test
    void test() {
        String line =  "ドラえもんの誕生日は？,9月3日,8月2日,7月1日,10月4日";
        
        Question question = new Question();
        question.readLine(line);
        question.display();
    }*/
    
    @Test
    void testResource() throws IOException{
        List<Question> questions = Question.getQuestions();
        for(Question question : questions) {
            question.display();
        }
    }

}
