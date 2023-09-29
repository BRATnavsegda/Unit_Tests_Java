package seminars.second.hw;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

//Задание 1.
//        Проект Vehicle. Написать следующие тесты с использованием JUnit5:
//
//        - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
//
//        - Проверить, что объект Car создается с 4-мя колесами.
//
//        - Проверить, что объект Motorcycle создается с 2-мя колесами.
//
//        - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
//
//        - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
//
//        - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
//
//        - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
//
//        В этом проекте, вы будете работать с проектом ""Vehicle"", который представляет собой иерархию классов, включающую абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".
//
//        Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"", а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".
//
//        Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.
//
//        Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.
class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @Nested
    class TestCasesWithCar {

        @BeforeEach
        void prepareData() {
            car = new Car("Citroen", "C4", 2008);
        }

        @Test
        void carIsInstanceOfVehicleTest() {
            assertThat(car).isInstanceOf(Vehicle.class);
        }

        @Test
        void carObjectHasFourWheelsTest() {
            assertThat(car.getNumWheels()).isEqualTo(4);
        }

        @Test
        void carCheckTestDriveSpeedTest() {
            car.testDrive();
            assertThat(car.getSpeed()).isEqualTo(60);
        }

        @Test
        void carCheckParkModeSpeedTest() {
            car.testDrive();
            car.park();
            assertThat(car.getSpeed()).isEqualTo(0);
        }
    }

    @Nested
    class TestCasesWithMotorcycle {

        @BeforeEach
        void prepareData() {
            motorcycle = new Motorcycle("BMW", "K 1600 GTL", 2023);
        }

        @Test
        void motorcycleObjectHasTwoWheelsTest() {
            assertThat(motorcycle.getNumWheels()).isEqualTo(2);
        }

        @Test
        void motorcycleCheckTestDriveSpeedTest() {
            motorcycle.testDrive();
            assertThat(motorcycle.getSpeed()).isEqualTo(75);
        }

        @Test
        void motorcycleCheckParkModeSpeedTest() {
            motorcycle.testDrive();
            motorcycle.park();
            assertThat(motorcycle.getSpeed()).isEqualTo(0);
        }
    }
}