package com.zsgs.knowledgehub.feautures.registeration;

import com.zsgs.knowledgehub.data.dto.Register;

import java.util.Scanner;

public class RegisterationView {
  private final  RegisterationModel  model;
      public   RegisterationView(){
                model=new RegisterationModel(this);
        }

        public  void init(){
          model.init();
          System.out.println("regview :"+model);

        }
    void proceedRegistration() {
        Scanner scanner = new Scanner(System.in);
        Register info = new Register();

        System.out.println("Welcome to Registration Page");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.print("Enter the First Name: ");
        info.setFirstName(scanner.nextLine());

        System.out.print("Enter the Last Name: ");
        info.setLastName(scanner.nextLine());

        System.out.print("Enter the Email: ");
        info.setEmailId(scanner.nextLine());

        System.out.print("Enter the Password: ");
        info.setPassword(scanner.nextLine());

        System.out.print("Enter the Confirm Password: ");
        info.setConfirmPassword(scanner.nextLine());

        System.out.print("Enter the Username: ");
        info.setUserName(scanner.nextLine());

        System.out.print("Enter the Mobile Number: ");
        info.setMobileNo(scanner.nextLine());

        model.registerUser(info);
    }

    public void alreadyUser(String message) {
        System.out.println(message);
        proceedRegistration();
    }

    public void isWeakPassword(String message) {
        System.out.println(message);
        proceedRegistration();
    }

}
