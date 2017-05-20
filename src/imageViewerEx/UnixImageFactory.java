package imageViewerEx;

public class UnixImageFactory implements ImageFactory {

	@Override
	public ImageViewer getImageViewer() {
		// TODO Auto-generated method stub
		return new AWTImageViewer();
	}

}
