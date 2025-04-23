import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ExpenseComponent } from './components/expense/expense.component';
// import { IncomeComponent } from './components/income/income.component';  // ⬅️ Add this
// import { DashboardComponent } from './components/dashboard/dashboard.component';  // ⬅️ Add this

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },  // ⬅️ Default route
  // { path: 'dashboard', component: DashboardComponent },
  // { path: 'income', component: IncomeComponent },
  { path: 'expense', component: ExpenseComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
