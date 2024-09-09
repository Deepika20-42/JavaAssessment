public class Receipt {
    private String from;
    private String to;
    private User user;
    private String seat;
    private double amount;

    public Receipt(String from, String to, User user, String seat, double amount) {
        this.from = from;
        this.to = to;
        this.user = user;
        this.seat = seat;
        this.amount = amount;
    }

    public String getUserEmail(){ 
        return user.getEmail();
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seatNo){
        this.seat = seatNo;
    }

    @Override
    public String toString() {
        return "From :"+from+" To:"+to+" Seat No :"+seat+" Amount:"+amount;
    }

    

    
    
    
}
