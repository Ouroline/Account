/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author lucif
 */
public class Account {
    private String id;
    private String name;
    private int balance;
    private int credit;
    private int debit;
    private int transfer;

    public Account(String id, String name, int balance, int credit, int debit, int transfer) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.credit = credit;
        this.debit = debit;
        this.transfer = transfer;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getCredit() {
        return credit;
    }

    public int getDebit() {
        return debit;
    }

    public int getTransfer() {
        return transfer;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public void setTransfer(int transfer) {
        this.transfer = transfer;
    }

    public Account() {
    }
    
    
}
