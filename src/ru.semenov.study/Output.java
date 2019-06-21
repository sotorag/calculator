package ru.semenov.study;

abstract class Output{
    private String output="";
    protected int answer;
    protected String[] flag=new String[2];
    public String output()
    {

        if(flag[0]=="Arabic")
            output=output+answer;
        else
        {
            if(answer==100)
                return output=output+"C";
            if(answer>89) {
                output = output + "XC";
                answer = answer - 90;
            }
            if(answer>49){
                output = output + "L";
                answer = answer - 50;
            }
            if(answer>39){
                output = output + "XL";
                answer = answer - 40;
            }
            while (answer>9) {
                output = output + "X";
                answer = answer - 10;
            }
            if(answer==9)
                return output = output+"IX";
            if(answer>4){
                output = output + "V";
                answer = answer - 5;
            }
            if(answer==4)
                return output = output+"IV";
            while (answer>0) {
                output = output + "I";
                answer = answer - 1;
            }
        }
        return output;
    }
}
