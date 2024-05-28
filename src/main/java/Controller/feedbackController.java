package Controller;

import com.feedback.api.controller.FeedbackApi;
import com.feedback.api.model.Feedback;
//import com.feedback.api.model.FeedbackInput;
import entity.FeedbackEntity;
//import entity.FeedbackInput;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import service.FeedbackService;

import java.util.List;

public class feedbackController implements FeedbackApi{


    @Inject
    FeedbackService feedbackService;

    public Response getAllFeedback(){
    List<FeedbackEntity> feedbacks = feedbackService.getAllFeedback();
    return Response.ok().entity(feedbacks).build();

}

    @Override
    public Response getFeedbackById(Integer id) {

        if (id == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok().entity(feedbackService.getFeedbackById(Long.valueOf(id))).build();
    }

    @Override
    @Transactional
    public Response storeFeedback(Feedback feedback) {
        if (feedback == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok().entity(feedbackService.storeFeedback(feedback)).build();
    }

    @Override
    public Response updateFeedbackById(Integer id, Feedback feedback) {
        return null;
    }

//    @Override
//    public Response updateFeedbackById(Integer id, FeedbackInput feedbackInput) {
//        return null;
//    }



}
