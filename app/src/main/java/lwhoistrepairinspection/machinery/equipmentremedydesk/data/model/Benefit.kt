package lwhoistrepairinspection.machinery.equipmentremedydesk.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BuildCircle
import androidx.compose.material.icons.outlined.HealthAndSafety
import androidx.compose.material.icons.outlined.Verified
import androidx.compose.ui.graphics.vector.ImageVector

data class Benefit(
    val icon: ImageVector,
    val text: String,
)

val defaultServiceBenefits: List<Benefit> = listOf(
    Benefit(icon = Icons.Outlined.Verified, text = "Engineer-checked quality"),
    Benefit(icon = Icons.Outlined.BuildCircle, text = "Workmanship warranty"),
    Benefit(icon = Icons.Outlined.HealthAndSafety, text = "Essential safety support"),
)
