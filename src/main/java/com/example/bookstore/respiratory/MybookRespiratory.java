package com.example.bookstore.respiratory;


import com.example.bookstore.entity.Mybook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MybookRespiratory extends JpaRepository<Mybook , Long> {

}
