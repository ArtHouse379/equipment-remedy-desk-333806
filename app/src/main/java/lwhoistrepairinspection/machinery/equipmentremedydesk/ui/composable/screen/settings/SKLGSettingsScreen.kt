package lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.approot.LocalContentBottomPadding
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.settings.card.AppInfoCard
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.theme.LocalDimens

@Composable
fun SKLGSettingsScreen(modifier: Modifier = Modifier) {
    val dimens = LocalDimens.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(dimens.screenPadding)
            .padding(bottom = LocalContentBottomPadding.current),
    ) {
        AppInfoCard()
    }
}
