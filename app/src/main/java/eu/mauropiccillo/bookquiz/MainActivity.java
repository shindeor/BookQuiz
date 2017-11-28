package eu.mauropiccillo.bookquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Handle the clicks on radio buttons to empty the according RadioGroup
     */
    public void emptyClicks(View view) {
        RadioGroup rg = (RadioGroup) view.getParent();
        switch (rg.getId()) {
            case R.id.question_1_1:
                RadioGroup questionOneTwo = (RadioGroup) findViewById(R.id.question_1_2);
                questionOneTwo.clearCheck();
                break;
            case R.id.question_1_2:
                RadioGroup questionOneOne = (RadioGroup) findViewById(R.id.question_1_1);
                questionOneOne.clearCheck();
                break;
            case R.id.question_2_1:
                RadioGroup questionTwoTwo = (RadioGroup) findViewById(R.id.question_2_2);
                questionTwoTwo.clearCheck();
                break;
            case R.id.question_2_2:
                RadioGroup questionTwoOne = (RadioGroup) findViewById(R.id.question_2_1);
                questionTwoOne.clearCheck();
                break;
            case R.id.question_3_1:
                RadioGroup questionThreeTwo = (RadioGroup) findViewById(R.id.question_3_2);
                questionThreeTwo.clearCheck();
                break;
            case R.id.question_3_2:
                RadioGroup questionThreeOne = (RadioGroup) findViewById(R.id.question_3_1);
                questionThreeOne.clearCheck();
                break;
            case R.id.question_4_1:
                RadioGroup questionFourTwo = (RadioGroup) findViewById(R.id.question_4_2);
                questionFourTwo.clearCheck();
                break;
            case R.id.question_4_2:
                RadioGroup questionFourOne = (RadioGroup) findViewById(R.id.question_4_1);
                questionFourOne.clearCheck();
                break;
            case R.id.question_5_1:
                RadioGroup questionFiveTwo = (RadioGroup) findViewById(R.id.question_5_2);
                questionFiveTwo.clearCheck();
                break;
            case R.id.question_5_2:
                RadioGroup questionFiveOne = (RadioGroup) findViewById(R.id.question_5_1);
                questionFiveOne.clearCheck();
                break;
            case R.id.question_9_1:
                RadioGroup questionNineTwo = (RadioGroup) findViewById(R.id.question_9_2);
                questionNineTwo.clearCheck();
                break;
            case R.id.question_9_2:
                RadioGroup questionNineOne = (RadioGroup) findViewById(R.id.question_9_1);
                questionNineOne.clearCheck();
                break;
            case R.id.question_10_1:
                RadioGroup questionTenTwo = (RadioGroup) findViewById(R.id.question_10_2);
                questionTenTwo.clearCheck();
                break;
            case R.id.question_10_2:
                RadioGroup questionTenOne = (RadioGroup) findViewById(R.id.question_10_1);
                questionTenOne.clearCheck();
                break;

        }
    }

    /**
     * Calculate Score
     */
    public int getScore(View view){
        int score = 0;
        RadioButton answerOne = (RadioButton) findViewById(R.id.one_correct);
        RadioButton answerTwo = (RadioButton) findViewById(R.id.two_correct);
        RadioButton answerThree = (RadioButton) findViewById(R.id.three_correct);
        RadioButton answerFour = (RadioButton) findViewById(R.id.four_correct);
        RadioButton answerFive = (RadioButton) findViewById(R.id.five_correct);
        RadioButton answerNine = (RadioButton) findViewById(R.id.nine_correct);
        RadioButton answerTen = (RadioButton) findViewById(R.id.ten_correct);
        CheckBox answerSixOne = (CheckBox) findViewById(R.id.answer_six_one);
        CheckBox answerSixTwo = (CheckBox) findViewById(R.id.answer_six_two);
        CheckBox answerSixThree = (CheckBox) findViewById(R.id.answer_six_three);
        CheckBox answerSixFour = (CheckBox) findViewById(R.id.answer_six_four);
        CheckBox answerSevenOne = (CheckBox) findViewById(R.id.answer_seven_one);
        CheckBox answerSevenTwo = (CheckBox) findViewById(R.id.answer_seven_two);
        CheckBox answerSevenThree = (CheckBox) findViewById(R.id.answer_seven_three);
        CheckBox answerSevenFour = (CheckBox) findViewById(R.id.answer_seven_four);
        CheckBox answerEightOne = (CheckBox) findViewById(R.id.answer_eight_one);
        CheckBox answerEightTwo = (CheckBox) findViewById(R.id.answer_eight_two);
        CheckBox answerEightThree = (CheckBox) findViewById(R.id.answer_eight_three);
        CheckBox answerEightFour = (CheckBox) findViewById(R.id.answer_eight_four);

        //Check Question 1
        if (answerOne.isChecked()) {
            score++;
        }
        //Check Question 2
        if (answerTwo.isChecked()) {
            score++;
        }
        //Check Question 3
        if (answerThree.isChecked()) {
            score++;
        }
        //Check Question 4
        if (answerFour.isChecked()) {
            score++;
        }
        //Check Question 5
        if (answerFive.isChecked()) {
            score++;
        }
        //Check Question 6
        if (answerSixOne.isChecked()) {
            score--;
        }
        if (answerSixTwo.isChecked()) {
            score++;
        }
        if (answerSixThree.isChecked()) {
            score++;
        }
        if (answerSixFour.isChecked()) {
            score--;
        }
        //Check Question 7
        if (answerSevenOne.isChecked()) {
            score++;
        }
        if (answerSevenTwo.isChecked()) {
            score++;
        }
        if (answerSevenThree.isChecked()) {
            score--;
        }
        if (answerSevenFour.isChecked()) {
            score--;
        }
        //Check Question 8
        if (answerEightOne.isChecked()) {
            score--;
        }
        if (answerEightTwo.isChecked()) {
            score++;
        }
        if (answerEightThree.isChecked()) {
            score++;
        }
        if (answerEightFour.isChecked()) {
            score--;
        }
        //Check Question 9
        if (answerNine.isChecked()) {
            score++;
        }
        //Check Question 10
        if (answerTen.isChecked()) {
            score++;
        }
        toastResult(score);
        return score;
    }

    public void toastResult(int score) {
        EditText playerNameText = (EditText) findViewById(R.id.user_name);
        String playerName = playerNameText.getText().toString();
        Context context = getApplicationContext();
        CharSequence text = "Thanks for taking the test " + playerName +"!\nYou got "+score+" out of 13 points!";
        if (playerName.equals("")) {
            text = "Write your name to find out your score!";
        }
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
