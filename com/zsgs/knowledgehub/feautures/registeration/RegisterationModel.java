package com.zsgs.knowledgehub.feautures.registeration;

import com.zsgs.knowledgehub.data.dto.Register;

class RegisterationModel {

   private final   RegisterationView view;
    public      RegisterationModel(RegisterationView registerationView){
            view=registerationView;
        }

    public void init() {
        if (false /*AlreadyRegistered*/) {
            // Future logic
        } else {
            view.proceedRegistration();
        }
    }

    public void registerUser(Register info) {
        if (alreadyUser(info.getUserName())) {
            view.alreadyUser("Username already exists.");
        } else if (isWeakPassword(info.getPassword())) {
            view.isWeakPassword("It is a weak password. Please try again.");
        } else {
            System.out.println("Registration successful for user: " + info.getUserName());
        }
    }

    private boolean alreadyUser(String userName) {
        // Replace with actual check
        return false;
    }

    private boolean isWeakPassword(String password) {
        // Replace with actual password strength check
        return false;
    }
}
