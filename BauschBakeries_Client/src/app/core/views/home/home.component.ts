import { Component, OnInit } from '@angular/core';
import { CardComponent } from '@Shared/components/card/card.component';
import { ButtonComponent } from '@Shared/components/button/button.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faBreadSlice, faCake, faCookie, faSnowflake } from '@fortawesome/free-solid-svg-icons';
import { PromotionalItem } from '@Models/PromotionalItem';

@Component({
  standalone: true,
  selector: 'app-home',
  imports: [CardComponent, ButtonComponent, FontAwesomeModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
})
export class HomeComponent implements OnInit {

  promotionalList: PromotionalItem[] = [];

  promotionalJson = [
    { id: 1, name: 'Sweets', icon: 'faCookie', active: true },
    { id: 2, name: 'Breads', icon: 'faBreadSlice', active: true },
    { id: 3, name: 'Ceremonial', icon: 'faCake', active: true },
    { id: 4, name: 'Seasonal', icon: 'faSnowflake', active: true },
  ];

  iconMap: Record<string, any> = {
    faCookie: faCookie,
    faBreadSlice: faBreadSlice,
    faCake: faCake,
    faSnowflake: faSnowflake,
  };

  ngOnInit() {
    this.promotionalList = this.promotionalJson.map(
      (item) => new PromotionalItem(item.id, item.name, this.iconMap[item.icon], item.active)
    );
  }
}
