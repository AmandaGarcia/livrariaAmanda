/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import modelo.Livro;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "compralivro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compralivro.findAll", query = "SELECT c FROM Compralivro c"),
    @NamedQuery(name = "Compralivro.findById", query = "SELECT c FROM Compralivro c WHERE c.id = :id"),
    @NamedQuery(name = "Compralivro.findByCompra", query = "SELECT c FROM Compralivro c WHERE c.compra = :compra"),
    @NamedQuery(name = "Compralivro.findByLivro", query = "SELECT c FROM Compralivro c WHERE c.livro = :livro"),
    @NamedQuery(name = "Compralivro.findByQuantidade", query = "SELECT c FROM Compralivro c WHERE c.quantidade = :quantidade"),
    @NamedQuery(name = "Compralivro.findByValorunitario", query = "SELECT c FROM Compralivro c WHERE c.valorunitario = :valorunitario")})
public class Compralivro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "compra")
    private Integer compra;
    @Column(name = "livro")
    private Integer livro;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Basic(optional = false)
    @Column(name = "valorunitario")
    private float valorunitario;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Livro livro1;

    public Compralivro() {
    }

    public Compralivro(Integer id) {
        this.id = id;
    }

    public Compralivro(Integer id, float valorunitario) {
        this.id = id;
        this.valorunitario = valorunitario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompra() {
        return compra;
    }

    public void setCompra(Integer compra) {
        this.compra = compra;
    }

    public Integer getLivro() {
        return livro;
    }

    public void setLivro(Integer livro) {
        this.livro = livro;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(float valorunitario) {
        this.valorunitario = valorunitario;
    }

    public Livro getLivro1() {
        return livro1;
    }

    public void setLivro1(Livro livro1) {
        this.livro1 = livro1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compralivro)) {
            return false;
        }
        Compralivro other = (Compralivro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Compralivro[ id=" + id + " ]";
    }
    
}
