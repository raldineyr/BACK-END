package JPA.modelo.umpramuitos;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import JPA.modelo.Produto;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Integer quantidade;

	@Column(nullable = false)
	private Double preco;
	
	// Por padrão o facth de uma relação to one é EAGER
	@ManyToOne(fetch = FetchType.EAGER)
	private Produto produto;

	@ManyToOne
	private Pedido pedido;

	public ItemPedido() {

	}

	public ItemPedido(Integer quantidade, Produto produto, Pedido pedido) {
		super();
		this.setQuantidade(quantidade);
		this.setProduto(produto);
		this.setPedido(pedido);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;

		if (produto != null && this.preco == null) {
			this.setPreco(produto.getPreco());
		}
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
