package br.com.ocorrencias_escolares.application.core.service;

import br.com.ocorrencias_escolares.adapter.in.dto.request.usuario.DadosAtualizacaoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.request.usuario.DadosCadastramentoUsuario;
import br.com.ocorrencias_escolares.adapter.in.dto.response.MensagemResposta;
import br.com.ocorrencias_escolares.adapter.in.dto.response.usuario.DadosDetalhamentoUsuario;
import br.com.ocorrencias_escolares.adapter.in.mapper.UsuarioMapper;
import br.com.ocorrencias_escolares.application.ports.out.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    @Transactional
    public DadosDetalhamentoUsuario cadastrarUsuario(DadosCadastramentoUsuario dados) {
        return new DadosDetalhamentoUsuario(null, null, dados.nome(), null);
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
