package ru.semenov.study;

abstract class Calculate extends Proc{
    protected int sum() throws EnterException{
        proc();
        return super.answer=getA()+getB();
    }

    protected int multiplication() throws EnterException{
        proc();
        return super.answer=getA()*getB();
    }

    protected int subtraction() throws EnterException{
        proc();
        return super.answer=getA()-getB();
    }

    protected int division() throws EnterException{
        proc();
        if (super.flag[0]=="Roman" && getA()<getB()) {
            throw new EnterException("For Roman numbers to division must a>b ");
        }
        return super.answer=getA()/getB();
    }
}
