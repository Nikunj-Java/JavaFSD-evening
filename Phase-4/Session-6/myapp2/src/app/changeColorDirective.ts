import { Directive, ElementRef } from "@angular/core";

@Directive({
    selector:'[changecolor]'
})

export class changeColorDirective{
    constructor(er:ElementRef){
        er.nativeElement.style.color="red";
    }
}