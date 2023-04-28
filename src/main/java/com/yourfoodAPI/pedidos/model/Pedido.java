package com.yourfoodAPI.pedidos.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "pedidos")
@Builder
public class Pedido {

    @Id
    private String id;
    private List<Item> itens;
    private LocalDateTime dataCriacao;
    private Status status;
    private BigDecimal valor;
    public String userId;


    public static record Item(String idProduto, int quantidade){

    }
    public  enum Status{
        CONFIRMADO, REALIZADO
    }

}
