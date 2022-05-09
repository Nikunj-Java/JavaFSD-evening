import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { DemoComponent } from './demo/demo.component';
import { HomeComponent } from './home/home.component';
import { PipedemoComponent } from './pipedemo/pipedemo.component';

const routes: Routes = [
  //path to fredirect
  {"path":"home",component:HomeComponent},
  {"path":"about",component:AboutusComponent},
  {"path":"contact",component:ContactusComponent},
  {"path":"demo",component:DemoComponent},
  {"path":"pipe",component:PipedemoComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
