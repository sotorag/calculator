package com.company;

abstract class Vuvod{
    private String vuvod="";
    protected int answer;
    protected String[] flag=new String[2];
    public String vuvod()
    {

        if(flag[0]=="Arabic")
            vuvod=vuvod+answer;
        else
        {
            if(answer==100)
                return vuvod=vuvod+"C";
            if(answer>89) {
                vuvod = vuvod + "XC";
                answer = answer - 90;
            }
            if(answer>49){
                vuvod = vuvod + "L";
                answer = answer - 50;
            }
            if(answer>39){
                vuvod = vuvod + "XL";
                answer = answer - 40;
            }
            while (answer>9) {
                vuvod = vuvod + "X";
                answer = answer - 10;
            }
            if(answer==9)
                return vuvod = vuvod+"IX";
            if(answer>4){
                vuvod = vuvod + "V";
                answer = answer - 5;
            }
            if(answer==4)
                return vuvod = vuvod+"IV";
            while (answer>0) {
                vuvod = vuvod + "I";
                answer = answer - 1;
            }
        }
        return vuvod;
    }
}
