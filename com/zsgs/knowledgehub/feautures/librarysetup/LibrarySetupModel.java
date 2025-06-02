package com.zsgs.knowledgehub.feautures.librarysetup;

 class LibrarySetupModel {

  private final   LibrarySetupView view;


     public LibrarySetupModel(LibrarySetupView view){

         this.view=view;

     }
     public  void init(){
     //    view.init();
         System.out.println("setupmodel :"+view);

     }

}
