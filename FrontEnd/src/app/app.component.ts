import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { DashboardComponentComponent } from './dashboard-component/dashboard-component.component';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, DashboardComponentComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'frontend';
}
