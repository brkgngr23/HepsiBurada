package com.hepsiburada.test.services.petstore;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hepsiburada.actions.services.PetStoreAction;
import com.hepsiburada.base.ServicesAbstractTest;


public class DeleteUpdateAnExistinPet extends ServicesAbstractTest {
	PetStoreAction ps;
@BeforeMethod
public void Before (Method method) {
	ps=new PetStoreAction();
}

@Test
public void deleteUpdateAnExistingPet()  {

ps.deleteUpdateAnExistinPet();
}

}