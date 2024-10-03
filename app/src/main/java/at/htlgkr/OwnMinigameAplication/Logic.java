package at.htlgkr.OwnMinigameAplication;

import android.media.MediaCodec;
import android.os.Build;
import android.widget.RadioButton;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.text.FieldPosition;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import at.htlgkr.OwnMinigameAplication.databinding.FragmentMiniGameBinding;

public class Logic {

    public Question getQuestion(List<Question>tempList){
        Question question;

        for (int i= 1;i < tempList.size(); i++){
           question = tempList.get(i);
           if (question.isQuestionDone() == false){
               question.setQuestionDone(true);
               return question;
           }
       }
        return null;
    }


    public boolean checkIfCorrect(String radioButton, Question question){
        String correctAwnser = question.getCorrectOption();
        if (radioButton.equals(correctAwnser)){
            return true;
        }
        return false;
    }





}
