package edu.miu.e_mart.service.definition;

import edu.miu.e_mart.domain.AnOrder;

import java.util.List;

public interface IOrderService {
    public AnOrder saveOrder(AnOrder anOrder);
    public AnOrder findOrderById(Integer id);
    public List<AnOrder> findAllOrder();
    public void updateOrderById(Integer id);
    public void deleteOrderById(Integer id);

}
