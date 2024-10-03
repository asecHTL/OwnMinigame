package at.htlgkr.OwnMinigameAplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import at.htlgkr.OwnMinigameAplication.databinding.ActivityMainBinding;
import at.htlgkr.OwnMinigameAplication.databinding.FragmentMiniGameBinding;

public class MiniGameFragment extends Fragment {
    List<Question> list;
    Logic logic = new Logic();
    private FragmentMiniGameBinding binding;
    static Question questionRightNow;
    static int points = 0;


    public MiniGameFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMiniGameBinding.inflate(inflater,container,false);

        //Question Array wir gelessen
        list = Question.getAllQuestions();
        //Wenn Submit Button gedrückt wird --> Überprüfen ob mehr als 1 Radio Button gedrückt ist
        //Wenn ja --> Clear Methode und Alert das mehrer Button gedrückt wurden und das man es erneut eigeben muss
        //Wenn nein --> Überpüfen ob Question Correct beantwortet wurde
        binding.btSubmitQuestions.setOnClickListener(view->{
            checkRadioButtonClicked();
            if (binding.rbA.isChecked()){
                boolean tempA = logic.checkIfCorrect("A",questionRightNow);
                if (tempA){
                    try {
                        binding.tvMessage.setText("Toll das war korekt!");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    points++;
                    binding.tvPoints.setText(String.valueOf(points));
                    setNextQuestion();
                    resetButtons();
                }else{
                    try {
                        binding.tvMessage.setText("Das war nix :(((");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    resetButtons();
                }
            } else if (binding.rbB.isChecked()) {
                boolean tempB = logic.checkIfCorrect("B",questionRightNow);
                if (tempB){
                    try {
                        binding.tvMessage.setText("Toll das war korekt!");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    points++;
                    binding.tvPoints.setText(String.valueOf(points));
                    setNextQuestion();
                    resetButtons();
                }else{
                    try {
                        binding.tvMessage.setText("Das war nix :(((");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    resetButtons();
                }
            } else if (binding.rbC.isChecked()) {
                boolean tempC = logic.checkIfCorrect("C",questionRightNow);
                if (tempC){
                    try {
                        binding.tvMessage.setText("Toll das war korekt!");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    points++;
                    binding.tvPoints.setText(String.valueOf(points));
                    setNextQuestion();
                    resetButtons();
                }else{
                    try {
                        binding.tvMessage.setText("Das war nix :(((");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    resetButtons();
                }
            }
        });
        binding.btClear.setOnClickListener(view ->{
            resetButtons();
        });
        binding.btStartingQuestion.setOnClickListener(view -> {
            questionRightNow = list.get(0);
            binding.tvQuestions.setText(questionRightNow.getQuestion());
            binding.tvOptionA.setText(questionRightNow.getOptionA());
            binding.tvOptionB.setText(questionRightNow.getOptionB());
            binding.tvOptionC.setText(questionRightNow.getOptionC());
        });


        return binding.getRoot();
    }

    public void checkRadioButtonClicked(){
        if (binding.rbA.isChecked() && binding.rbB.isChecked() || binding.rbA.isChecked() && binding.rbC.isChecked() || binding.rbB.isChecked() && binding.rbC.isChecked()){
            resetButtons();
        }
    }

    public void resetButtons(){
        binding.rbA.setChecked(false);
        binding.rbA.setClickable(true);
        binding.rbB.setChecked(false);
        binding.rbB.setClickable(true);
        binding.rbC.setChecked(false);
        binding.rbC.setClickable(true);
        binding.tvMessage.setText(null);
    }

    public void setNextQuestion(){
        questionRightNow = logic.getQuestion(list);
        binding.tvQuestions.setText(questionRightNow.getQuestion());
        binding.tvOptionA.setText(questionRightNow.getOptionA());
        binding.tvOptionB.setText(questionRightNow.getOptionB());
        binding.tvOptionC.setText(questionRightNow.getOptionC());
    }
}