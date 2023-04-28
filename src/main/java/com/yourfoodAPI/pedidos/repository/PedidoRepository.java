package com.yourfoodAPI.pedidos.repository;

import com.yourfoodAPI.pedidos.model.Pedido;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends ReactiveMongoRepository<Pedido,String> {
}
