package imageViewerEx;


public interface ImageFactory {
 public ImageViewer getImageViewer();
 
 public static ImageFactory getFactory(String type){
	 switch(type){
	 case "Unix" :
		 return new UnixImageFactory();
	 case "Windows":
		 return new WindowsImageFactory();
	 case "Mobile":
	 	return new MobileImageFactory();
	 default:
		 return null;
	 }
 }
}
