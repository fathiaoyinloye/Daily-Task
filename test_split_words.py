import unittest
from split_words import *
class TestSplitWords (unittest.TestCase):
	def test_that_there_are_words_to_be_split(self):
		actual = get_word("I am good")
		expected = "I am good"
		self.assertEqual(actual,expected)

	def test_that_numbers_are_not_inputed(self):
		actual = get_word(234)
		expected = "Invalid Input"
		self.assertEqual(actual,expected)

	def test_that_there_are_words_not_empty(self):
		actual = get_word("")
		expected = "Invalid Input"
		self.assertEqual(actual,expected)

	def test_that_words_is_not_empty(self):
		actual = get_word("")
		expected = "Invalid Input"
		self.assertEqual(actual,expected)

	def test_that_words_are_converted_to_list(self):
		actual = split_words("I love programming")
		expected = ["I", "love", "programming"]
		self.assertEqual(actual,expected)
