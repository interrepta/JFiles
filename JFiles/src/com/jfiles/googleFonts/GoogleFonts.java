package com.jfiles.googleFonts;

import com.jfiles.JFiles.JFiles;

import java.io.File;
import java.util.List;

public final class GoogleFonts {

    public GoogleFonts() {
        List <File> googleFonts = new JFiles().filesList(new File("google-fonts"), new String[]{"ttf"}, true);

        for(File googleFont : googleFonts) {
            new JFiles().copy(googleFont, new File("google-fonts-ttf/" +googleFont.getName()));
        }
    }

    public static void main(String[] args) {
        new GoogleFonts();
    }

}
