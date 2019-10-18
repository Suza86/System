import { Component, OnInit } from '@angular/core';
import { PersonService } from './person.service';
import { Person } from "./person";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [PersonService]
})

export class AppComponent implements OnInit {
   person: Person[];

  constructor(private personService: PersonService) { 
   this.person = [];
  } 
 
  getPersonList(): void {
         this.personService.getPersonList()
             .subscribe(
                 resultArray => this.person = resultArray,
                 error => console.log("Error :: " + error)
             )
  }

 ngOnInit(): void {
         this.getPersonList();
 }
}
