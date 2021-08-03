package com.akeemadeoti.trivia.data;

import com.akeemadeoti.trivia.model.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<Question> questionArrayList);
}
