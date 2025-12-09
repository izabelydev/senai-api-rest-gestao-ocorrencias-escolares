package br.com.ocorrencias_escolares.adapter.in;

import br.com.ocorrencias_escolares.adapter.in.dto.request.usuario.DadosAtualizacaoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.request.usuario.DadosCadastramentoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.response.usuario.DadosDetalhamentoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.response.MensagemResposta;
import br.com.ocorrencias_escolares.application.ports.in.UsuarioControllerPort;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController implements UsuarioControllerPort {

    @Override
    @PostMapping("/cadastrar")
    public ResponseEntity<DadosDetalhamentoUsuario> cadastrar(DadosCadastramentoUsuario dados) {
        return null;
    }

    @Override
    @GetMapping("/listar")
    public ResponseEntity<Page<DadosDetalhamentoUsuario>> listar(Pageable paginacao) {
        return null;
    }

    @Override
    public ResponseEntity<MensagemResposta> atualizar(DadosAtualizacaoUsuario dados) {
        return null;
    }

    @Override
    public ResponseEntity<DadosDetalhamentoUsuario> excluir(Long id) {
        return null;
    }
}
