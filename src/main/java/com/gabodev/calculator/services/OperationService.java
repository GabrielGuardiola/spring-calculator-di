package com.gabodev.calculator.services;
import org.springframework.stereotype.Service;
@Service
public class OperationService implements IOperationService {

    @Override
    public Integer multiply(Integer op1, Integer op2) {
        return op1*op2;
    }

    @Override
    public Integer add(Integer op1, Integer op2) {
        return op1+op2;
    }

    @Override
    public Integer divide(Integer op1, Integer op2) {
        try {
            return op1/op2;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    @Override
    public Integer sub(Integer op1, Integer op2) {
        return op1-op2;
    }
}
