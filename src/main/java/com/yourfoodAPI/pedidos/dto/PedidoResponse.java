package com.yourfoodAPI.pedidos.dto;

import com.yourfoodAPI.pedidos.model.Pedido;

import java.util.List;

public record
PedidoResponse(String id, List<ItemDTO> itens, Pedido.Status status) {
}
