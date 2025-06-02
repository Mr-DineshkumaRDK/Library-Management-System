package com.zsgs.knowledgehub.feautures.borrowbooks.fine;

public class BorrowBookView {
    private  final  BorrowBookModel model;

    public BorrowBookView(){
        model=new BorrowBookModel(this);
    }
    public  void init(){
        model.init();
        System.out.println("fineview :"+model);

    }
}
