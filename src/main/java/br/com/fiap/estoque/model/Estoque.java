package br.com.fiap.estoque.model;

import br.com.fiap.produto.model.Produto;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Estoque {

    private Collection<Produto> produtos = new LinkedHashSet<>();

    public Collection<Produto> getProdutos() {
        return Collections.unmodifiableCollection(produtos);
    }

    public Estoque addProdutos(Collection<Produto> produtos) {
        this.produtos.addAll(produtos);
        return this;
    }

    public Estoque addProduto(Produto produto){
        this.produtos.add(produto);
        return this;
    }

    public Estoque removeProduto(Produto produto){
        this.produtos.remove(produto);
        return this;
    }
}
