package strategie.main

import strategie.canards.{Canard, Colvert}

object Simulateur extends App {
  var canard : Canard = new Colvert
  canard.effectuerCancan
  canard.effectuerVol
}
