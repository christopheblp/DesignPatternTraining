package strategie.canards

import strategie.comportements.cancaner.ComportementCancan
import strategie.comportements.voler.ComportementVol

abstract class Canard {

  var comportementCancan: ComportementCancan
  var comportementVol: ComportementVol

  def effectuerCancan {
    comportementCancan.cancaner
  }

  def effectuerVol {
    comportementVol.voler
  }

  def nager {
    println("Tous les canards savent nager !")
  }

  def setComportementVol(cVol: ComportementVol): Unit = {
    comportementVol = cVol
  }

  def setComportementCancan(cCancan: ComportementCancan): Unit = {
    comportementCancan = cCancan
  }

  def afficher

}
