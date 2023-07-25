def solution(n, control):
    replacements = {
    "w": "+1",
    "s": "-1",
    "d": "+10",
    "a": "-10"
    }
    control = multiple_replace(control, replacements);
    return eval(str(n) + control)

def multiple_replace(input_string, replacements):
    for old_str, new_str in replacements.items():
        input_string = input_string.replace(old_str, new_str)
    return input_string


