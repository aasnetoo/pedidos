package com.yourfoodAPI.pedidos.service;

import com.yourfoodAPI.pedidos.dto.ItemDTO;
import com.yourfoodAPI.pedidos.dto.PedidoRequest;
import com.yourfoodAPI.pedidos.dto.PedidoResponse;
import com.yourfoodAPI.pedidos.model.Pedido;
import com.yourfoodAPI.pedidos.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository repository;

    public Mono<PedidoResponse> salvar(PedidoRequest pedidoDTO) {
        String uid = UUID.randomUUID().toString();
        Pedido order = Pedido.builder()
                .id(UUID.randomUUID().toString())
                .itens(pedidoDTO.itens())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .status(Pedido.Status.CONFIRMADO)
                .valor()
                .userId(pedidoDTO.getUserId())
                .build();
    }
    public Mono<Pedido> findById(String id){
        return repository.findById(id);

    }



}
