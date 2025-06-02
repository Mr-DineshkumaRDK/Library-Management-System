package com.zsgs.knowledgehub.feautures.librarysetup;

public class LibrarySetupView {

    private final  LibrarySetupModel model;

      public LibrarySetupView()
      {
          model=new LibrarySetupModel(this);
      }

    public  void init(){
        model.init();
        System.out.println("setupview :"+model);

    }
}
