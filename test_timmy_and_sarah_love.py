import unittest
from timmy_sarah_love import *

class TestToUppercase(unittest.TestCase):

	def test_if_timmy_and_sarah_picks_a_flower(self):
		actual = is_true_love(45,6)
		expected = True
		self.assertEqual(actual,expected)

	def test_if_the_right_response_is_given_if_one_picks_even_number_of_flowers(self):
		actual = is_true_love(45,6)
		expected = True
		self.assertEqual(actual,expected)

	def test_if_the_right_response_is_given_if_one_picks_old_number_of_flowers(self):
		actual = is_true_love(5,6)
		expected = True
		self.assertEqual(actual,expected)
	def test_if_the_right_response_is_given_if_both_picks_old_number_of_flowers(self):
		actual = is_true_love(5,1)
		expected = False
		self.assertEqual(actual,expected)