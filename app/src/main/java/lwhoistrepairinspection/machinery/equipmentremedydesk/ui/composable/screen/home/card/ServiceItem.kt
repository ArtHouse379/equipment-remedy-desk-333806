package lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.home.card

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import lwhoistrepairinspection.machinery.equipmentremedydesk.R
import lwhoistrepairinspection.machinery.equipmentremedydesk.data.model.ServiceModel
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.shared.ServiceImage
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.theme.LocalDimens
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.theme.cardBorderStroke
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.theme.imageBorder

@Composable
fun ServiceItem(
    service: ServiceModel,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    val dimens = LocalDimens.current

    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(dimens.cardCornerRadius),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainerLow,
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
        border = cardBorderStroke(),
    ) {
        ServiceImage(
            imageUrl = service.imageUrl,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .imageBorder(RectangleShape),
        )

        Column(modifier = Modifier.padding(dimens.cardPadding)) {
            Text(
                text = service.name,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.titleMedium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )

            Text(
                text = stringResource(service.serviceCategory.titleRes),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodySmall,
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = stringResource(R.string.price_per_hour, service.pricePerHour),
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.bodyMedium,
                )

                Text(
                    text = stringResource(R.string.button_view_details_text),
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    style = MaterialTheme.typography.titleMedium,
                )
            }
        }
    }
}
