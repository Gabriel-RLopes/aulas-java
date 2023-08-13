/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package store.src.main.java.br.com.store.beans;

import store.src.main.java.br.com.store.models.User;
import store.src.main.java.br.com.store.repositories.UserRepository;
import store.src.main.java.br.com.store.util.JPAUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;




/**
 *
 * @author grgab
 */
@ManagedBean( name = "portal" )
@SessionScoped
public class PortalBean implements Serializable {

    private final UserRepository userRepository;
    private User user;
    
    public User getUser(){
        return user;
    }
    
    public List<User> getAllUsers(){
        return userRepository.getAll();
    }
    /**
     * Creates a new instance of PortalBean
     */
    public PortalBean() {
        
        userRepository = new UserRepository( JPAUtil.getEntityManager() );
    }
    
    public String register(){
        user = new User();
        return "register";
    }
    
    public String list(){
        return "userlist";
    }
    
    public String confirm(){
        if ( UserRepository.create(user) ){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "usuario registrado com sucesso!" ));
            return "index";
        }else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(  FacesMessage.SEVERITY_ERROR, "erro ao registrar usuario", "Verifique os dados informados e tente novamente" ));
            return "register";
        }
    }
    
}
