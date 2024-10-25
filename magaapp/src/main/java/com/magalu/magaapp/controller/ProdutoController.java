package com.magalu.magaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magalu.magaapp.model.DadosCadastraProd;
import com.magalu.magaapp.model.Produto;
import com.magalu.magaapp.repository.ProdutoRepository;

import jakarta.transaction.Transactional;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    // private List<Produto> produtos = new ArrayList<>();
    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public String abreFormProd(Model model) {
        model.addAttribute("produto", new Produto());
        return "produto/formProd";
    }

    @PostMapping
    @Transactional
    public String cadastraProd(DadosCadastraProd dados) {
        Produto produto;


        if (dados.id() != null) { // Verifica se é uma atualização
            produto = repository.findById(dados.id())
                    .orElseThrow(() -> new IllegalArgumentException("Funcionário inválido: " + dados.id()));
            produto.atualizaDados(dados); // Atualiza os dados do funcionário existente
        } else { // Se não houver ID, é uma nova inserção
            produto = new Produto(dados);
        }

        repository.save(produto); 
        return "redirect:/produto/listagem";
    }

        // Método para carregar o formulário de edição
        @GetMapping("/formProd")
        public String carregaFormularioEdicao(@RequestParam Long id, Model model) {
            Produto produto = repository.findById(id)
                    .orElseThrow(() -> new IllegalArgumentException("Produto inválido: " + id));
            model.addAttribute("produto", produto); 
            return "produto/formProd"; 
        }

    @GetMapping("/listagem")
    public String carregaLista(Model model) {
        model.addAttribute("lista", repository.findAll());
        return "produto/listagem";
    }

    @GetMapping("/")
    public String principal(){
        return "index.html";
    }

    @DeleteMapping
    @Transactional
    public String removeProd(Long id) {
        repository.deleteById(id);
        System.out.println("Excluido");
        return "redirect:/produto/listagem";
    }
}
