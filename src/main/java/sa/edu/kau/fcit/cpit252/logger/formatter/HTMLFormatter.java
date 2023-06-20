package sa.edu.kau.fcit.cpit252.logger.formatter;
import sa.edu.kau.fcit.cpit252.logger.handlers.BaseLogger;

public class HTMLFormatter extends FormatDecorator{
    public HTMLFormatter(BaseLogger logger){
        super.logger = logger;
    }
    public String getLabel() {
        return super.logger.getLabel() +", HTMLFormatter";
    }

    public String getLevel() {
        return "Info "+ super.logger.getLevel();
    }
}