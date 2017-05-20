package imageViewerEx;

public class TestMain {
public static void main(String[] args) {
	ImageFactory factory = ImageFactory.getFactory("Unix");
	ImageViewer imgViewer = factory.getImageViewer();
	imgViewer.getImages();
	
}
}
