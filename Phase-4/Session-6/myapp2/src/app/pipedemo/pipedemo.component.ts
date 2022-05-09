import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipedemo',
  templateUrl: './pipedemo.component.html',
  styleUrls: ['./pipedemo.component.css']
})
export class PipedemoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  name:string="My Name is Nikunj And I am JAVA FSD Trainer";
  pi:number=3.1415927;
  a=0.12345;
  b=9876.5432;
  today= new Date();
  object={name:"nikunj",email:"nikunj@gmail.com",address:"mumbai"};

  cust:string="Welcome to the World of Custom Pipes"

}
