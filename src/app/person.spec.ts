import { TestBed } from '@angular/core/testing';
import { Person } from './person.service';

describe('PersonService', () => {

  beforeEach(() => TestBed.configureTestingModule({}));
  
  it('should create an instance', () => {
    const service: PersonService = TestBed.get(PersonService);
    expect(new Person()).toBeTruthy();
  });
});