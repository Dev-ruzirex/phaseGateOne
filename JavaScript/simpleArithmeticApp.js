function runSimpleArithmeticApp() {
  

    const start = Date.now();

    let score = 0;

    for (let count = 1; count <= 10; count++) {
        const correct = askSubtractionQuestion();
        if (correct) score++;

        console.log(`Scores: ${score} out of ${count}\n`);
    }

    const timeTaken = Math.floor((Date.now() - start) / 1000);
    showResults(score, 10, timeTaken);
}

function askSubtractionQuestion() {
    const firstDigit = randomNumber(1, 100);
    const secondDigit = randomNumber(1, firstDigit);
    const answer = firstDigit - secondDigit;

    for (let attempt = 1; attempt <= 2; attempt++) {
        const guess = Number(prompt(`{secondDigit} - {secondDigit} = `));

        if (guess === answer) {
            console.log("Great job!");
            return true;
        }

        console.log("Try again!");
    }

    console.log(`The answer was ${answer}.`);
    return false;
}

function randomNumber(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

function showResults(score, total, time) {
    console.log("=== All Done! ===");
    console.log(`You answered ${score} out of ${total} correctly.`);

    const percent = Math.floor((score / total) * 100);
    console.log(`You scored ${percent}%.`);
    console.log(`You played for ${time} seconds.`);
}

runSimpleArithmeticApp();

