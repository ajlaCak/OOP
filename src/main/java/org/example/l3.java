package org.example;

import java.util.Locale;

interface textformater {
    public String format(String text);
}
 class toupper implements textformater{
    @Override
    public String format(String text){
        return text.toUpperCase();
    }
}
class tolower implements textformater{
    @Override
    public String format(String text){
        return text.toLowerCase();
    }
}
class camel implements textformater{
    String sve="";
    @Override
    public String format(String text){
        String[] s=text.split("\\s");

        for(int i=0;i<s.length;i++){
            if(i==0){sve=sve+s[i].toLowerCase();}
            else{sve=sve+(s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase());}
        }return sve;
    }
}
 class TextEditor {
    private textformater textFormatter;

    public void setFormatter(textformater textFormatter) {
        this.textFormatter = textFormatter;
    }

    public String formatText(String text) {
        if (textFormatter == null) {
            throw new IllegalStateException("Text formatter not set");
        }
        return textFormatter.format(text);
    }
}
