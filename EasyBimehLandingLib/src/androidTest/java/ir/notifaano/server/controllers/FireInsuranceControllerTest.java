/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.controllers;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import ir.notifaano.server.models.*;
import ir.notifaano.server.exceptions.*;
import ir.notifaano.server.APIHelper;
import ir.notifaano.server.Configuration;
import ir.notifaano.server.testing.TestHelper;
import ir.notifaano.server.controllers.FireInsuranceController;
import ir.notifaano.server.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class FireInsuranceControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static FireInsuranceController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getFireInsurance();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

}
