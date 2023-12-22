package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(@NotBlank String nome,
                                    @NotEmpty @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}")
                                    String cpf,
                                    @NotBlank @Email String email, @NotBlank String telefone,
                                    @NotNull @Valid DadosEndereco endereco) {
}
