package br.com.mateus.course.services;

import br.com.mateus.course.entities.Order;
import br.com.mateus.course.entities.User;
import br.com.mateus.course.repositories.OrderRepository;
import br.com.mateus.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById (Long id){
       Optional<Order> obj = repository.findById(id);
       return obj.get();
    }
}
