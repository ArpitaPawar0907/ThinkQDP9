package com.containtment;

public class InstituteTest {

	public static void main(String[] args) {
		
		Question q1=new Question(1,"what is oops?");
		Question q2=new Question(2,"how for loop define");
		
		SubTopic st1=new SubTopic(9,"Pillars",q1);
		SubTopic st2=new SubTopic(8,"ForLoop",q2);
		
		Topic t1=new Topic(43,"OOPs",st1);
		Topic t2=new Topic(44,"Loop",st2);
		
		Subject sub1=new Subject(301,"Java",t1);
		Subject sub2=new Subject(302,"SQL",t2);
		
		Branch b1=new Branch(21,"Developer",sub1);
		Branch b2=new Branch(22,"Tester",sub2);
		
		Institute inst1=new Institute(1,"ThinkQuestiont",b1);
		
		
		System.out.println(inst1);
		
		
		

	}

}
