package com.gabodev.calculator;

import com.gabodev.calculator.applications.CalculatorApplication;
import com.gabodev.calculator.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class CalculatorRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CalculatorApplication calculatorApplication = context.getBean(CalculatorApplication.class);
		calculatorApplication.run();

	}
}
