import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PersonListComponent } from './person-list/person-list.component';
import { PersonDetailsComponent } from './person-details/person-details.component';

const routes: Routes = [
     { path: '', redirectTo: 'person', pathMatch: 'full' },
     { path: 'person', component: PersonListComponent },
    
    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }