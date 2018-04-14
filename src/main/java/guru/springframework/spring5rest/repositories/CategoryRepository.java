package guru.springframework.spring5rest.repositories;

import guru.springframework.spring5rest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}