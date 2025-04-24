import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';  // Ensure ReactiveFormsModule is imported here
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { NgZorroAntdModule } from './NgZorroAntdModule';
import { ExpenseComponent } from './components/expense/expense.component';
import { NzIconModule } from 'ng-zorro-antd/icon';

@NgModule({
  declarations: [
    AppComponent,
    ExpenseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,  // You can keep this if you're using template-driven forms
    ReactiveFormsModule,  // Make sure this is imported for formGroup
    HttpClientModule,
    BrowserAnimationsModule,
    NgZorroAntdModule,
    NzIconModule.forRoot([]),  // Keep your icons import here
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
