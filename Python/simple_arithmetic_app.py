import random
import time

def run_simple_arithmetic_app():
    print("=== Simple Arithmetic Practice ===")
    print("You will solve subtraction problems.")
    print("You have 2 attempts per problem.")
    print("Maximum of 10 questions.\n")

    start_time = time.time()
    correct_answers = 0

    for problem_number in range(10):
        if arithmetic_ask_subtraction_problem():
            correct_answers += 1

        print(f"Score: {correct_answers} / {problem_number + 1}\n")

    total_time = int(time.time() - start_time)
    arithmetic_show_results(correct_answers, 10, total_time)


def arithmetic_ask_subtraction_problem():
    first_num = random.randint(1, 100)
    second_num = random.randint(1, first_num)
    correct_answer = first_num - second_num

    for attempt_number in range(2):
        user_input = input(f"{first_num} - {second_num} = ")

        if user_input.isdigit() and int(user_input) == correct_answer:
            print("Genius!")
            return True
        else:
            print("Try again!")

    print(f"The correct answer was {correct_answer}")
    return False


run_simple_arithmetic_app()

