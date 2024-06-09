package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
/**
 * Задание
 * - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
 * - Проверить, что объект Car создается с 4-мя колесами.
 * - Проверить, что объект Motorcycle создается с 2-мя колесами.
 * - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
 * - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
 * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
 * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
 */
class VehicleTest {
    @Test
    void carInstanceOfVehicle() {
        Car car = new Car("KIA","Ceed",2021);
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void carHasFourWheels() {
        Car car = new Car("KIA","Ceed",2021);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Sportbike", 2023);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carSpeedTestDrive() {
        Car car = new Car("KIA","Ceed",2021);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    void motorcycleSpeedTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Sportbike", 2023);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void carSpeedAfterPark() {
        Car car = new Car("KIA","Ceed",2021);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleSpeedAfterPark() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Sportbike", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}