import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  count = 0;
  text = '';

  pessoas = [
      {
        nome: "Joao",
        sobrenome: "Vieira"
      },
      {
        nome: "Maria",
        sobrenome: "Silva"
      },
      {
      nome: "Pedro",
      sobrenome: "Soares"
      },
      {
      nome: "Sofia",
      sobrenome: "Vieira"
      }
];
  constructor(){

  }

  ngOnInit(): void {
    let interval = setInterval(() => {
      this.count++;
      if(this.count === 10){
        clearInterval(interval)
      }
    }, 1000)
  }

  clicou(nome: string): void {
    console.log("Quem clicou:", nome);
  }
}
