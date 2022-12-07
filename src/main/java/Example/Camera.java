package Example;

public class Camera {
    private CameraRoll cameraRoll;
    public Camera() {
        this.cameraRoll = cameraRoll;
    }
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }
    public void doPhotograph() {
        System.out.println("Щелк!");
        cameraRoll.processing();
    }

    public interface CameraRoll {
        public void processing();
    }
    public static class ColorCameraRoll implements CameraRoll {
        @Override
        public void processing() {
            System.out.println("-1 цветной кадр");
        }
    }
    public class BlackAndWhiteCameraRoll implements CameraRoll {
        public void processing() {
            System.out.println("-1 черно-белый кадр");
        }
    }
}