fun main() {


    val phoneComponent = DaggerPhoneComponent.create()

    val phone = phoneComponent.createPhone()

    phone.brand.brandInfo()

    phone.camera.cameraInfo()

    phone.display.displayInfo()


}