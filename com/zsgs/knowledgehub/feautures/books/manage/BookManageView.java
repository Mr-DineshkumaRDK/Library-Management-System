package com.zsgs.knowledgehub.feautures.books.manage;

public class BookManageView {
    private final BookManageModel model;

    public BookManageView(){
        model=new BookManageModel(this);
    }
    public  void init(){
        model.init();
        System.out.println("manageview :"+model);

    }
}
