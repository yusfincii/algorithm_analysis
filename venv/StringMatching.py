def string_matching(text, pattern):
    for i in range(0, len(text) - len(pattern)):
        j = 0
        # condition of while represent the character matching situation
        # so loop will work when text's corresponding char match with pattern's char
        while j < len(pattern) and pattern[j] == text[j + i]:
            j += 1

        if j == len(pattern):
            return i
    # not found situation
    return -1

    # Time Complexity : O(len(text) * len(pattern))


# for testing
text = "Lorem ipsum dolar amet"
pattern = "ola"
print(string_matching(text, pattern))
