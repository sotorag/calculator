package com.company;

public class Vvod extends Calculate{
    private String textLine;
    public Vvod(String textLine)
    {
        this.textLine=textLine;
    }

    public String getTextLine() {
        return textLine;
    }



    public int vvod() throws EnterException
    {
        if (textLine.contains("+")) {
            super.line = textLine.split("\\+", 2);
            return sum();
 //           return 0;
        }
        else {
            if (textLine.contains("-")) {
                super.line = textLine.split("-", 2);
                return subtraction();
            }
            else {
                if (textLine.contains("*")) {
                    super.line = textLine.split("\\*", 2);
                    return multiplication();
                }
                else
                {
                    if (textLine.contains("/")) {
                        super.line = textLine.split("/", 2);
                        return division();
                    }
                    else
                        //исключение
                        throw new EnterException("Please enter a+b or a-b or a*b or a/b");
                }
            }
        }
    }


}
