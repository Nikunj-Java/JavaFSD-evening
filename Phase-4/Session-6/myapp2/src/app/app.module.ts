import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { changeColorDirective } from './changeColorDirective';
import { HighlightDirective } from './HighlightDirectives';
import { UserService } from './user.service';
import { PipedemoComponent } from './pipedemo/pipedemo.component';
import { CustomPipe } from './custompipe';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { UserComponent } from './user/user.component';
import { UserdemoComponent } from './userdemo/userdemo.component';

@NgModule({
  declarations: [
    AppComponent,
    changeColorDirective,
    HighlightDirective,
    PipedemoComponent,
    CustomPipe,
    HomeComponent,
    AboutusComponent,
    ContactusComponent,
    UserComponent,
    UserdemoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
