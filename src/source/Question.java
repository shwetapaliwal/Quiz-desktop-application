/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author shweta
 */
public class Question {
    private String Ques;
    private String Op1;
    private String Op2;
    private String Op3;
    private String Op4;
    private String CAnswer;
    private String sub;
    private String level;
    private int marks;
    

    public String getQues() {
        return Ques;
    }

    public void setQues(String Ques) {
        this.Ques = Ques;
    }

    public String getOp1() {
        return Op1;
    }

    public void setOp1(String Op1) {
        this.Op1 = Op1;
    }

    public String getOp2() {
        return Op2;
    }

    public void setOp2(String Op2) {
        this.Op2 = Op2;
    }

    public String getOp3() {
        return Op3;
    }

    public void setOp3(String Op3) {
        this.Op3 = Op3;
    }

    public String getOp4() {
        return Op4;
    }

    public void setOp4(String Op4) {
        this.Op4 = Op4;
    }

    public String getCAnswer() {
        return CAnswer;
    }

    public void setCAnswer(String CAnswer) {
        this.CAnswer = CAnswer;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    public int getmarks(){
        return marks;
    }
    
    public void setmarks(int marks){
        this.marks = marks;
    }
}
