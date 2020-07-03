package bbapp.atracao.service.application.model

import java.util.UUID

data class BumbaMeuBoiDTO(
        val id: String = UUID.randomUUID().toString(),
        val name: String,
        val accent: String
)