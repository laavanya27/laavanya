package imageViewerEx;

public class WindowsImageFactory implements ImageFactory{

	@Override
	public ImageViewer getImageViewer() {
		// TODO Auto-generated method stub
		return new SWTImageViewer();
	}

}
