package com.mager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
*
*  @author author
*/
public class Person implements Serializable {

    private static final long serialVersionUID = 1572920645719L;


    /**
    * 主键
    * 
    * isNullAble:0,defaultVal:
    */
    private String ID;

    /**
    * 
    * isNullAble:1
    */
    private String name;

    /**
    * 
    * isNullAble:1
    */
    private String old;

    /**
    * 
    * isNullAble:1
    */
    private String adress;


    public void setID(String ID){this.ID = ID;}

    public String getID(){return this.ID;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setOld(String old){this.old = old;}

    public String getOld(){return this.old;}

    public void setAdress(String adress){this.adress = adress;}

    public String getAdress(){return this.adress;}
    @Override
    public String toString() {
        return "person{" +
                "ID='" + ID + '\'' +
                "name='" + name + '\'' +
                "old='" + old + '\'' +
                "adress='" + adress + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Person set;

        private ConditionBuilder where;

        public UpdateBuilder set(Person set){
            this.set = set;
            return this;
        }

        public Person getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Person {
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> IDList;

        public List<String> getIDList(){return this.IDList;}


        private List<String> fuzzyID;

        public List<String> getFuzzyID(){return this.fuzzyID;}

        private List<String> rightFuzzyID;

        public List<String> getRightFuzzyID(){return this.rightFuzzyID;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> oldList;

        public List<String> getOldList(){return this.oldList;}


        private List<String> fuzzyOld;

        public List<String> getFuzzyOld(){return this.fuzzyOld;}

        private List<String> rightFuzzyOld;

        public List<String> getRightFuzzyOld(){return this.rightFuzzyOld;}
        private List<String> adressList;

        public List<String> getAdressList(){return this.adressList;}


        private List<String> fuzzyAdress;

        public List<String> getFuzzyAdress(){return this.fuzzyAdress;}

        private List<String> rightFuzzyAdress;

        public List<String> getRightFuzzyAdress(){return this.rightFuzzyAdress;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyID (List<String> fuzzyID){
            this.fuzzyID = fuzzyID;
            return this;
        }

        public QueryBuilder fuzzyID (String ... fuzzyID){
            this.fuzzyID = solveNullList(fuzzyID);
            return this;
        }

        public QueryBuilder rightFuzzyID (List<String> rightFuzzyID){
            this.rightFuzzyID = rightFuzzyID;
            return this;
        }

        public QueryBuilder rightFuzzyID (String ... rightFuzzyID){
            this.rightFuzzyID = solveNullList(rightFuzzyID);
            return this;
        }

        public QueryBuilder ID(String ID){
            setID(ID);
            return this;
        }

        public QueryBuilder IDList(String ... ID){
            this.IDList = solveNullList(ID);
            return this;
        }

        public QueryBuilder IDList(List<String> ID){
            this.IDList = ID;
            return this;
        }

        public QueryBuilder fetchID(){
            setFetchFields("fetchFields","ID");
            return this;
        }

        public QueryBuilder excludeID(){
            setFetchFields("excludeFields","ID");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder fuzzyOld (List<String> fuzzyOld){
            this.fuzzyOld = fuzzyOld;
            return this;
        }

        public QueryBuilder fuzzyOld (String ... fuzzyOld){
            this.fuzzyOld = solveNullList(fuzzyOld);
            return this;
        }

        public QueryBuilder rightFuzzyOld (List<String> rightFuzzyOld){
            this.rightFuzzyOld = rightFuzzyOld;
            return this;
        }

        public QueryBuilder rightFuzzyOld (String ... rightFuzzyOld){
            this.rightFuzzyOld = solveNullList(rightFuzzyOld);
            return this;
        }

        public QueryBuilder old(String old){
            setOld(old);
            return this;
        }

        public QueryBuilder oldList(String ... old){
            this.oldList = solveNullList(old);
            return this;
        }

        public QueryBuilder oldList(List<String> old){
            this.oldList = old;
            return this;
        }

        public QueryBuilder fetchOld(){
            setFetchFields("fetchFields","old");
            return this;
        }

        public QueryBuilder excludeOld(){
            setFetchFields("excludeFields","old");
            return this;
        }

        public QueryBuilder fuzzyAdress (List<String> fuzzyAdress){
            this.fuzzyAdress = fuzzyAdress;
            return this;
        }

        public QueryBuilder fuzzyAdress (String ... fuzzyAdress){
            this.fuzzyAdress = solveNullList(fuzzyAdress);
            return this;
        }

        public QueryBuilder rightFuzzyAdress (List<String> rightFuzzyAdress){
            this.rightFuzzyAdress = rightFuzzyAdress;
            return this;
        }

        public QueryBuilder rightFuzzyAdress (String ... rightFuzzyAdress){
            this.rightFuzzyAdress = solveNullList(rightFuzzyAdress);
            return this;
        }

        public QueryBuilder adress(String adress){
            setAdress(adress);
            return this;
        }

        public QueryBuilder adressList(String ... adress){
            this.adressList = solveNullList(adress);
            return this;
        }

        public QueryBuilder adressList(List<String> adress){
            this.adressList = adress;
            return this;
        }

        public QueryBuilder fetchAdress(){
            setFetchFields("fetchFields","adress");
            return this;
        }

        public QueryBuilder excludeAdress(){
            setFetchFields("excludeFields","adress");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Person build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> IDList;

        public List<String> getIDList(){return this.IDList;}


        private List<String> fuzzyID;

        public List<String> getFuzzyID(){return this.fuzzyID;}

        private List<String> rightFuzzyID;

        public List<String> getRightFuzzyID(){return this.rightFuzzyID;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> oldList;

        public List<String> getOldList(){return this.oldList;}


        private List<String> fuzzyOld;

        public List<String> getFuzzyOld(){return this.fuzzyOld;}

        private List<String> rightFuzzyOld;

        public List<String> getRightFuzzyOld(){return this.rightFuzzyOld;}
        private List<String> adressList;

        public List<String> getAdressList(){return this.adressList;}


        private List<String> fuzzyAdress;

        public List<String> getFuzzyAdress(){return this.fuzzyAdress;}

        private List<String> rightFuzzyAdress;

        public List<String> getRightFuzzyAdress(){return this.rightFuzzyAdress;}

        public ConditionBuilder fuzzyID (List<String> fuzzyID){
            this.fuzzyID = fuzzyID;
            return this;
        }

        public ConditionBuilder fuzzyID (String ... fuzzyID){
            this.fuzzyID = solveNullList(fuzzyID);
            return this;
        }

        public ConditionBuilder rightFuzzyID (List<String> rightFuzzyID){
            this.rightFuzzyID = rightFuzzyID;
            return this;
        }

        public ConditionBuilder rightFuzzyID (String ... rightFuzzyID){
            this.rightFuzzyID = solveNullList(rightFuzzyID);
            return this;
        }

        public ConditionBuilder IDList(String ... ID){
            this.IDList = solveNullList(ID);
            return this;
        }

        public ConditionBuilder IDList(List<String> ID){
            this.IDList = ID;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder fuzzyOld (List<String> fuzzyOld){
            this.fuzzyOld = fuzzyOld;
            return this;
        }

        public ConditionBuilder fuzzyOld (String ... fuzzyOld){
            this.fuzzyOld = solveNullList(fuzzyOld);
            return this;
        }

        public ConditionBuilder rightFuzzyOld (List<String> rightFuzzyOld){
            this.rightFuzzyOld = rightFuzzyOld;
            return this;
        }

        public ConditionBuilder rightFuzzyOld (String ... rightFuzzyOld){
            this.rightFuzzyOld = solveNullList(rightFuzzyOld);
            return this;
        }

        public ConditionBuilder oldList(String ... old){
            this.oldList = solveNullList(old);
            return this;
        }

        public ConditionBuilder oldList(List<String> old){
            this.oldList = old;
            return this;
        }

        public ConditionBuilder fuzzyAdress (List<String> fuzzyAdress){
            this.fuzzyAdress = fuzzyAdress;
            return this;
        }

        public ConditionBuilder fuzzyAdress (String ... fuzzyAdress){
            this.fuzzyAdress = solveNullList(fuzzyAdress);
            return this;
        }

        public ConditionBuilder rightFuzzyAdress (List<String> rightFuzzyAdress){
            this.rightFuzzyAdress = rightFuzzyAdress;
            return this;
        }

        public ConditionBuilder rightFuzzyAdress (String ... rightFuzzyAdress){
            this.rightFuzzyAdress = solveNullList(rightFuzzyAdress);
            return this;
        }

        public ConditionBuilder adressList(String ... adress){
            this.adressList = solveNullList(adress);
            return this;
        }

        public ConditionBuilder adressList(List<String> adress){
            this.adressList = adress;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Person obj;

        public Builder(){
            this.obj = new Person();
        }

        public Builder ID(String ID){
            this.obj.setID(ID);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder old(String old){
            this.obj.setOld(old);
            return this;
        }
        public Builder adress(String adress){
            this.obj.setAdress(adress);
            return this;
        }
        public Person build(){return obj;}
    }

}
