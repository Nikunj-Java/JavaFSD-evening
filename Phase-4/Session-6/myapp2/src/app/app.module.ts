import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { changeColorDirective } from './changeColorDirective';
import { HighlightDirective } from './HighlightDirectives';
import { UserService } from './user.service';
import { PipedemoComponent } from './pipedemo/pipedemo.component';
import { CustomPipe } from './custompipe';

@NgModule({
  declarations: [
    AppComponent,
    changeColorDirective,
    HighlightDirective,
    PipedemoComponent,
    CustomPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
