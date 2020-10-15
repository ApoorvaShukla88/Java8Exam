package com.dtcc.exams.part1;

public class DelTechConcatenator {
    private int input;


    public DelTechConcatenator(Integer input){
        this.input = input;

    }
    public boolean isDel(){
        if(input % 3 == 0){ return true;}
        return false;
    }
    public boolean isTech(){
        if(input % 5 == 0){ return true;}
        return false;
    }
    public boolean isDelTech(){
        if(input % 3 == 0 && input % 5 == 0){
             return true;}
            return false;
    }
}
