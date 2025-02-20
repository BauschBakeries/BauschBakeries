import { Component } from '@angular/core';
import { CardComponent } from '@Shared/components/card/card.component';
import { ButtonComponent } from '@Shared/components/button/button.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faBreadSlice, faCookie } from '@fortawesome/free-solid-svg-icons';
import { PromotionalItem } from '@Models/PromotionalItem';

@Component({
  standalone: true,
  selector: 'app-home',
  imports: [CardComponent, ButtonComponent, FontAwesomeModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
})
export class HomeComponent {
  promotionalList: PromotionalItem[] = 
  [
    new PromotionalItem("Sweets", faCookie),
    new PromotionalItem("Breads", faBreadSlice)
  ];

  faCookie = faCookie;
}
