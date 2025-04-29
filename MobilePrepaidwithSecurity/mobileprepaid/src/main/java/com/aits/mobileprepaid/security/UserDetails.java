package com.aits.mobileprepaid.security;

import java.util.Collection;

public interface UserDetails {

	String getUsername();

	String getPassword();

	boolean isAccountNonExpired();

	boolean isAccountNonLocked();

	boolean isCredentialsNonExpired();

	boolean isEnabled();

	Collection<? extends GrantedAuthority> getAuthorities();

}
