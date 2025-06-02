package com.zsgs.knowledgehub.feautures.borrowbooks.fine;

public class BorrowBookModel {
    private final BorrowBookView view;

    public BorrowBookModel(BorrowBookView view){
        this.view=view;
    }

    public  void init(){
     //   view.init();
        System.out.println("bookmodel:"+view);

    }

}
