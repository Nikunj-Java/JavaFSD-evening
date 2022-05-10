import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserClass } from './userclass';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  //url: "https://jsonplaceholder.typicode.com/users"

  url:string = "https://jsonplaceholder.typicode.com/users";

  //url:string="./assests/question.json"

  //inject the dependency 
  constructor(private http: HttpClient) { }

  getAllUsers():Observable<UserClass[]>{
    return this.http.get<UserClass[]>(this.url);
  }
}
