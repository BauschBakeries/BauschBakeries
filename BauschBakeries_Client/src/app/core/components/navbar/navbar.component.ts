import { Component } from '@angular/core';
import { NavButtonComponent } from './nav-button/nav-button.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faBars } from '@fortawesome/free-solid-svg-icons';

@Component({
  standalone: true,
  selector: 'app-navbar',
  imports: [NavButtonComponent, FontAwesomeModule],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.scss',
})
export class NavbarComponent {
  faBars = faBars;
}
