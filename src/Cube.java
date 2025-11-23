public class Cube {
   private int side;
   public Cube(){
      this.side = 1;
   }
   public Cube (int side){
      setSide(side);
   }
   public void setSide(int side){
   if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } this.side = side;
   }
   public int getSide(){
    return side; 
   }
   public int calculateSurfaceArea(){
    return 6 * side * side;
   }
   public int calculateVolume(){
    return side * side * side;
   }
}