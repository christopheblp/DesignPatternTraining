package strategie.canards

import strategie.comportements.cancaner.{Cancan, ComportementCancan}
import strategie.comportements.voler.{ComportementVol, VolerAvecDesAiles}

class Colvert extends Canard {

  var comportementCancan: ComportementCancan = new Cancan
  var comportementVol: ComportementVol = new VolerAvecDesAiles

  override def afficher: Unit = {
    println("Je suis un colvert")
  }
}