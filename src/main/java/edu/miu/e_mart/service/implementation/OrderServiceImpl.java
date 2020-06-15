package edu.miu.e_mart.service.implementation;


import edu.miu.e_mart.domain.AnOrder;
import edu.miu.e_mart.service.definition.IOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Override
    public AnOrder saveOrder(AnOrder anOrder) {
        return null;
    }

    @Override
    public AnOrder findOrderById(Integer id) {
        return null;
    }

    @Override
    public List<AnOrder> findAllOrder() {
        return null;
    }

    @Override
    public void updateOrderById(Integer id) {

    }

    @Override
    public void deleteOrderById(Integer id) {

    }
}
