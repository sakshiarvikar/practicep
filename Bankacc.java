class Bank {
    public static void main(String[] args) {
      BankAcc acc1 = new BankAcc();
      acc1.iniii(123,"sakshi",60000);
      acc1.dis();
        
    }
}

class BankAcc{
    long accno;
    String acch;
    double accb;
    
    void iniii(long accno,String acch,double accb){
        this.accno = accno;
        this.acch  = acch;
        this.accb  = accb;
    }
    void dis(){
        System.out.println("accno\t:"+accno);
        System.out.println("acch\t:"+acch);
        System.out.println("accb\t:"+accb);
    }
}    