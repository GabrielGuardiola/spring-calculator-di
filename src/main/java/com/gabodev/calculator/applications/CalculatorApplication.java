package com.gabodev.calculator.applications;

import com.gabodev.calculator.services.IOperationService;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CalculatorApplication {

    private final IOperationService operationService;
    public final Scanner reader;

    public CalculatorApplication(IOperationService operationService){
        this.operationService = operationService;
        this.reader = new Scanner(System.in);

    }

    public void run() {
        boolean isRunning = true;
        
        while(isRunning) {
            System.out.println("Bienvenido a la calculadora, selecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Selecciona una operación: ");
            int opt = reader.nextInt();
            if(opt == 5){
                System.out.println("Programa terminado!");
                isRunning = false;
                break;
            }
            System.out.println("Introduce el primer operando:");
            Integer a = reader.nextInt();
            System.out.println("Introduce el segundo operando:");
            Integer b = reader.nextInt();

            switch(opt){
                case 1:
                    Integer sum = this.add(a,b);
                    System.out.println("Suma: " + sum);
                    break;
                case 2:
                    Integer sub = this.sub(a,b);
                    System.out.println("Resta: " + sub);
                    break;
                case 3:
                    Integer mul = this.multiply(a,b);
                    System.out.println("Multiplicación: " + mul);
                    break;
                case 4:
                    Integer div = this.divide(a,b);
                    System.out.println("División: " + div);
                    break;
            }

        }
    }

    public Integer multiply(Integer op1, Integer op2){return operationService.multiply(op1,op2);}
    public Integer add(Integer op1, Integer op2){return operationService.add(op1,op2);}
    public Integer sub(Integer op1, Integer op2){return operationService.sub(op1,op2);}
    public Integer divide(Integer op1, Integer op2){return operationService.divide(op1,op2);}
}
