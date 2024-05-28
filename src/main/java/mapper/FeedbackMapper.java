package mapper;

import com.fasterxml.jackson.databind.DatabindException;
import com.feedback.api.model.Feedback;
import entity.FeedbackEntity;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;

@ApplicationScoped
public class FeedbackMapper {

    public Feedback feedbackEntityToFeedback(FeedbackEntity entity){
        Feedback feedback=new Feedback();
        Optional.ofNullable(entity).ifPresent(
             e->{
                feedback.setId(e.getId());
                feedback.setRating(e.getRating());
                feedback.setComments(e.getComments());
                feedback.setSubmittedate(e.getSubmittedate());
                feedback.setCustomerId(e.getCustomerId());
             }
             );
        return feedback;
    }

    public FeedbackEntity feedbackEntityToFeedback(Feedback feedback){
        FeedbackEntity entity =new FeedbackEntity();
        Optional.of(feedback).ifPresent(
                e->{
                    entity.setId(e.getId());
                    entity.setRating(e.getRating());
                    entity.setComments(e.getComments());
                    entity.setSubmittedate(e.getSubmittedate());
                    entity.setCustomerId(e.getCustomerId());
                }
        );
        return entity;
    }
}
