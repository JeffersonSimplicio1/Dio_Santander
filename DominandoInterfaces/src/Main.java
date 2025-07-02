public class Main {
    public static void main(String[] args) {

        var musicPlayer = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("Playing music");
            }

            @Override
            public void pauseMusic() {


            }

            @Override
            public void stopMusic() {

            }
        };
        var musicPlayer2 = new MusicPlayer() {
            @Override
            public void playMusic() {

            }

            @Override
            public void pauseMusic() {

            }

            @Override
            public void stopMusic() {

            }
        };
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getClass());
        System.out.println(musicPlayer2.getClass());;
    }
}