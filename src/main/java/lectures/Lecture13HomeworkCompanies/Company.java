package lectures.Lecture13HomeworkCompanies;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Getter
@Setter
public class Company {

    private String companyName;
    private String companyCreationDate;
    private String bulsatNumber;


    @Override
    public String toString(){
        return ("Company: " + companyName + " created: " + companyCreationDate + " with bulsat number " + bulsatNumber);
    }
}



//(int lenght){
//        return bulsatNumber(10)}



//    private String bulsatNumber(int lenght){
//        char[] uniqueId = new char[lenght];
//        String characters = "0123456789QWERTYUIOPASDFGHJKLZXCVBNM";
//
//        for (int i=0; i<lenght; i++){
//            uniqueId[i] = characters.toCharArray()[random.nextInt(10)];
//        }
//        log.info("Generated random bulsat number is: " + new String(uniqueId));
//        return new String(uniqueId);
//    }