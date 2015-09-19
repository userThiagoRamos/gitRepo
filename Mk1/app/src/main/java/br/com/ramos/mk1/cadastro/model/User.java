package br.com.ramos.mk1.cadastro.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by casa on 17/09/2015.
 */
@DatabaseTable(tableName = "TB_USER")
public class User {


    @DatabaseField(generatedId = true)
    int id;

    @DatabaseField(columnName = "NAME_STR")
    private String name;

    @DatabaseField(columnName = "PASSWORD_STR")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
