import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  //template:`<app-server></app-server>
  //<app-server></app-server>`,
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {

  allowsNewServer = false;
  serverCreationStatus="No Server was created";
  serverName = "Test server";
  serverCreated = false;

  constructor() {
    setTimeout(()=> {
      this.allowsNewServer = true;
    }, 2000);
   }

  ngOnInit() {
  }

  onCreateSever(){
    this.serverCreated = true;
    this.serverCreationStatus = "Server was Created " + this.serverName;
  }

  onUpdateServerName(event: any){
this.serverName =    (<HTMLInputElement>event.target).value;
  }

}
