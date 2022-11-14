quests = document.querySelectorAll(".quest");
next = document.querySelector("#next");
result = document.querySelector("#result label");
corrects = [0, 1, 2, 3, 2, 3, 2, 3, 3, 3, 2];
answers = [];
currentQuest = 0;
score = 0;

next.addEventListener('click', () => {
    hideDesctiption();
    if (currentQuest <= 10){
        correctnessCheck();
        nextQuesttion();
    }
    if (currentQuest > 10){
        next.classList.add("hidden");
        let i = 1;
        quests.forEach(quest => {
            let evaluation;
            switch (score){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    evaluation = "плохой";
                break;
                case 5:
                case 6:
                case 7:
                case 8:
                    evaluation = "хороший";
                break;
                case 9:
                case 10:
                    evaluation = "отличный";
                break;
            }
            quest.classList.remove("hidden");
            console.log(answers);
            console.log(corrects);
            if (answers[i] == corrects[i]){
                quest.setAttribute('style', 'background-color: #77dd77');
            } else {
                quest.setAttribute('style', 'background-color: #CC6000');
            }
            result.innerHTML = `Вы ответили правильно на ${score}/10 вопросов. Это ${evaluation} результат.`
            i++;
        })
    }
});

function hideDesctiption(){
    document.querySelector("#description").classList.add("hidden");
}
function correctnessCheck(){
    let answer = undefined;
    buttons = document.getElementsByName("quest" + currentQuest);

    for (let i = 0; i < buttons.length; i++) {
        if (buttons[i].checked) {
            answer = buttons[i].value;
            if (corrects[currentQuest] == buttons[i].value) {
                score++;
            }
        }
    }
    if (answer){
        answers.push(answer);
    }else{
        answers.push(0);
    }
}
function nextQuesttion(){
    if (quests[currentQuest - 1]){
        quests[currentQuest - 1].classList.add("hidden");
    }
    if (currentQuest < 10){
        quests[currentQuest].classList.remove("hidden");
    }
    currentQuest++;
}
