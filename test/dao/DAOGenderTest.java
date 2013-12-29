

/**
 * DAOGenderTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package dao;

    /*
     *  DAOGenderTest Junit test case
    */

    public class DAOGenderTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testget() throws java.lang.Exception{

        dao.DAOGenderStub stub =
                    new dao.DAOGenderStub();//the default implementation should point to the right endpoint

           dao.DAOGenderStub.Get get14=
                                                        (dao.DAOGenderStub.Get)getTestObject(dao.DAOGenderStub.Get.class);
                    // TODO : Fill in the get14 here
                
                        assertNotNull(stub.get(
                        get14));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartget() throws java.lang.Exception{
            dao.DAOGenderStub stub = new dao.DAOGenderStub();
             dao.DAOGenderStub.Get get14=
                                                        (dao.DAOGenderStub.Get)getTestObject(dao.DAOGenderStub.Get.class);
                    // TODO : Fill in the get14 here
                

                stub.startget(
                         get14,
                    new tempCallbackN65548()
                );
              


        }

        private class tempCallbackN65548  extends dao.DAOGenderCallbackHandler{
            public tempCallbackN65548(){ super(null);}

            public void receiveResultget(
                         dao.DAOGenderStub.GetResponse result
                            ) {
                
            }

            public void receiveErrorget(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testlist() throws java.lang.Exception{

        dao.DAOGenderStub stub =
                    new dao.DAOGenderStub();//the default implementation should point to the right endpoint

           dao.DAOGenderStub.List list16=
                                                        (dao.DAOGenderStub.List)getTestObject(dao.DAOGenderStub.List.class);
                    // TODO : Fill in the list16 here
                
                        assertNotNull(stub.list(
                        list16));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartlist() throws java.lang.Exception{
            dao.DAOGenderStub stub = new dao.DAOGenderStub();
             dao.DAOGenderStub.List list16=
                                                        (dao.DAOGenderStub.List)getTestObject(dao.DAOGenderStub.List.class);
                    // TODO : Fill in the list16 here
                

                stub.startlist(
                         list16,
                    new tempCallbackN65589()
                );
              


        }

        private class tempCallbackN65589  extends dao.DAOGenderCallbackHandler{
            public tempCallbackN65589(){ super(null);}

            public void receiveResultlist(
                         dao.DAOGenderStub.ListResponse result
                            ) {
                
            }

            public void receiveErrorlist(java.lang.Exception e) {
                fail();
            }

        }
      
          /**
          * Auto generated test method
          */
          public  void testsave() throws java.lang.Exception{

          dao.DAOGenderStub stub =
          new dao.DAOGenderStub();//the default implementation should point to the right endpoint
          dao.DAOGenderStub.Save save18=
                  (dao.DAOGenderStub.Save)getTestObject(dao.DAOGenderStub.Save.class);
                      // TODO : Fill in the save18 here
                  

                  //There is no output to be tested!
                  stub.save(
                  save18);

              
          }
      
          /**
          * Auto generated test method
          */
          public  void testremove() throws java.lang.Exception{

          dao.DAOGenderStub stub =
          new dao.DAOGenderStub();//the default implementation should point to the right endpoint
          dao.DAOGenderStub.Remove remove19=
                  (dao.DAOGenderStub.Remove)getTestObject(dao.DAOGenderStub.Remove.class);
                      // TODO : Fill in the remove19 here
                  

                  //There is no output to be tested!
                  stub.remove(
                  remove19);

              
          }
      
          /**
          * Auto generated test method
          */
          public  void testupdate() throws java.lang.Exception{

          dao.DAOGenderStub stub =
          new dao.DAOGenderStub();//the default implementation should point to the right endpoint
          dao.DAOGenderStub.Update update20=
                  (dao.DAOGenderStub.Update)getTestObject(dao.DAOGenderStub.Update.class);
                      // TODO : Fill in the update20 here
                  

                  //There is no output to be tested!
                  stub.update(
                  update20);

              
          }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    