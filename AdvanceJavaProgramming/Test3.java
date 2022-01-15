package AdvanceJavaProgramming;

import java.io.*;
public class Test3{

  public static void main(String[] args) throws Exception {
    ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("clients.ser"));

    AccountRecordSerializable record;

    record = new AccountRecordSerializable(1, "firstName", "lastName", 0.1);
    output.writeObject(record);

    ObjectInputStream input = new ObjectInputStream(new FileInputStream("clients.ser"));
    record = (AccountRecordSerializable) input.readObject();

    System.out.printf("%-10d%-12s%-12s%10.2f\n", record.getAccount(), record.getFirstName(), record
        .getLastName(), record.getBalance());

    output.close();
  }
}

class AccountRecordSerializable implements Serializable {
  private int account;

  private String firstName;

  private String lastName;

  private double balance;

  public AccountRecordSerializable() {
    this(0, "", "", 0.0);
  }

  public AccountRecordSerializable(int acct, String first, String last, double bal) {
    setAccount(acct);
    setFirstName(first);
    setLastName(last);
    setBalance(bal);
  }

  public void setAccount(int acct) {
    account = acct;
  }

  public int getAccount() {
    return account;
  }

  public void setFirstName(String first) {
    firstName = first;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setLastName(String last) {
    lastName = last;
  }

  public String getLastName() {
    return lastName;
  }

  public void setBalance(double bal) {
    balance = bal;
  }

  public double getBalance() {
    return balance;
  }
}