package br.com.ocorrencias_escolares.adapter.in.dto.response.usuario;

import br.com.ocorrencias_escolares.adapter.in.dto.enums.PerfilEnum;

public record DadosDetalhamentoUsuario(
       Long id,
       Boolean ativo,
       String nome,
       PerfilEnum perfil
) {}
