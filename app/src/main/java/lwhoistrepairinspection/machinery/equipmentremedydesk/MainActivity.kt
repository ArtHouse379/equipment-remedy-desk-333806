package lwhoistrepairinspection.machinery.equipmentremedydesk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.approot.AppRoot
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.theme.SKLGAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SKLGAppTheme {
                AppRoot()
            }
        }
    }
}