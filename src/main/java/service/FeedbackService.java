package service;

import com.feedback.api.model.Feedback;
import entity.FeedbackEntity;
//import entity.FeedbackInput;

import java.util.List;

public interface FeedbackService {
    List<FeedbackEntity> getAllFeedback();
    Feedback getFeedbackById(Long id);
    Feedback storeFeedback(Feedback feedback);
//    FeedbackEntity updateFeedbackById(Long id, FeedbackEntity feedback);
}

