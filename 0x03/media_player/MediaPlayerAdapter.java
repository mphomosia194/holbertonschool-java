public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(MediaType type) {

        if (type != MediaType.MP3) {
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void play(MediaType type, String fileName) {

        if (type == MediaType.VLC) {

            advancedMediaPlayer.playVLC(fileName);

        } else if (type == MediaType.MP4) {

            advancedMediaPlayer.playMP4(fileName);
        }
    }
}
