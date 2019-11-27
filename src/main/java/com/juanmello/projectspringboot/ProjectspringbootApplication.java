package com.juanmello.projectspringboot;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juanmello.projectspringboot.domain.Categoria;
import com.juanmello.projectspringboot.domain.Cidade;
import com.juanmello.projectspringboot.domain.Cliente;
import com.juanmello.projectspringboot.domain.Endereco;
import com.juanmello.projectspringboot.domain.Estado;
import com.juanmello.projectspringboot.domain.ItemPedido;
import com.juanmello.projectspringboot.domain.Pagamento;
import com.juanmello.projectspringboot.domain.PagamentoComBoleto;
import com.juanmello.projectspringboot.domain.PagamentoComCartao;
import com.juanmello.projectspringboot.domain.Pedido;
import com.juanmello.projectspringboot.domain.Produto;
import com.juanmello.projectspringboot.domain.enums.EstadoPagamento;
import com.juanmello.projectspringboot.domain.enums.TipoCliente;
import com.juanmello.projectspringboot.repositories.CategoriaRepository;
import com.juanmello.projectspringboot.repositories.CidadeRepository;
import com.juanmello.projectspringboot.repositories.ClienteRepository;
import com.juanmello.projectspringboot.repositories.EnderecoRepository;
import com.juanmello.projectspringboot.repositories.EstadoRepository;
import com.juanmello.projectspringboot.repositories.ItemPedidoRepository;
import com.juanmello.projectspringboot.repositories.PagamentoRepository;
import com.juanmello.projectspringboot.repositories.PedidoRepository;
import com.juanmello.projectspringboot.repositories.ProdutoRepository;

@SpringBootApplication
public class ProjectspringbootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjectspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
