package br.com.ocorrencias_escolares.application.ports.in;

import br.com.ocorrencias_escolares.adapter.in.dto.request.usuario.DadosAtualizacaoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.request.usuario.DadosCadastramentoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.response.usuario.DadosDetalhamentoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.response.MensagemResposta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface UsuarioControllerPort {
    ResponseEntity<DadosDetalhamentoUsuario> cadastrar(DadosCadastramentoUsuario dados);
    ResponseEntity<Page<DadosDetalhamentoUsuario>> listar(Pageable paginacao);
    ResponseEntity<MensagemResposta> atualizar(DadosAtualizacaoUsuario dados);
    ResponseEntity<DadosDetalhamentoUsuario> excluir(Long id);
}

