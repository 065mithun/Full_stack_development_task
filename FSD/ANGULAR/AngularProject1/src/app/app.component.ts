import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'AngularProject1';
  name : string;
  age : number;
  email : string;
  img : string;

  constructor(){
    this.name = "Mithun";
    this.age = 21;
    this.email = "vanithakumar521983@gmail.com";
    this.img = "https://upload.wikimedia.org/wikipedia/en/thumb/9/93/Burj_Khalifa.jpg/1200px-Burj_Khalifa.jpg";
  }

  Changename(){
    this.name= "Kumar";
  }
  Changeage(){
    this.age=20;
  }
  Changeemail(){
    this.email = "mithunkcse2022@ksrce.ac.in";
  }
  Changeimage(){
    this.img= "https://static.israel21c.org/www/uploads/2023/01/shutterstock_783317635-e1673245880444-1520x855.jpg";
  }
}
