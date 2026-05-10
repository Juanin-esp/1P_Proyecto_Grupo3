package Vista;

import javax.swing.*;

public interface VistaReproductor {
    JToggleButton getBtnTogPlayPause();
    JToggleButton getBtnTogMute();
    JButton getBtnNext();
    JButton getBtnPrev();
    JToggleButton getBtnTogSongFav();
    JLabel getLblSongTitle();
    JLabel getLblArtist();
    JLabel getLblTimeStart();
    JLabel getLblTimeEnd();
    JLabel getLblVolume();
    JSlider getSliderProgress();
    JSlider getSliderVolume();
}