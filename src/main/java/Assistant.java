public class Assistant {
    public Camera getCamera() {
        Camera camera = new Camera();
        Camera.CameraRoll cameraRoll = new Camera.ColorCameraRoll();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
