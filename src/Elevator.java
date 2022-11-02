public class Elevator {
    int currentFloor = 6;
    int maxFloor;
    int minFloor;
    static int requiredFloor;

    public Elevator(int maxFloor, int minFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    private void moveDown() {
        currentFloor = currentFloor - 1;
    }

    private void moveUp() {
        currentFloor = currentFloor + 1;
    }

    public void move(int requiredFloor) {
        if (requiredFloor > maxFloor) {
            System.out.println("Введите число поменьше");
            return;
        }
        if (requiredFloor < minFloor) {
            System.out.println("Введите число побольше");
            return;
        }
        if (requiredFloor < currentFloor) {
            for (int i = currentFloor; i > minFloor; i = i - 1) {
                if (i == requiredFloor) {
                    break;
                }
                moveDown();
                System.out.println(currentFloor);
            }
        }

        if(requiredFloor > currentFloor){
            for(int i = currentFloor; i < maxFloor; i = i+1){
               if (i == requiredFloor){
                    break;
                }
                moveUp();
                System.out.println(currentFloor);
            }
        }
    }
}
