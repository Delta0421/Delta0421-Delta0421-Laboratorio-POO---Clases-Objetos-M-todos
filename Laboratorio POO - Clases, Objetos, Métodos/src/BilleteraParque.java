public class BilleteraParque {
    private int tickets;
    private static boolean festivo = false;

    BilleteraParque(){
        int tickets = 0;
    }

    BilleteraParque(int tickets){
        this.tickets = tickets;
    }

    public int getTickets(){
        return tickets;
    }

    public static boolean getFestivo(){
        return festivo;
    }

    public void setTickets(int tickets){
        
        if(tickets >= 0){
            this.tickets = tickets;
            System.out.println("Tickets = " + tickets);
        }
        else{System.out.println("Ingrese valor adecuado");}
    }

    public static void setFestivo(){
        if(festivo == true){
        festivo = false;
        System.out.println("Ya no es un día festivo");
        }
        else{
            festivo = true;
            System.out.println("Ahora es un día festivo");
        }
    }

    public void agregarTickets(int aumento){
        if(aumento < 0){
            this.tickets =+ aumento;
        }
    }

    public boolean removerTickets(int menos){
        if(menos < 0 && tickets >= menos){
            this.tickets =- menos;
            return true;
        }
        else{
            return false;
            }
    }



}
