package ru.semenov.study;

abstract class Obrabotka extends Vuvod
{
    protected String[] line=new String[2];
    private int a=0;
    private int b=0;
    public String[] Num={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    public void obrabotka() throws EnterException {
        for (int i = 0; i < 10; i++) {
            if(Num[i].equals(line[0]))
            {
                a = i+1;
                super.flag[0] = "Roman";
            }
        }
        if (a != 0) {
            for (int j = 0; j < 10; j++) {
                if (line[1].equals(Num[j])) {
                    b = j + 1;
                    super.flag[1] = "Roman";
                }

            }
            if (b==0)
            {
                throw new EnterException("Please enter only Roman numbers or only Arabic numbers for calculate");
            }
        } else {

            if (0 < Integer.parseInt(line[0]) && Integer.parseInt(line[0]) < 11) {
                a = Integer.parseInt(line[0]);
                super.flag[0] = "Arabic";
                if (0 < Integer.parseInt(line[1]) && Integer.parseInt(line[1]) < 11) {
                    b = Integer.parseInt(line[1]);
                    super.flag[1] = "Arabic";
                } else {
                    throw new EnterException("Please enter b from 1 to 10");
                }
            }
                else{
                throw new EnterException("Please enter a from 1 to 10");
                }
                //исключение
            }
        }

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}
