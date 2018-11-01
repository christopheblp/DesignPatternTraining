package strategie.comportements.voler

class NePasVoler extends ComportementVol {
  override def voler: Unit = println("Je ne sais pas voler")
}