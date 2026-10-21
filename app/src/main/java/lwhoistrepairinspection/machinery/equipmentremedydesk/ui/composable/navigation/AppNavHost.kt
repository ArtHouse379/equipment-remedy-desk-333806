package lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.bookings.SKLGBookingsScreen
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.checkout.SKLGCheckoutScreen
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.home.SKLGHomeScreen
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.onboarding.SKLGOnboardingScreen
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.servicedetails.SKLGServiceDetailsScreen
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.settings.SKLGSettingsScreen
import lwhoistrepairinspection.machinery.equipmentremedydesk.ui.composable.screen.splash.SKLGSplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            SKLGSplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            SKLGOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home> {
            SKLGHomeScreen(
                onNavigateToServiceDetails = { serviceId: Int ->
                    navController.navigate(
                        route = NavRoute.ServiceDetails(serviceId = serviceId)
                    )
                }
            )
        }

        composable<NavRoute.ServiceDetails> { backStackEntry ->
            val serviceDetails: NavRoute.ServiceDetails = backStackEntry.toRoute()
            SKLGServiceDetailsScreen(
                serviceId = serviceDetails.serviceId,
                onNavigateToCheckout = { serviceId: Int ->
                    navController.navigate(
                        route = NavRoute.Checkout(serviceId = serviceId)
                    )
                }
            )
        }

        composable<NavRoute.Checkout> { backStackEntry ->
            val checkout: NavRoute.Checkout = backStackEntry.toRoute()
            SKLGCheckoutScreen(
                serviceId = checkout.serviceId,
                onNavigateToBookingsScreen = {
                    navController.navigate(NavRoute.Bookings) {
                        popUpTo(NavRoute.Home) {
                            inclusive = false
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Bookings> {
            SKLGBookingsScreen()
        }

        composable<NavRoute.Settings> {
            SKLGSettingsScreen()
        }
    }
}