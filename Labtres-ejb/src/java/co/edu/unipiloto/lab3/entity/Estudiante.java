/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author paula
 */
@Entity
@Table
@NamedQueries(@NamedQuery(name ="Student.getAll",query = "SELECT e FROM Student e" ))
public class Estudiante implements Serializable{

    @Id
    //@Basic(optional = false)
    //@NotNull
   // @Column(name = "STUDENTID")
    private Integer studentId;
    //@Size(max = 50)
    //@Column(name = "FIRSTNAME")
    private String firstname;
    //@Size(max = 50)
    //@Column(name = "LASTNAME")
    private String lastname;
    //@Column(name = "YEARLEVEL")
    private Integer yearLevel;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Cursodelestudiante> studentCursoList;

    public Estudiante(Integer studentId, String firstname, String lastname, Integer yearLevel) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearLevel = yearLevel;
    }
    

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Estudiante(){
        
    }

    public Estudiante(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(Integer yearLevel) {
        this.yearLevel = yearLevel;
    }


    @XmlTransient
    public List<Cursodelestudiante> getStudentCursoList() {
        return studentCursoList;
    }

    public void setStudentCursoList(List<Cursodelestudiante> studentCursoList) {
        this.studentCursoList = studentCursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.lab3.entity.Student[ studentid=" + studentId + " ]";
    }
}
