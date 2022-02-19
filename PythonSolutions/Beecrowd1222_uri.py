from math import ceil


def min_pages(story, ml, mc):
    count = 0
    lines = 1
    for s in story.split():
        if len(s) + count <= mc:
            count += len(s) + 1
        else:
            count = len(s) + 1
            lines += 1
    return ceil(lines / ml)  # aka pages


while True:
    try:
        ln = input().split()
        n, ml, mc = map(int, ln)
        story = input()
        print(min_pages(story, ml, mc))
    except EOFError:
        break
