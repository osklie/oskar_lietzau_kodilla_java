package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

    public class collectionTestSuite {

        private OddNumbersExterminator oddNumbersExterminator;
        @Before
        public void before(){
            System.out.println("Test Case: begin");
        }

        @After
        public void after(){
            System.out.println("Test Case: end");
        }

        @BeforeEach
        public void beforeClass(){
            oddNumbersExterminator = new OddNumbersExterminator();
        }

        @Test
        public void testOddNumbersExterminatorEmptyList(){
            //Given

            ArrayList<Integer> emptyList = new ArrayList<>();
            //When
            List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
            System.out.println("Testing empty list");
            //Then
            Assert.assertEquals(emptyList, resultList);
        }

        @Test
        public void testOddNumbersExterminatorNormalList(){
            //Given
            ArrayList<Integer> normalList = new ArrayList<>();
            normalList.add(1);
            normalList.add(2);
            normalList.add(5);
            normalList.add(2);
            normalList.add(1);
            normalList.add(4);
            normalList.add(10);

            ArrayList<Integer>expectedResultList = new ArrayList<>();
            expectedResultList.add(2);
            expectedResultList.add(2);
            expectedResultList.add(4);
            expectedResultList.add(10);
            //When
            List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
            System.out.println("Testing normal list");
            //Then
            Assert.assertEquals(expectedResultList, resultList);
        }
    }

