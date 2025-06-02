package com.zsgs.knowledgehub.feautures.books.details;

public class BookDetailView {
    private final BookDetailModel model;

    public BookDetailView(){
        model=new BookDetailModel(this);
    }
    public  void init(){
        model.init();
        System.out.println("detailview :"+model);

    }
}
