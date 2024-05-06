package com.example.expensesmanagerapp.Utiles;

import com.example.expensesmanagerapp.R;
import com.example.expensesmanagerapp.fragment.Category_Model;

import java.util.ArrayList;

public class Constant {
    public static String INCOME  = "INCOME";
    public static String EXPENSES  = "EXPENSES";

    //Declaring static ArrayList of Category_Model, for calling without creating several time its obj
   public static ArrayList<Category_Model> categoryModelArrayList;
    public static void setCategories(){

        //ArrayList of Category_Model with its instance
        categoryModelArrayList = new ArrayList<>();

        //adding data to constructor of Category_Model
        categoryModelArrayList.add(new Category_Model("Salary",R.drawable.salary,R.color.category1));
        categoryModelArrayList.add(new Category_Model("Business",R.drawable.firm,R.color.category2));
        categoryModelArrayList.add(new Category_Model("Investment",R.drawable.investment,R.color.category3));
        categoryModelArrayList.add(new Category_Model("Loan",R. drawable.loan,R.color.category4));
        categoryModelArrayList.add(new Category_Model("Rent",R.drawable.rent,R.color.category5));
        categoryModelArrayList.add(new Category_Model("Other",R.drawable.other_menu,R.color.category6));
    }

    public static Category_Model getCategoryDetails(String categoryName){
        for (Category_Model cat:categoryModelArrayList) {

            if (cat.getCategoryName().equals(categoryName)){
                return cat;
            }
        }

        return null;
    }
}
