package glade.constants.program;

import glade.constants.Files;
import glade.program.ProgramDataUtils.MultiFileProgramExamples;
import glade.program.ProgramDataUtils.ProgramData;
import glade.program.ProgramDataUtils.ProgramExamples;
import glade.program.ProgramDataUtils.ShellProgramData;
import glade.util.OracleUtils.IdentityWrapper;
import glade.util.ShellUtils.CommandFactory;
import glade.util.Utils.ConstantFilter;
import glade.util.Utils.Filter;


public class JsonData {
	public static final String JSON_GCOV = "json/libjson-master/";
	public static final String JSON_EXE = "json/libjson-master/jsonlint";
	public static final boolean JSON_IS_ERROR = true;
	
	public static final String JSON_EXTENSION = ".json";
	public static final String JSON_EMPTY = ""; //what is this supposed to mean?
	
	
	
	public static final String JSON_NAME = "json";
	public static final ProgramData JSON_DATA = new ShellProgramData(Files.FILE_PARAMETERS, JSON_EXE, JSON_GCOV, JSON_IS_ERROR);
	public static final ProgramExamples JSON_EXAMPLES = new MultiFileProgramExamples(Files.FILE_PARAMETERS, JSON_NAME, JSON_EXTENSION, JSON_EMPTY, new IdentityWrapper());
	public static final Filter<String> JSON_FILTER = new ConstantFilter<String>(public boolean filter(String s) { return !s.trim().contains("\n"); }};
	
}
