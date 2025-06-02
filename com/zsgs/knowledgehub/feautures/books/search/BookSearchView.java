package com.zsgs.knowledgehub.feautures.books.search;

public class BookSearchView {

    private final BookSearchModel model;

    public BookSearchView(){

        model= new BookSearchModel(this);
    }
    public  void init(){
        model.init();
        System.out.println("searchview :"+model);

    }
}
