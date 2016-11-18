package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
		AnswerEntity an3 = new AnswerEntity();
		int ab1 = 5; 
        assertFalse(an1.equals(an2));
		assertTrue(an1.equals(an3));
		assertTrue(an1.equals(an1));
		assertFalse(an1.equals(ab1));
		an1.setAnswerText("abc");
		assertFalse(an1.equals(an3));
		an1.setAnswerText(null);
		an3.setAnswerText("cba");
		assertFalse(an1.equals(an3));
		an1.setAnswerText("cos");
		assertFalse(an1.equals(an3));
		an1.setAnswerText("cba");
		assertTrue(an1.equals(an3));
		long liczba=5;
		long liczba2=9;
		an1.setId(liczba);
		an3.setId(liczba2);
		assertFalse(an1.equals(an3));
		an1.setId(null);
		assertFalse(an1.equals(an3));
		an1.setId(liczba);
		liczba2=5;
		an3.setId(liczba2);
		assertTrue(an1.equals(an3));
		QuestionEntity q1 = new QuestionEntity();
		an1.setQuestion(q1);
		assertFalse(an1.equals(an3));
		an1.setQuestion(null);
		QuestionEntity q2 = new QuestionEntity();
		an3.setQuestion(q2);
		assertFalse(an1.equals(an3));
		an1.setQuestion(q2);
		assertTrue(an1.equals(an3));
		
	
		
		
		
		
		

		
		
    }
    
}