package ch.ehi.umleditor.application;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class MessageWithLink extends JEditorPane {
    private static final long serialVersionUID = 1L;
    private URI uri= null;
    public MessageWithLink(final String htmlBody) {
        super("text/html", "<html><body style=\"" + getStyle() + "\">" + htmlBody + "</body></html>");
        addHyperlinkListener(new HyperlinkListener() {
            @SuppressWarnings("static-access")
			@Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED)) {
                    // Process the click event on the link (for example with java.awt.Desktop.getDesktop().browse())
                    System.out.println(e.getURL()+" was clicked");
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();
                        try {
                        	
                        	//uri.create(staticUri);
                        	 desktop.browse(new URI("https://github.com/AgenciaImplementacion/umleditor/releases"));
                        } catch (IOException ex) {
                          JOptionPane.showMessageDialog(null,
                              "Failed to launch the link, your computer is likely misconfigured.",
                              "Cannot Launch Link",JOptionPane.WARNING_MESSAGE);
                        } catch (URISyntaxException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                      } else {
                        JOptionPane.showMessageDialog(null,
                            "Java is not able to launch links on your computer.",
                            "Cannot Launch Link", JOptionPane.WARNING_MESSAGE);
                      }
                }
            }
        });
        setEditable(false);
        setBorder(null);
    }

    static StringBuffer getStyle() {
        // for copying style
        JLabel label = new JLabel();
        Font font = label.getFont();
        Color color = label.getBackground();

        // create some css from the label's font
        StringBuffer style = new StringBuffer("font-family:" + font.getFamily() + ";");
        style.append("font-weight:" + (font.isBold() ? "bold" : "normal") + ";");
        style.append("font-size:" + font.getSize() + "pt;");
        style.append("background-color: rgb("+color.getRed()+","+color.getGreen()+","+color.getBlue()+");");
        return style;
    }
}