package RelacionadosAsEmpresas;

import java.util.Date;

public class pedido {
    private Integer id;
    private Date momento;
    private statusDoPedido status;

    public pedido(Integer id, Date momento, statusDoPedido status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public statusDoPedido getStatus() {
        return status;
    }

    public void setStatus(statusDoPedido status) {
        this.status = status;
    }
    public String toString() {
        return "pedido [id = " + id + ", momento = " + momento + ", status = " + status + "]";
    } 
}
