import { Component } from '@angular/core';

@Component({
  selector: 'app-left',
  templateUrl: './left.component.html',
  styleUrl: './left.component.css'
})
export class LeftComponent {
  shoety:string;
  shoeclr:String;
  shoesize:string;

  constructor(){
    this.shoety = "";
    this.shoeclr = "";
    this.shoesize="";
  }
}
