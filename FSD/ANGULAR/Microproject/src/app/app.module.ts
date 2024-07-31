import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyMicrocomponentComponent } from './my-microcomponent/my-microcomponent.component';
import { FormsModule } from '@angular/forms';
import { LeftComponent } from './left/left.component';
import { RightComponent } from './right/right.component';

@NgModule({
  declarations: [
    AppComponent,
    MyMicrocomponentComponent,
    LeftComponent,
    RightComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
