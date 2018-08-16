package app.project.gamestart.repositories;

import app.project.gamestart.domain.entities.Book;
import app.project.gamestart.domain.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,String> {
    List<Review> getAllByBook(Book book);
}
