package FacadePattern;

public class Facade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private ImageViewer imageViewer;

    public Facade(){
        audioPlayer=new AudioPlayer();
        videoPlayer=new VideoPlayer();
        imageViewer=new ImageViewer();
    }
    public void MultiMedia(){
        audioPlayer.Play();
        videoPlayer.Play();
    }
    public void ViewImage(){
        imageViewer.View();
    }
}
