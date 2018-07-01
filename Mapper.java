import java.util.*;
/*
 * A utility class which maps the features of an attribute to corresponding integer values.
 * '?' is mapped to '0' for every attribute.
 */
public class Mapper {
	HashMap<String,Integer> hash;
	ArrayList<HashMap> list ;
	Mapper()
	{
		 hash=new HashMap<String,Integer>();
		 list=new ArrayList<HashMap>();
		 hash.put("?",0);             //age:
		 hash.put("left",1);
		 hash.put("right",2);
		 list.add(hash);

		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);               //workclass:
		 hash.put("Private",1);
		 hash.put("Self-emp-not-inc",2);
		 hash.put("Self-emp-inc",3);
		 hash.put("Federal-gov",4);
		 hash.put("Local-gov",5);
		 hash.put("State-gov",6);
		 hash.put("Without-pay",7);
		 hash.put("Never-worked",8);
		 list.add(hash);

		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);                  //fnlwgt:
		 hash.put("left",1);
		 hash.put("right",2);
		 list.add(hash);

		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);                     //education:
		 hash.put("Bachelors",1);
		 hash.put("Some-college",2);
		 hash.put("11th",3);
		 hash.put("HS-grad",4);
		 hash.put("Prof-school",5);
		 hash.put("Assoc-acdm",6);
		 hash.put("Assoc-voc",7);
		 hash.put("9th",8);
		 hash.put("7th-8th",9);
		 hash.put("12th",10);
		 hash.put("Masters",11);
		 hash.put("1st-4th",12);
		 hash.put("10th",13);
		 hash.put("Doctorate",14);
		 hash.put("5th-6th",15);
		 hash.put("Preschool",16);
		 list.add(hash);

		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);               //education-num:
		 hash.put("left",1);
		 hash.put("right",2);
		 list.add(hash);

		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);                   //marital-status:
		 hash.put("Married-civ-spouse",1);
		 hash.put("Divorced",2);
		 hash.put("Never-married",3);
		 hash.put("Separated",4);
		 hash.put("Widowed",5);
		 hash.put("Married-spouse-absent",6);
		 hash.put("Married-AF-spouse",7);
		 list.add(hash);

		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);                       //occupation:
		 hash.put("Tech-support",1);
		 hash.put("Craft-repair",2);
		 hash.put("Other-service",3);
		 hash.put("Sales",4);
		 hash.put("Exec-managerial",5);
		 hash.put("Prof-specialty",6);
		 hash.put("Handlers-cleaners",7);
		 hash.put("Machine-op-inspct",8);
		 hash.put("Adm-clerical",9);
		 hash.put("Farming-fishing",10);
		 hash.put("Transport-moving",11);
		 hash.put("Priv-house-serv",12);
		 hash.put("Protective-serv",13);
		 hash.put("Armed-Forces",14);
		 list.add(hash);

		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);                //relationship:
		 hash.put("Wife",1);
		 hash.put("Own-child",2);
		 hash.put("Husband",3);
		 hash.put("Not-in-family",4);
		 hash.put("Other-relative",5);
		 hash.put("Unmarried",6);
		 list.add(hash);

		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);                          //race:
		 hash.put("White",1);
		 hash.put("Asian-Pac-Islander",2);
		 hash.put("Amer-Indian-Eskimo",3);
		 hash.put("Other",4);
		 hash.put("Black",5);
		 list.add(hash);

		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);
		 hash.put("Female",1);
		 hash.put("Male",2);
		 list.add(hash);


		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);                //capital-gain:
		 hash.put("left",1);
		 hash.put("right",2);
		 list.add(hash);


		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);                  //capital-loss:
		 hash.put("left",1);
		 hash.put("right",2);
		 list.add(hash);


		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);                        //hours-per-week:
		 hash.put("left",1);
		 hash.put("right",2);
		 list.add(hash);


		 hash=new HashMap<String,Integer>();
		 hash.put("?",0);                           //native-country:
		 hash.put("United-States",1);
		 hash.put("Cambodia",2);
		 hash.put("England",3);
		 hash.put("Puerto-Rico",4);
		 hash.put("Canada",5);
		 hash.put("Germany",6);
		 hash.put("Outlying-US(Guam-USVI-etc)",7);
		 hash.put("India",8);
		 hash.put("Japan",9);
		 hash.put("Greece",10);
		 hash.put("South",11);
		 hash.put("China",12);
		 hash.put("Cuba",13);
		 hash.put("Iran",14);
		 hash.put("Honduras",15);
		 hash.put("Philippines",16);
		 hash.put("Italy",17);
		 hash.put("Poland",18);
		 hash.put("Jamaica",19);
		 hash.put("Vietnam",20);
		 hash.put("Mexico",21);
		 hash.put("Portugal",22);
		 hash.put("Ireland",23);
		 hash.put("France",24);
		 hash.put("Dominican-Republic",25);
		 hash.put("Laos",26);
		 hash.put("Ecuador",27);
		 hash.put("Taiwan",28);
		 hash.put("Haiti",29);
		 hash.put("Columbia",30);
		 hash.put("Hungary",31);
		 hash.put("Guatemala",32);
		 hash.put("Nicaragua",33);
		 hash.put("Scotland",34);
		 hash.put("Thailand",35);
		 hash.put("Yugoslavia",36);
		 hash.put("El-Salvador",37);
		 hash.put("Trinadad&Tobago",38);
		 hash.put("Peru",39);
		 hash.put("Hong",40);
		 hash.put("Holand-Netherlands",41);
		 list.add(hash);


	}

}



