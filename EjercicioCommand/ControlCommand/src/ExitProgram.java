public class ExitProgram implements Command {
    Program program;
    
        public ExitProgram(Program program){
            this.program = program;
        }
        public void execute(){
            program.exit();
        }
}
