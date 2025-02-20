package cn.cn.DTOs;

public class cardInfo {
    private String cardnumber = "";
    private String amount;
    private String date;
    
    public String getCardNumber() {
        return cardnumber;
    }
    public void setCardNumber(String cardnumber){
        this.cardnumber = cardnumber;
    }
    public void setAmount(String amount){
        this.amount = amount;
    }
    public String getAmount(){
        return amount;
    }
    public void setDate(String Date){
        this.date = Date;
    }
    public String getDate(){
        return date;
    }
}
