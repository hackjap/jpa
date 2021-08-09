package exerjpa.jpashop.repository;


import exerjpa.jpashop.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(exerjpa.jpashop.domain.Order order) {
        em.persist(order);
    }

    public exerjpa.jpashop.domain.Order findOne(Long id) {
        return em.find(Order.class, id);
    }

  //  public List<Order> findAll(OrderSearch orderSearch) {


}
