import pytest

import hw_task


def test_list_comparasion_first_more():
    assert hw_task.list_comparasion([1, 2, 3, 4, 6], [1, 2, 3, 4, 5]) == "Первый список имеет большее среднее значение"


def test_list_comparasion_second_more():
    assert hw_task.list_comparasion([1, 2, 3, 4, 3], [1, 2, 3, 4, 6]) == "Второй список имеет большее среднее значение"


def test_list_comparasion_equal():
    assert hw_task.list_comparasion([1, 2, 3, 4, 3], [1, 2, 3, 4, 3]) == "Средние значения равны"


def test_list_comparasion_first_empty():
    assert hw_task.list_comparasion([], [1, 2, 3, 4, 3]) == "Первый список пуст"


def test_list_comparasion_second_empty():
    assert hw_task.list_comparasion([1, 2, 3, 4, 3], []) == "Второй список пуст"


def test_list_comparasion_first_and_second_empty():
    assert hw_task.list_comparasion([], []) == "Первый и второй список пусты"
