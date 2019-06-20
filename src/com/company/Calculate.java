package com.company;

abstract class Calculate extends Obrabotka{
    protected int sum() throws EnterException{
        obrabotka();
        return super.answer=getA()+getB();
    }

    protected int multiplication() throws EnterException{
        obrabotka();
        return super.answer=getA()*getB();
    }

    protected int subtraction() throws EnterException{
        obrabotka();
        return super.answer=getA()-getB();
    }

    protected int division() throws EnterException{
        obrabotka();
        if (super.flag[0]=="Roman" && getA()<getB()) {
            throw new EnterException("For Roman numbers to division must a>b ");
        }
        return super.answer=getA()/getB();
    }
}
