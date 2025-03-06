package fptu.sep490.sample.repository;

import fptu.sep490.sample.model.Product;
import jakarta.persistence.LockModeType;
import jakarta.persistence.QueryHint;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import java.util.List;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, String> {


    Optional<Product> findById(String id);

    @NonNull
    List<Product> findAll();

}
