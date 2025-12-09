package br.com.ocorrencias_escolares.adapter.in;

import br.com.ocorrencias_escolares.adapter.in.dto.request.usuario.DadosAtualizacaoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.request.usuario.DadosCadastramentoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.response.MensagemResposta;
import br.com.ocorrencias_escolares.adapter.in.dto.response.usuario.DadosDetalhamentoUsuario;
import br.com.ocorrencias_escolares.application.core.service.UsuarioService;
import br.com.ocorrencias_escolares.application.ports.in.UsuarioControllerPort;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/usuario")
public class UsuarioController implements UsuarioControllerPort {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @Override
    @PostMapping("/cadastrar")
    public ResponseEntity<DadosDetalhamentoUsuario> cadastrar(
            @Valid @RequestBody DadosCadastramentoUsuario dados,
            UriComponentsBuilder uriBuilder
    ) {
        DadosDetalhamentoUsuario dto = service.cadastrarUsuario(dados);
        URI uri = uriBuilder.buildAndExpand(dto.id()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @Override
    @GetMapping("/listar")
    public ResponseEntity<Page<DadosDetalhamentoUsuario>> listar(
            @ParameterObject @PageableDefault(sort = {"nome"}) Pageable paginacao) {
        return ResponseEntity.ok(service.listarUsuarios(paginacao));
    }

    @Override
    @PatchMapping("/atualizar")
    public ResponseEntity<MensagemResposta> atualizar(@Valid @RequestBody DadosAtualizacaoUsuario dados) {
        return ResponseEntity.ok(service.atualizarUsuario(dados));
    }

    @Override
    @DeleteMapping("/excluir")
    public ResponseEntity<DadosDetalhamentoUsuario> excluir(Long id) {
        return ResponseEntity.ok(service.excluirUsuario(id));
    }
}
