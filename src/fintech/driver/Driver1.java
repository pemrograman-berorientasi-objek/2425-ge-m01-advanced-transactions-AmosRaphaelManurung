package fintech.driver;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import fintech.model.Account;
import fintech.model.Transaction;

/**
 * @author 12S23011 Mabel Christoffel A.S
 * @author 12S23027 Amos Manurung
 */
public class Driver1 {

    public static void main(String[] _args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<>();
    HashMap<Transaction> transactions = new HashMap<>();
    ArrayList<Show> shows = new ArrayList<>();
    int a = 0;
    
    while(true){
        String input = sc.nextLine();
        if(input.equals("---")){
            break;
        }
        String[] parts = input.split("#");
        switch (parts[0]){
            case "create-account":
                Account account = new accounts(parts[1], parts[2]);
                break;
            case "create-transaction":
                a++;
                for(int i = 0; i < account.size(); i++){
                    for(Account account : accounts){
                        if(parts[1] = account.accountname){
                            if(account.balance[i] - parts[2] < 0.0){
                                break;
                            }
                        } else {
                            Transaction transaction = new transactions(a, parts[1], parts[2], parts[3], parts[4]);
                            break;
                        }
                    }
                }
            case "show-account":
                for(int i = 0; i < account.size(); i++){
                    Show show = new shows(account.toString());
                    for(int j = 0; j < transaction.size(); i++){
                        if(transaction.accountName[j] = account.accountname[j]);
                        Show show = new shows(transaction.toString());
                    }
                }
                break;
        }
        for(Account account : accounts){
            System.out.println(account.toString());
        }
        for(Show show : shows){
            System.out.println(shows);
        }

        
        
    } 
    sc.close();
    }
}

