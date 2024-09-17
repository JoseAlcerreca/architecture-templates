package android.template.screenshots

import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.github.takahirom.roborazzi.captureRoboImage
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
//@GraphicsMode(GraphicsMode.Mode.NATIVE)
//@Config(application = HiltTestApplication::class)
class ScreenshotTests {

    @Test
    fun test1() {

    }
//
//    /**
//     * Use the primary activity to initialize the app normally.
//     */
//    @get:Rule(order = 0)
//    val composeTestRule = createAndroidComposeRule<ComponentActivity>()
//
//    @Test
//    fun firstScreen_isForYou() {
//        composeTestRule.setContent {
//            Text("Accc", modifier = Modifier.testTag("test1"))
//        }
//        composeTestRule.onNodeWithTag("test1")
//            .captureRoboImage("screenshots/firstScreen_isForYou.png")
//    }
}
