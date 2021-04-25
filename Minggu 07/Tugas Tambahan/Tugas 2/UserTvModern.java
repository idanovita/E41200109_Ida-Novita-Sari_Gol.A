/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasMinggu7.TelevisiModern;

/**
 *
 * @author user
 */
public class UserTvModern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TelevisiModern tv = new TelevisiModern("TV LG , 45 inc" ,12);
        
       String [] semuaChannel = {"MNC TV","TVRI","NET TV","TRANS TV",
                                 "TRANS 7", "RCTI", "INDOSIAR","ANTV",
                                 "G TV","SCTV","TV ONE"};

        System.out.println("Ida Novita, membeli Televisi : "+ tv.getDesk());
       
        tv.getChannels();
        tv.setChannels(semuaChannel);
       
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        
        tv.setModusTampilan(TelevisiModern.TELETEXT);
       tv.setHalamanTeleText(250); 
        tv.setModusTampilan(TelevisiModern.tV);
       tv.playCD();
       tv.setDiscTray("Burn The Stage");
       tv.playCD();
    }
    }
    

