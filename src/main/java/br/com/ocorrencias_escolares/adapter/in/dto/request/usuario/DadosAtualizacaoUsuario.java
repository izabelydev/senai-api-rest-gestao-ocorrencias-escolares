package br.com.ocorrencias_escolares.adapter.in.dto.request.usuario;

import br.com.ocorrencias_escolares.adapter.in.dto.enums.PerfilEnum;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoUsuario(
        PerfilEnum perfil,

        @Pattern(regexp = ".{8}")
        String senha
) {}
