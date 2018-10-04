# Spring-Batch-Sample
Sample application to test spring batch capabilities

Major endpoint :  <br/>
/run    ---> which is used to trigger the batch job, for now it reads the data from the mongodb and saves it to an xml file<br/>

other endpoints: (Mongo curd operations)<br/>
/save   ---> saves a file to report collection in test DB<br/>
/getall    ---> gets all the documents in json string<br/>
/deleteall  ---> delets all the documents from colleciton<br/>
/delete/{id} ---> deletes based on id<br/><br/><br/>


When running for the first time hit the /save endpoint atleast once, so that report collection is created in test DB inside mongo.<br/>
Then when we hit the /run endpoint we get the data in mongo saved into a xml file named mongo.xml in xml folder of root.<br/><br/>

We can even add scheduling to our method, which hits mongo at a regular interval and copies that to our xml file.<br/>

===================================================================

Before starting this application, install mongoDb in your machine and run in locally,

Mongo SetUp:

Place the above mongod.conf file in some directory and give following commands.
Some location needed to be given inside the file for that to act as DB.

After downloading and placing mongo in your directories, open CMD with admistrator privilages, from your bin directory.
Then give the below commands so that mongo db will be started.

If you want to access the DB, we can download studio3t and connect to the DB.

sc.exe create MongoDB binPath= "\"D:\softwares\MongoDb\bin\mongod.exe\" --service --config=\"D:\data\mongod.conf\"" DisplayName= "MongoDB" start= "auto"

mongod.exe --config "D:\data\mongod.conf" 
