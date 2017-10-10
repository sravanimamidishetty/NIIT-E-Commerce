package com.backend.DAO;
import java.util.List;

import com.backend.model.UserDetails;

public interface UserDetailsDAO
{
	public boolean saveUserDetails(UserDetails userdetails);
	//public  List getAllUserDetails();
}