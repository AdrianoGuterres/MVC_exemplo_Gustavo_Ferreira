package br.com.gqferreira;

import br.com.gqferreira.controller.ControllerPrincipal;
import br.com.gqferreira.view.FramePrincipal;

/**
 *
 * @author Gustavo Ferreira
 */
public class MVC {

    public static void main(String[] args) {
        FramePrincipal framePrincipal = new FramePrincipal();
        new ControllerPrincipal(framePrincipal);
        framePrincipal.setVisible(true);

    }
}
