package main.java.com.kanamen10.alexahello;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;

import main.java.com.kanamen10.alexahello.CancelandStopIntentHandler;
import main.java.com.kanamen10.alexahello.HelloWorldIntentHandler;
import main.java.com.kanamen10.alexahello.HelpIntentHandler;
import main.java.com.kanamen10.alexahello.SessionEndedRequestHandler;
import main.java.com.kanamen10.alexahello.LaunchRequestHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }

}