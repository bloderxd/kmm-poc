package kmm_poc.bloder.com.screens

import br.com.zup.beagle.ext.setStyle
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.UnitValue
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text

fun getHomeScreen(): Screen {
    return Screen(
        child = Container(
            children = listOf(
                Text(
                    text = "The Home Screen!"
                ).setStyle {
                    margin = EdgeValue(bottom = UnitValue.real(12))
                },
                Text(
                    text = "This is the home screen of KMM POC"
                ).setStyle {
                    margin = EdgeValue(bottom = UnitValue.real(12))
                },
                Button(
                    text = "First Button",
                    onPress = listOf(
                        Alert(
                            title = "Button Pressed",
                            message = "You pressed the first button"
                        )
                    )
                ).setStyle {
                    margin = EdgeValue(bottom = UnitValue.real(12))
                },
                Button(
                    text = "Second Button",
                    onPress = listOf(
                        Alert(
                            title = "Button Pressed",
                            message = "You pressed the second button"
                        )
                    )
                )
            )
        ).setStyle {
            margin = EdgeValue(all = UnitValue.real(24))
        }
    )
}