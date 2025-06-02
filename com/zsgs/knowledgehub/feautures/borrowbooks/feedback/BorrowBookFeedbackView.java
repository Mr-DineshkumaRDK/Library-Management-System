package com.zsgs.knowledgehub.feautures.borrowbooks.feedback;

public class BorrowBookFeedbackView {
    private  final BorrowBookFeedbackModel model;

    public BorrowBookFeedbackView(){
        model=new BorrowBookFeedbackModel(this);
    }
    public  void init(){
        model.init();
        System.out.println("feedbackview :"+model);

    }
}
