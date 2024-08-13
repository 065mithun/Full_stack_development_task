import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'AngularProject1';
  // name : string;
  // age : number;
  // email : string;
  // img : string;
  // fname:string;
  // flag: boolean;
  // vehicle: string[];
  // selectedvec:string;
  // Mystyle:{};
  // MyClass:string;
  sum : number;
  sub : number;
  constructor(private calc:CalculatorService){
    this.sum = calc.getAddition(10,20);

    this.sub = calc.getSubtraction(20,10);

  
    // this.name = "Mithun";
    // this.age = 21;
    // this.email = "vanithakumar521983@gmail.com";
    // this.img = "https://upload.wikimedia.org/wikipedia/en/thumb/9/93/Burj_Khalifa.jpg/1200px-Burj_Khalifa.jpg";
    // this.fname = " ";
    // this.flag= true;
    // this.vehicle = ["Twowheeler","Threewheeler","FourWheeler"];
    // this.selectedvec = "";
    // this.Mystyle = {'width':'400px','height':'300px','border':'2px solid green','border-radius':'25px'};
    // this.MyClass="Myclass1";
  }

  // Changename(){
  //   this.name= "Kumar";
  // }
  // Changeage(){
  //   this.age=20;
  // }
  // Changeemail(){
  //   this.email = "mithunkcse2022@ksrce.ac.in";
  // }
  // Changeimage(){
  //   this.img= "https://static.israel21c.org/www/uploads/2023/01/shutterstock_783317635-e1673245880444-1520x855.jpg";
  // }
  // ChangeFlag(){
  //   this.flag= !this.flag;
  // }
  // setSelectedItem(vec : string){
  //     this.selectedvec = vec;
  // }
  // ChangeStyle(){
  //   this.Mystyle = {'width':'400px','height':'300px','border':'2px solid red','border-radius':'25px'};
  // }
  // ChangeClass(){
  //   this.MyClass = "Myclass2";
  // }
}
