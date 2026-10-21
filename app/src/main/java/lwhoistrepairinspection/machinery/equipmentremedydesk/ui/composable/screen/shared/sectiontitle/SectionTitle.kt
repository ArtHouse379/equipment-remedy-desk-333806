package lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.shared.sectiontitle

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lwhoistrepairinspection.machinery.equipmentremedydesk.R
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.theme.LocalDimens

@Composable
fun SectionTitle(
    text: String,
    modifier: Modifier = Modifier,
    count: Int? = null,
) {
    val dimens = LocalDimens.current
    val titleStyle = MaterialTheme.typography.titleMedium.copy(letterSpacing = 1.5.sp)

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(4.dp)
                    .clip(RoundedCornerShape(dimens.cornerRadius))
                    .background(MaterialTheme.colorScheme.primary),
            )

            Spacer(modifier = Modifier.width(dimens.itemSpacing))

            Text(
                text = text.uppercase(),
                color = MaterialTheme.colorScheme.onBackground,
                style = titleStyle,
            )
        }

        if (count != null) {
            Text(
                text = stringResource(R.string.home_services_count, count),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}
