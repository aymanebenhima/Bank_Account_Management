import proxy.*;

public class App {
    public static void main(String[] args) {
        ReleveService stub=new Releve_Service().getReleveServicePort();
        Releve releve=stub.consulterReleve();
        System.out.println("Releve Bancaire Du : "+releve.getDateReleve());
        System.out.println("*********************************************");
        System.out.println("RIB : "+releve.getRib());
        System.out.println("Solde : "+releve.getSolde());
        System.out.println("++++++++++Operations++++++++++++ ");
        for (Operation op: releve.getOperations().getOperation()){
            System.out.println("Operation : ");
            System.out.println(op.getType());
            System.out.println("Le "+op.getDate());
            System.out.println("Montant: "+op.getMontant());
            System.out.println("Motif: "+op.getDescription());
            System.out.println("--------------------------------------");
        }

    }
}
