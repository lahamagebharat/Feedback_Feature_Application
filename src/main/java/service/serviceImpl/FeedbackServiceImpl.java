package service.serviceImpl;

import com.feedback.api.model.Feedback;
import entity.FeedbackEntity;
//import entity.FeedbackInput;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import mapper.FeedbackMapper;
import repository.FeedbackRepository;
import service.FeedbackService;

import java.util.List;

@ApplicationScoped
public class FeedbackServiceImpl implements FeedbackService {

    @Inject
    FeedbackRepository feedbackRepository;

    @Inject
    FeedbackMapper mapper;

    @Override
    public List<FeedbackEntity> getAllFeedback() {
        return feedbackRepository.listAll();
    }

    @Override
    public Feedback getFeedbackById(Long id) {
         return mapper.feedbackEntityToFeedback(feedbackRepository.findById(id));
    }

    @Override
    @Transactional
    public Feedback storeFeedback(Feedback feedback) {
        FeedbackEntity entity = mapper.feedbackEntityToFeedback(feedback);
        feedbackRepository.persist(entity);
        return getFeedbackById(Long.valueOf(entity.getId()));
    }

//    @Override
//    @Transactional
//    public FeedbackEntity updateFeedbackById(Long id, FeedbackEntity feedback) {
//        FeedbackEntity existingFeedback = feedbackRepository.findById(id);
//        if (existingFeedback != null) {
//            existingFeedback.setContent(feedback.getContent());
//            existingFeedback.setUser(feedback.getUser());
//            feedbackRepository.persist(existingFeedback);
//        }
//        return existingFeedback;
//    }
}
