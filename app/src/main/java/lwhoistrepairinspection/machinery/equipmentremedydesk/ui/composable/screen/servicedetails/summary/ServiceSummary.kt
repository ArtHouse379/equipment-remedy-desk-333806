package lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.servicedetails.summary

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import lwhoistrepairinspection.machinery.equipmentremedydesk.R
import lwhoistrepairinspection.machinery.equipmentremedydesk.data.model.ServiceModel
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.theme.LocalDimens

private val StripeWidth = 4.dp

@Composable
fun ServiceSummary(
    service: ServiceModel,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current

    Row(
        modifier = modifier.height(IntrinsicSize.Min),
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(StripeWidth)
                .clip(RoundedCornerShape(dimens.cornerRadius))
                .background(MaterialTheme.colorScheme.primary),
        )

        Spacer(modifier = Modifier.width(dimens.itemSpacing))

        Column {
            Text(
                text = service.name,
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.headlineSmall,
            )

            Spacer(modifier = Modifier.height(dimens.tightSpacing))

            Text(
                text = stringResource(service.serviceCategory.titleRes),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodySmall,
            )

            Spacer(modifier = Modifier.height(dimens.itemSpacing))

            Text(
                text = stringResource(R.string.price_per_hour, service.pricePerHour),
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleLarge,
            )
        }
    }
}
