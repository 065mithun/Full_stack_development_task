import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MicroProject1';
  shoety : string;
  shoesize : string;
  shoeclr : string;
  s : string;

  constructor(){
    this.shoety = "";
    this.shoesize = "";
    this.shoeclr = "";
    this.s="";
  }

  save(){
    this.s= this.shoety+" - "+this.shoesize+" - "+this.shoeclr+"";
  }


}
