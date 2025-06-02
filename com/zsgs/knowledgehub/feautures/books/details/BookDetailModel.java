package com.zsgs.knowledgehub.feautures.books.details;

public class BookDetailModel {
    private final BookDetailView view;

    public BookDetailModel(BookDetailView bookDetailView){
        view=bookDetailView;
    }
    public  void init(){
        view.init();
        System.out.println("detailmodel :"+view);

    }
}
