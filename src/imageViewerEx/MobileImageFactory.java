package imageViewerEx;

public class MobileImageFactory implements ImageFactory {

	@Override
	public ImageViewer getImageViewer() {
		// TODO Auto-generated method stub
		return new SWINGImageViewer();
	}

}
