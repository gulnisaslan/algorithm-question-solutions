function getGrade(score) {
    let grade;
    // Write your code here
    if(25<score || 30<=score){
        grade = "A"
    }else if(20<score||25<=score){
        grade = "B"
    }else if(15<score || 20<=score){
        grade="C"
    }else if(10<score || 15<=score){
        grade = "D"
    }
    else if(5<score||10<=score){
        grade = "E"
    }else if(0<=score || 5<=score){
        grade = "F"
    }
    
    return grade;
}