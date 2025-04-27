
public class Main {
    public static void main(String[] args) {
        //  String mes [] = new String[12];
        String mes[] = {"jan", "fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dec"};
        int pos[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0; i <= mes.length -1 ; i++) {

            System.out.println("O mes de " + mes[i]+ " tem "+ pos[i]+" Dias");
        }
    }
}