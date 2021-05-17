package cameras

import interfaces.Camera

class UnityCamera : Camera {
    override fun cameraInfo() {
        println("12px")
    }
}