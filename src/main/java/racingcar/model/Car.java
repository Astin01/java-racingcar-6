package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int move;

    public void randomNumber() {
        this.move = Randoms.pickNumberInRange(0, 9);
    }

    public boolean moveForward() {
        if (this.move >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public void putName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
