package ru.semenov.study;

public class Input extends Calculate{
    private String textLine;
    public Input(String textLine)
    {
        this.textLine=textLine;
    }

    public String getTextLine() {
        return textLine;
    }



    public int input() throws EnterException
    {
        if (textLine.contains("+")) {
            super.line = textLine.split("\\+", 2);
            return sum();
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
