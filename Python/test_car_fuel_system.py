from unittest import TestCase

from car_fuel_system import CarFuelSystem


class TestCarSystemFunction(TestCase):
    def test_car_is_not_started_by_default(self):
        car = CarFuelSystem()
        actual = car.get_car_starting_status()
        self.assertEqual(actual, False)

    def test_that_car_can_be_started(self ):
        car = CarFuelSystem()
        car.start_car()
        actual = car.get_car_starting_status()
        self.assertEqual(actual, True)

    def test_that_cannot_start_when_it_is_already_started(self):
        car = CarFuelSystem()
        car.start_car()
        self.assertRaises(ValueError, car.start_car)

    def test_that_car_can_stop(self):
        car = CarFuelSystem()
        car.start_car()
        car.stop_car()
        actual = car.get_car_starting_status()
        self.assertEqual(actual, False)

    def test_that_car_cannot_be_stop_when_it_is_not_started(self):
        car = CarFuelSystem()
        self.assertRaises(ValueError, car.stop_car)

    def test_that_by_default_your_fuel_tank_is_empty(self):
        car = CarFuelSystem()
        actual = car.get_level_of_fuel()
        self.assertEqual(actual, 0)

    def test_that_your_car_can_be_fueled(self  ):
        car = CarFuelSystem()
        car.refuel(10)
        actual = car.get_level_of_fuel()
        self.assertEqual(actual, 10)


    def test_that_you_cannot_refill_your_tank_more_than_the_fuel_level(self):
        car = CarFuelSystem()
        car.refuel(40)
        self.assertRaises(ValueError, car.refuel, 40)