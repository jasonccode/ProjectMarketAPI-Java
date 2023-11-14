package com.market.projectmarket.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {
    @Column(name = "Id_comora")
    private Integer idCompra;
    @Column(name = "id_producto")
    private Integer idProducto;

}
