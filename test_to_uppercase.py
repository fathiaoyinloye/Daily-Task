import unittest
from to_upper_case import *

class TestToUppercase(unittest.TestCase):
	def test_that_there_is_a_word_to_convert_to_uppercase(self):
		name = "FATHIA"
		actual = to_upper_case(name)
		expected = "FATHIA"
		self.assertEqual(actual,expected)
	def test_that_there_it_is_converting_the_word_to_convert_uppercase(self):
		name = "Fathia"
		actual = to_upper_case(name)
		expected = "FATHIA"
		self.assertEqual(actual,expected)

	def test_that_there_it_is_not_taking_in_numbers_the_word_to_convert_uppercase(self):
		self.assertRaises(TypeError,to_upper_case,1)


