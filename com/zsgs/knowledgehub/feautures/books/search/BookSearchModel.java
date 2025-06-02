package com.zsgs.knowledgehub.feautures.books.search;

public class BookSearchModel {
    private final BookSearchView view;

    public BookSearchModel(BookSearchView bookSearchView){

        view=bookSearchView;
    }
    public  void init(){
        view.init();
        System.out.println("searchmodel :"+view);

    }
}
