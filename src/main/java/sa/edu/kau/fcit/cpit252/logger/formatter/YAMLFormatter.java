package sa.edu.kau.fcit.cpit252.logger.formatter;

import sa.edu.kau.fcit.cpit252.logger.handlers.BaseLogger;

public class YAMLFormatter extends FormatDecorator{
    public YAMLFormatter(BaseLogger logger){
        super.logger = logger;
    }
    public String getLabel() {
        return super.logger.getLabel()+", YAMLFormatter";
    }

    public String getLevel() {
        return  "Info " +super.logger.getLevel() ;
    }
}