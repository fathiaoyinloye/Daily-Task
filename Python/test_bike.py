from unittest import TestCase
from bike import Bike


class TestBike(TestCase):
    def test_that_bike_is_off_at_default(self):
        bike = Bike()
        actual =  bike.get_bike_status()
        self.assertFalse(actual)  # add assertion here

    def test_that_bike_can_be_turn_on(self):
        bike = Bike()
        bike.on_bike()
        actual = bike.get_bike_status()
        self.assertTrue(actual)

    def test_that_bike_cannot_be_turn_off_when_it_is_not_on(self):
        bike = Bike()
        self.assertRaises(ValueError, bike.off_bike)

    def test_that_bike_csn_be_accelerated(self):
        bike = Bike()
        bike.on_bike()
        bike.accelerateBike()
        actual = bike.get_speed()
        self.assertEqual(actual, 1)

    def test_that_bike_can_be_accelerated_to_gear_two(self):
        bike = Bike()
        bike.on_bike()
        for _ in range(21):
            bike.accelerateBike()
        actual = bike.get_speed()
        self.assertEqual(actual, 22)
    def test_that_bike_can_be_accelerated_to_gear_three(self):
        bike = Bike()
        bike.on_bike()
        for _ in range(26):
            bike.accelerateBike()
        actual = bike.get_speed()
        self.assertEqual(actual, 33)

    def test_that_bike_can_be_accelerated_to_gear_four(self):
        bike = Bike()
        bike.on_bike()
        for _ in range(30):
            bike.accelerateBike()
        actual = bike.get_speed()
        self.assertEqual(actual, 46)

    def test_that_bike_can_be_decelerated(self):
        bike = Bike()
        bike.on_bike()
        bike.accelerateBike()
        bike.accelerateBike()
        bike.decelerateBike()
        actual = bike.get_speed()
        self.assertEqual(actual, 1)

    def test_that_bike_can_be_decelerated_when_it_is_in_gear_four(self):
        bike = Bike()
        bike.on_bike()
        for _ in range(30):
            bike.accelerateBike()
        bike.decelerateBike()
        actual = bike.get_speed()
        self.assertEqual(actual, 42)

    def test_that_bike_can_be_decelerated_when_it_is_in_gear_three(self):
        bike = Bike()
        bike.on_bike()
        for _ in range(27):
            bike.accelerateBike()
        bike.decelerateBike()
        actual = bike.get_speed()
        self.assertEqual(actual, 33)

    def test_that_bike_can_be_decelerated_when_in_gear_two(self):
        bike = Bike()
        bike.on_bike()
        for _ in range(22):
            bike.accelerateBike()
        bike.decelerateBike()
        actual = bike.get_speed()
        self.assertEqual(actual, 22)

    def test_that_bike_cannot_be_turn_decelerated_when_it_is_off(self):
        bike = Bike()
        self.assertRaises(ValueError, bike.decelerateBike)