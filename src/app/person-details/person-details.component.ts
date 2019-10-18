import { Person } from './../person';
import { Component, OnInit, Input } from '@angular/core';
import { PersonService } from '../person.service';
import { PersonListComponent } from '../person-list/person-list.component';

@Component({
  selector: 'app-person-details',
  templateUrl: './person-details.component.html',
  styleUrls: ['./person-details.component.css']
})
export class PersonDetailsComponent implements OnInit {

  @Input() person: Person;

  constructor(private personService: PersonService, private listComponent: PersonListComponent) { }

  ngOnInit() {
  }

}