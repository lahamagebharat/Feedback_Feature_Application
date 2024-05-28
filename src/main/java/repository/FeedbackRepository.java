package repository;

import entity.FeedbackEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
//import org.openapitools.model.Feedback;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FeedbackRepository implements PanacheRepository<FeedbackEntity> {
    // Custom query methods can be added here if needed
}