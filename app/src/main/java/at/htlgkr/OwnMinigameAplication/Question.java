package at.htlgkr.OwnMinigameAplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Question {
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String correctOption;
    private boolean questionDone;

    private List<Question>questions;

    public Question(String question, String optionA, String optionB, String optionC, String correctOption, boolean questionDone) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.correctOption = correctOption;
        this.questionDone = questionDone;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    public boolean isQuestionDone() {
        return questionDone;
    }

    public void setQuestionDone(boolean questionDone) {
        this.questionDone = questionDone;
    }

    public static List<Question> getAllQuestions(){


        List<Question> questions = new LinkedList<>();

        questions.add(new Question("Was ist die Hauptstadt von Deutschland", "Berlin", "Hamburg", "München", "A", false));
        questions.add(new Question("Welches Element hat das chemische Symbol O?", "Gold", "Sauerstoff", "Silber", "B", false));
        questions.add(new Question("Wie viele Kontinente gibt es auf der Erde?", "5", "6", "7", "C", false));
        questions.add(new Question("Wer schrieb 'Die Verwandlung'?", "Herman Hesse", "Franz Kafka", "Thomas Mann", "B", false));
        questions.add(new Question("Was ist der größte Planet in unserem Sonnensystem?", "Erde", "Jupiter", "Mars", "B", false));
        questions.add(new Question("Was ist die kleinste Einheit des Lebens?", "Zelle", "Molekül", "Organismus", "A", false));
        questions.add(new Question("Wer malte die Mona Lisa?", "Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "C", false));
        questions.add(new Question("In welchem Jahr landete die erste Menschheit auf dem Mond?", "1969", "1972", "1965", "A", false));
        questions.add(new Question("Was ist der längste Fluss der Welt?", "Nil", "Amazonas", "Yangtse", "B", false));
        questions.add(new Question("Welches Tier ist das größte an Land?", "Elefant", "Blauwal", "Giraffe", "A", false));
        questions.add(new Question("Wie viele Bundesländer hat Deutschland?", "16", "14", "18", "A", false));
        questions.add(new Question("Wer erfand das Telefon?", "Thomas Edison", "Alexander Graham Bell", "Nikola Tesla", "B", false));
        questions.add(new Question("Was ist die Hauptsprache in Brasilien?", "Spanisch", "Portugiesisch", "Französisch", "B", false));
        questions.add(new Question("Welcher Planet ist bekannt als der Rote Planet?", "Mars", "Venus", "Saturn", "A", false));
        questions.add(new Question("Was ist der chemische Begriff für Wasser?", "H2O", "CO2", "NaCl", "A", false));
        questions.add(new Question("Welcher Kontinent ist der größte?", "Afrika", "Asien", "Europa", "B", false));
        questions.add(new Question("Welches Gas ist am häufigsten in der Erdatmosphäre?", "Sauerstoff", "Stickstoff", "Kohlenstoffdioxid", "B", false));
        questions.add(new Question("Was ist das Symbol für Gold im Periodensystem?", "Au", "Ag", "Fe", "A", false));
        questions.add(new Question("Wie viele Planeten hat unser Sonnensystem?", "7", "8", "9", "B", false));
        questions.add(new Question("In welchem Jahr begann der Erste Weltkrieg?", "1914", "1939", "1918", "A", false));
        questions.add(new Question("Wer schrieb 'Romeo und Julia'?", "Johann Wolfgang von Goethe", "William Shakespeare", "Leo Tolstoi", "B", false));
        questions.add(new Question("Wie heißt das kleinste Land der Welt?", "Vatikanstadt", "Monaco", "Liechtenstein", "A", false));
        questions.add(new Question("Welche Farben hat die Flagge von Frankreich?", "Blau, Weiß, Rot", "Grün, Weiß, Rot", "Rot, Gelb, Schwarz", "A", false));
        questions.add(new Question("Wer war der erste Präsident der Vereinigten Staaten?", "Abraham Lincoln", "George Washington", "Thomas Jefferson", "B", false));
        questions.add(new Question("Welches Metall hat das Symbol 'Fe'?", "Eisen", "Kupfer", "Zink", "A", false));
        questions.add(new Question("Welche Stadt liegt am berühmten Kolosseum?", "Rom", "Paris", "Athen", "A", false));
        questions.add(new Question("Welcher Planet ist der Sonne am nächsten?", "Mars", "Merkur", "Venus", "B", false));
        questions.add(new Question("Wer malte das Deckengemälde der Sixtinischen Kapelle?", "Leonardo da Vinci", "Michelangelo", "Raphael", "B", false));
        questions.add(new Question("Wie viele Zähne hat ein erwachsener Mensch normalerweise?", "28", "32", "30", "B", false));
        questions.add(new Question("Welches Land ist flächenmäßig das größte?", "Kanada", "China", "Russland", "C", false));
        questions.add(new Question("In welcher Einheit wird elektrische Leistung gemessen?", "Watt", "Volt", "Ampere", "A", false));
        questions.add(new Question("Welches ist das am häufigsten vorkommende Metall in der Erdkruste?", "Aluminium", "Eisen", "Kupfer", "A", false));
        questions.add(new Question("Welche Sprache hat die meisten Muttersprachler weltweit?", "Englisch", "Spanisch", "Mandarin", "C", false));
        questions.add(new Question("Wer komponierte die 9. Sinfonie?", "Ludwig van Beethoven", "Johann Sebastian Bach", "Wolfgang Amadeus Mozart", "A", false));
        questions.add(new Question("In welchem Jahr fiel die Berliner Mauer?", "1989", "1991", "1987", "A", false));
        questions.add(new Question("Was ist das kleinste Organ im menschlichen Körper?", "Gallenblase", "Thymusdrüse", "Stirnbein", "B", false));
        questions.add(new Question("Wie viele Tasten hat ein klassisches Klavier?", "88", "76", "92", "A", false));
        questions.add(new Question("Wer schrieb 'Der Alte Mann und das Meer'?", "Ernest Hemingway", "F. Scott Fitzgerald", "Mark Twain", "A", false));
        questions.add(new Question("Welche Farbe hat der Blutmond?", "Blau", "Rot", "Gelb", "B", false));
        questions.add(new Question("Welches Land hat die längste Küstenlinie der Welt?", "Australien", "Kanada", "Indonesien", "B", false));

        return questions;
    }
}
