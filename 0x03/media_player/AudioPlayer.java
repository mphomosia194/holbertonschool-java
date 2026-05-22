public class AudioPlayer implements MediaPlayer {

    private MediaPlayerAdapter adapter;

    @Override
    public void play(MediaType type, String fileName) {

        if (type == MediaType.MP3) {

            System.out.println("Playing MP3: " + fileName);

        } else {

            adapter = new MediaPlayerAdapter(type);
            adapter.play(type, fileName);
        }
    }
}
