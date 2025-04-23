import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { NgZorroAntdModule } from './NgZorroAntdModule';

import { DashboardOutline, DollarOutline, FallOutline } from '@ant-design/icons-angular/icons';
import { NzIconModule } from 'ng-zorro-antd/icon';
import { ExpenseComponent } from './components/expense/expense.component';

const icons = [DashboardOutline, DollarOutline, FallOutline];



@NgModule({
  declarations: [
    AppComponent,
    ExpenseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    NgZorroAntdModule,
    
    NzIconModule.forRoot(icons)

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
