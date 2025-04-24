import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ExpenseService } from '../../services/expense/expense.service';
import { NzMessageService } from 'ng-zorro-antd/message';

@Component({
  selector: 'app-expense',
  standalone: false,
  templateUrl: './expense.component.html',
  styleUrls: ['./expense.component.css']
})
export class ExpenseComponent implements OnInit {

  expenseForm!: FormGroup;

  listOfCategory: string[] = [
    "Education",
    "Groceries",
    "Health",
    "Subscription",
    "Takeaways",
    "Clothing",
    "Travelling",
    "Other"
  ];

  constructor(
    private fb: FormBuilder,
    private expenseService: ExpenseService,
    private message: NzMessageService,
  ) {}

  ngOnInit() {
    this.expenseForm = this.fb.group({
      title: [null, Validators.required],
      amount: [null, Validators.required],
      date: [null, Validators.required],
      category: [null, Validators.required],
      description: [null, Validators.required],
    });
  }

  submitForm() {
    if (this.expenseForm.valid) {
      this.expenseService.postExpense(this.expenseForm.value).subscribe(
        res => {
          this.message.success("Expense posted successfully!", { nzDuration: 5000 });
          this.expenseForm.reset(); // Optional: clear the form after success
        },
        error => {
          this.message.error("Error while posting expense.", { nzDuration: 5000 });
        }
      );
    } else {
      this.message.warning("Please fill all the required fields.", { nzDuration: 5000 });
    }
  }
}