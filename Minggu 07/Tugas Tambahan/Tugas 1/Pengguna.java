/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasMinggu7;

/**
 *
 * @author user
 */
public class Pengguna {
    public static void main(String[] args) {
        Televisi tv = new Televisi("LG, 23 inches", 10);
        String[] semuaChannel = {"MNC TV","TVRI","NET TV","TRANS TV",
                                 "TRANS 7", "RCTI", "INDOSIAR","ANTV",
                                 "G TV"};
        String[] channelFavorit = {"G TV","TRANS 7","TRANS TV","MNC TV",
                                   "RCTI", "ANTV"};
        
        System.out.println("Ida Novita, membeli Televisi : "+ tv.getDesk());
        
        tv.getChannels();
        tv.setChannels(semuaChannel);
        tv.setChannels(channelFavorit);
        
        tv.setChannelAktif(3);
        tv.setVolume(9);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
    }
}
