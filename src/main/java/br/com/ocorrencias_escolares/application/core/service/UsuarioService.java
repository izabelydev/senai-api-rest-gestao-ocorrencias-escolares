package br.com.ocorrencias_escolares.application.core.service;

import br.com.ocorrencias_escolares.adapter.in.dto.request.usuario.DadosAtualizacaoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.request.usuario.DadosCadastramentoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.response.MensagemResposta;
import br.com.ocorrencias_escolares.adapter.in.dto.response.usuario.DadosDetalhamentoUsuario;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Transactional
    public DadosDetalhamentoUsuario cadastrarUsuario(DadosCadastramentoUsuario dados) {
        return null;
    }

    public Page<DadosDetalhamentoUsuario> listarUsuarios(Pageable paginacao) {
        return null;
    }

    @Transactional
    public MensagemResposta atualizarUsuario(@Valid DadosAtualizacaoUsuario dados) {
        return null;
    }

    public DadosDetalhamentoUsuario excluirUsuario(Long id) {
        return null;
    }
}
