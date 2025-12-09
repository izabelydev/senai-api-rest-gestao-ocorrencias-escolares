package br.com.ocorrencias_escolares.adapter.in.dto.request.usuario;

import br.com.ocorrencias_escolares.adapter.in.dto.enums.PerfilEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastramentoUsuario(

        @NotBlank
        String nome,

        @NotBlank
        String login,

        @NotBlank
        @Pattern(regexp = ".{8}")
        String senha,

        PerfilEnum perfil
) {}
