package com.zsgs.knowledgehub.feautures.books.manage;



public class BookManageModel {
    private final BookManageView view;

    public BookManageModel(BookManageView view){
        this.view=view;
    }
    public  void init(){
        view.init();
        System.out.println("manademodel :"+view);

    }

}
