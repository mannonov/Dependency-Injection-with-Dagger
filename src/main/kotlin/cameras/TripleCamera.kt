package cameras

import interfaces.Camera

class TripleCamera: Camera {
    override fun cameraInfo() {
        println("48px")
    }
}