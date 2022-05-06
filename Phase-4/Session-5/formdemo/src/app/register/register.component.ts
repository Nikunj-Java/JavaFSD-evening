import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  //declare formgroup variables
  registerForm:FormGroup;

  //declare boolean variable to get form submitted or not
  submitted:boolean=false;

  //inject formbuilder dependency to create form with validators
  constructor(private builder: FormBuilder) { }

  //when component initiate we will write code here to build form with validators
  ngOnInit(): void {

    this.registerForm=this.builder.group({
      firstName:["",Validators.required],
      lastName:["",Validators.required],
      email:["",[Validators.required,Validators.email]],
      password:["",[Validators.required,Validators.minLength(8)]]
    });

  }

  //when user will click omn submit button
  OnSubmit(){

    this.submitted=true;
    if(this.registerForm.invalid)
      return;
    else
      alert("Form Submitted and Send For Approval")

  }

  ///to access form control in view to display the error
  get f(){
    return this.registerForm.controls;
  }

}
