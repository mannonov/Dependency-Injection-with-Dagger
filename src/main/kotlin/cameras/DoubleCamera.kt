package cameras

import interfaces.Camera

class DoubleCamera: Camera {
    override fun cameraInfo() {
        println("24px")
    }
}