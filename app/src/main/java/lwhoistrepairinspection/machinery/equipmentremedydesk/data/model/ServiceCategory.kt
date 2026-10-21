package lwhoistrepairinspection.machinery.equipmentremedydesk.data.model

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.ElectricalServices
import androidx.compose.material.icons.outlined.Engineering
import androidx.compose.material.icons.outlined.FactCheck
import androidx.compose.material.icons.outlined.School
import androidx.compose.ui.graphics.vector.ImageVector
import lwhoistrepairinspection.machinery.equipmentremedydesk.R

enum class ServiceCategory(
    @field:StringRes val titleRes: Int,
    val icon: ImageVector,
) {
    MECHANICAL_REPAIR(R.string.service_category_mechanical_repair_title, Icons.Outlined.Build),
    ELECTRICAL_SYSTEMS(R.string.service_category_electrical_systems_title, Icons.Outlined.ElectricalServices),
    INSPECTION_DIAGNOSTICS(R.string.service_category_inspection_diagnostics_title, Icons.Outlined.FactCheck),
    ENGINEERING_CONSULTING(R.string.service_category_engineering_consulting_title, Icons.Outlined.Engineering),
    OPERATOR_TRAINING(R.string.service_category_operator_training_title, Icons.Outlined.School),
}
