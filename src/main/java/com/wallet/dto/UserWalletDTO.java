package com.wallet.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserWalletDTO {

    public Long id;
    @NotNull(message = "Informe o ID do usuário")
    public Long users;
    @NotNull(message = "Informe o ID da carteira")
    public Long wallet;
}
