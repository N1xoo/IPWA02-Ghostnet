package controller;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 * Bean Annotation.
 */
@Named
@ViewScoped
public class IndexController implements Serializable {

  private static final long serialVersionUID = 1L;

  public String index() {
    return Pages.INDEX;
  }

  public String newGhostNet() {
    return Pages.NEW_GHOST_NET;
  }

  public String tableGhostNets() {
    return Pages.TABLE_GHOST_NETS;
  }

  public String recoveringPerson() {
    return Pages.RECOVERING_PERSON;
  }
}