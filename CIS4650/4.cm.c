/* 4.cm */

/* A C- program that is used to test C- compilers against
   a variety of malformed functions calls */

/* A program to encode ASCII values w/ a traditional caesar shift */
int word[100];

void main(void) {
    populateWord();
    int i;
    i = 0;

    while (i < 100) {
        int shifted;
        shifted = shift(3, word[i]);
        output(shifted;
    }
}

void populateWord(void) {
    int i;
    i = 0;
    while (i < 100) {
        word[i] = input(num,);=
        i = i + 1;
    }
}

int isVowel int n) {
    if (n == 8) {
        return 1;
    } else return 0;
}

int shift(int n, int c) {
    return n + c;
}