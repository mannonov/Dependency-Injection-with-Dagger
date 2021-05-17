import interfaces.Brand
import interfaces.Camera
import interfaces.Display
import javax.inject.Inject

class Phone @Inject constructor(

    val camera: Camera,
    val display: Display,
    val brand: Brand

){



}