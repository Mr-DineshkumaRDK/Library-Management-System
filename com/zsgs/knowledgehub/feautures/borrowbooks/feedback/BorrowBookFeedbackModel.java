package com.zsgs.knowledgehub.feautures.borrowbooks.feedback;

public class BorrowBookFeedbackModel {
   private final BorrowBookFeedbackView view;

   public BorrowBookFeedbackModel(BorrowBookFeedbackView bookFeedbackView){
       view=bookFeedbackView;
   }
    public  void init(){
       // view.init();
        System.out.println("feedbackmodel :"+view);

    }
}
