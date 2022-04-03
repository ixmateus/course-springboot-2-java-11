package br.com.mateus.course.repositories;

import br.com.mateus.course.entities.OrderItem;
import br.com.mateus.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
