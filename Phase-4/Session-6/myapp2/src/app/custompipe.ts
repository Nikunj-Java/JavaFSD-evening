
import { Pipe, PipeTransform } from "@angular/core";
import { pipe } from "rxjs";

@Pipe({name:'changeString'})
export class CustomPipe implements
PipeTransform
{

   transform(value:string,Character:string){
       return value.split(Character).join("-")
   }

}