package com.yourfoodAPI.pedidos.dto;

import java.util.List;

public record PedidoRequest(
        List<ItemDTO> itens) {
}   